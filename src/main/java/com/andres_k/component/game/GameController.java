package com.andres_k.component.game;

import com.andres_k.component.network.networkSend.MessageModel;
import com.andres_k.component.network.networkSend.messageServer.*;
import com.andres_k.utils.Console;
import com.andres_k.utils.RandomTools;
import com.esotericsoftware.kryonet.Connection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andres_k on 19/03/2016.
 */
public class GameController {
    private List<Player> players;
    private List<Connection> observers;
    private int maxPlayer;

    public GameController(int maxPlayer) {
        this.maxPlayer = maxPlayer;
        this.players = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    // GAME

    public void launchGame() {
        this.sendTaskToAll(new MessageGameLaunch());
    }
    // TASK

    public void executeTask(Connection c, MessageModel received) {
        Console.write("Received: " + received + "connection: " + c);
        if (received instanceof MessageConnect) {
            this.doConnection(c, (MessageConnect) received);
        } else if (received instanceof MessageDisconnect) {
            this.doDisconnect(c, (MessageDisconnect) received);
        } else if (received instanceof MessageStatePlayer || received instanceof MessageActionPlayer || received instanceof MessageMoveDirection) {
            this.sendTaskToAllExcept(c, received);
        }
    }


    private void doConnection(Connection c, MessageConnect task) {
        this.sendAllPlayersTo(c);
        if (this.players.size() < this.maxPlayer) {
            this.removeObserver(c);

            int sizeX = 1900 / this.maxPlayer;
            int posX = 0;

            for (int i = 0; i < this.players.size(); ++i) {
                posX += sizeX;
            }
            int randomX = RandomTools.getInt(sizeX - 100) + posX + 50;
            Console.write("sizeX: " + sizeX + " , posX: " + posX + " ,  randomX: " + randomX);
            Player player = new Player(task.getId(), task.getPseudo(), task.getGameId(), task.getPlayerType(), c, randomX, 740);

            this.players.add(player);

            this.sendTaskToAll(new MessageNewPlayer(player));
            if (this.players.size() == this.maxPlayer) {
                this.launchGame();
            }
        }
    }

    private void doDisconnect(Connection c, MessageDisconnect task) {
        this.sendTaskToAllExcept(c, new MessageDeletePlayer(task.getPseudo(), task.getId()));
        this.deleteConnection(c);
    }

    // SEND
    private void sendTaskToAllExcept(Connection c, MessageModel task) {
        for (Player player : this.players) {
            if (!this.checkEqualsConnection(player.getConnection(), c)) {
                Console.write("send to " + player);
                player.getConnection().sendTCP(task);
            }
        }
    }

    private void sendAllPlayersTo(Connection c) {
        this.players.forEach(player -> c.sendTCP(new MessageNewPlayer(player)));
    }

    private void sendTaskToAll(MessageModel task) {
        this.players.forEach(player -> player.getConnection().sendTCP(task));
    }

    // MANAGE
    public void addConnection(Connection c) {
        if (this.observers.stream().noneMatch(item -> this.checkEqualsConnection(item, c))) {
            Console.write("New connection: " + c);
            this.observers.add(c);
        }
    }

    public boolean deleteConnection(Connection c) {
        Console.write("Disconnected: " + c);
        for (int i = 0; i < this.players.size(); ++i) {
            if (this.checkEqualsConnection(this.players.get(i).getConnection(), c)) {
                Console.write("DeletePlayer: " + c);
                this.players.remove(i);
                return true;
            }
        }
        for (int i = 0; i < this.observers.size(); ++i) {
            if (this.checkEqualsConnection(this.observers.get(i), c)) {
                Console.write("DeleteObserver: " + c);
                this.observers.remove(i);
                return true;
            }
        }
        return false;
    }

    public void removeObserver(Connection c) {
        for (int i = 0; i < this.observers.size(); ++i) {
            if (this.checkEqualsConnection(this.observers.get(i), c)) {
                this.observers.remove(i);
                --i;
            }
        }
    }

    public boolean checkEqualsConnection(Connection a, Connection b) {
        return a.getID() == b.getID();
    }
}
