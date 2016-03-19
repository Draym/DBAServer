package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 19/03/2016.
 */
public class MessageStatePlayer extends MessageModel {
    private float life;
    private int ki;
    private int energy;

    public MessageStatePlayer() {
    }

    public float getLife() {
        return this.life;
    }

    public int getKi() {
        return this.ki;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setLife(float life) {
        this.life = life;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}