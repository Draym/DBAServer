package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.game.Player;
import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 18/11/2015.
 */
public class MessageNewPlayer extends MessageModel {
    private String playerType;
    private String gameId;
    private float x;
    private float y;

    public MessageNewPlayer() {}
    public MessageNewPlayer(Player player) {
        super(player.getPseudo(), player.getNetworkId());
        this.gameId = player.getGameId();
        this.playerType = player.getPlayerType();
        this.x = player.getX();
        this.y = player.getY();
    }

    public String getPlayerType() {
        return this.playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
