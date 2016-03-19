package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 18/11/2015.
 */
public class MessageDeletePlayer extends MessageModel {
    public MessageDeletePlayer() {}
    public MessageDeletePlayer(String pseudo, String id) {
        super(pseudo, id);
    }
}
