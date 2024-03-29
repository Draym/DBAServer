package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.game.actions.EAnimation;
import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 18/11/2015.
 */
public class MessageActionPlayer extends MessageModel {
    private EAnimation action;
    private int index;

    public MessageActionPlayer() {
    }

    public EAnimation getAction() {
        return this.action;
    }

    public int getIndex() {
        return this.index;
    }

    public void setAction(EAnimation action) {
        this.action = action;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
