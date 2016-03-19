package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 18/11/2015.
 */
public class MessageDisconnect extends MessageModel {
    public MessageDisconnect() {}
    public MessageDisconnect(String pseudo, String id) {
        super(pseudo, id);
    }
}
