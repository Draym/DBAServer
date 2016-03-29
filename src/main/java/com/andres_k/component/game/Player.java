package com.andres_k.component.game;

import com.esotericsoftware.kryonet.Connection;

/**
 * Created by andres_k on 19/03/2016.
 */
public class Player {
    private String networkId;
    private String gameId;
    private String pseudo;
    private String playerType;
    private Connection connection;
    private float x;
    private float y;

    public Player(String networkId, String pseudo, String gameId, String playerType, Connection c, float x, float y) {
        this.networkId = networkId;
        this.gameId = gameId;
        this.pseudo = pseudo;
        this.playerType = playerType;
        this.connection = c;
        this.x = x;
        this.y = y;
    }

    public String getNetworkId() {
        return this.networkId;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public String getPlayerType() {
        return this.playerType;
    }

    public Connection getConnection() {
        return this.connection;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }
}
