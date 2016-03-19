package com.andres_k.component.network;

import com.andres_k.component.game.GameController;
import com.andres_k.component.network.networkSend.MessageModel;
import com.andres_k.component.network.networkSend.NetworkRegister;
import com.andres_k.utils.NetworkConfig;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Server;

import java.io.IOException;

/**
 * Created by andres_k on 19/03/2016.
 */
public class NetworkController extends Listener {
    private Server server;
    private GameController game;

    public NetworkController(GameController game) {
        this.server = new Server();
        this.game = game;
    }

    public void startServer() throws IOException {
        //this.server.getKryo().register(NetworkRegister.class);
        NetworkRegister.register(this.server);
        this.server.bind(NetworkConfig.tcpPort, NetworkConfig.udpPort);
        this.server.start();
        this.server.addListener(this);
    }

    public void stopServer() {
        this.server.stop();
    }

    @Override
    public void connected(Connection c) {
        this.game.addConnection(c);
    }

    @Override
    public void disconnected(Connection c) {
        this.game.deleteConnection(c);
    }

    @Override
    public void received(Connection c, Object received) {
        if (received instanceof MessageModel) {
            this.game.executeTask(c, (MessageModel) received);
        }
    }
}
