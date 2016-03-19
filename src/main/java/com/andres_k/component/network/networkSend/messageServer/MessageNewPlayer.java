package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 18/11/2015.
 */
public class MessageNewPlayer extends MessageModel {
    private String playerType;

    public MessageNewPlayer() {}
    public MessageNewPlayer(String pseudo, String id, String playerType) {
        super(pseudo, id);
        this.playerType = playerType;
    }

    public String getPlayerType() {
        return this.playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }
}
