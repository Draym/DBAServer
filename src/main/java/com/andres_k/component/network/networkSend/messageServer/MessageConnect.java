package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 18/11/2015.
 */
public class MessageConnect extends MessageModel {
    private String playerType;
    private String gameId;

    public MessageConnect() {}

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }
}
