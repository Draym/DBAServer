package com.andres_k.utils;


/**
 * Created by andres_k on 13/03/2015.
 */
public class Console {

    public static void write(String message) {
        System.out.println(message);
    }

    public static void err(String locateClass, String locateMethod, String message) {
        System.err.println("Locate: [" + locateClass + "." + locateMethod + "] -> " + message);
    }
}
