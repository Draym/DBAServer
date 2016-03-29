package com.andres_k.component.network.networkSend.messageServer;

import com.andres_k.component.network.networkSend.MessageModel;

/**
 * Created by andres_k on 19/03/2016.
 */
public class MessageStatePlayer extends MessageModel {
    private float life;
    private float ki;
    private float energy;
    private float x;
    private float y;

    public MessageStatePlayer() {
    }

    public float getLife() {
        return this.life;
    }

    public float getKi() {
        return this.ki;
    }

    public float getEnergy() {
        return this.energy;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setLife(float life) {
        this.life = life;
    }

    public void setKi(float ki) {
        this.ki = ki;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
}
