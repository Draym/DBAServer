package com.andres_k.component.game;

import com.esotericsoftware.kryonet.Connection;

/**
 * Created by andres_k on 19/03/2016.
 */
public class Player {
    private String id;
    private String pseudo;
    private String playerType;
    private Connection connection;

    public Player(String id, String pseudo, String playerType, Connection c) {
        this.id = id;
        this.pseudo = pseudo;
        this.playerType = playerType;
        this.connection = c;
    }

    public String getId() {
        return this.id;
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
}
