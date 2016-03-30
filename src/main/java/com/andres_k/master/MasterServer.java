package com.andres_k.master;

import com.andres_k.component.game.GameController;
import com.andres_k.component.network.NetworkController;

import java.io.IOException;

/**
 * Created by andres_k on 19/03/2016.
 */
public class MasterServer {
    private NetworkController network;
    private GameController game;
    private boolean isRunning;

    public MasterServer() {
        this.game = new GameController(3);
        this.network = new NetworkController(game);
        this.isRunning = true;
    }

    public void start() throws IOException, InterruptedException {
        this.network.startServer();
        while (this.isRunning) {
            Thread.sleep(100);
        }
    }
}
