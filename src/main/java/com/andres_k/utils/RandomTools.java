package com.andres_k.utils;

import java.util.Random;

/**
 * Created by andres_k on 31/03/2015.
 */
public class RandomTools {
    private static Random random = new Random();

    public static int getInt() {
        return random.nextInt();
    }

    public static int getInt(int bound) {
        if (bound > 0) {
            return random.nextInt(bound);
        }
        return 1;
    }

    public static float getFloat() {
        return random.nextFloat();
    }

    public static boolean getBoolean() {
        return random.nextBoolean();
    }

    public static boolean isSuccess(float percent) {
        int random = getInt(100);
        Console.write("random: " + random + " ? " + percent);
        return random < percent;
    }
}
