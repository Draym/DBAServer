package com.andres_k;

import com.andres_k.master.MasterServer;

import java.io.IOException;

/**
 * Created by andres_k on 19/03/2016.
 */
public class Main {

    public static void main(String args[]) {
        MasterServer master = new MasterServer();

        try {
            master.start();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
