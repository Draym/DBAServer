package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.game.input.EInput;
import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 30/03/2016.
 */
public class MessageInputPlayer extends MessageModel {
    private EInput event;
    private EInput input;

    public MessageInputPlayer() {
    }

    public EInput getEvent() {
        return this.event;
    }

    public void setEvent(EInput event) {
        this.event = event;
    }

    public EInput getInput() {
        return this.input;
    }

    public void setInput(EInput input) {
        this.input = input;
    }
}
