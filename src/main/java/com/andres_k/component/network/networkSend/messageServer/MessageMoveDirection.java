package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.game.EDirection;
import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 29/03/2016.
 */
public class MessageMoveDirection extends MessageModel {
    private EDirection direction;

    public MessageMoveDirection() {
    }

    public EDirection getDirection() {
        return this.direction;
    }

    public void setDirection(EDirection direction) {
        this.direction = direction;
    }
}
