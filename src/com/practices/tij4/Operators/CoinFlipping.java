package com.practices.tij4.Operators;

import java.util.Random;

public class CoinFlipping {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(flip());
        }
    }

    private static String flip() {
        Random random = new Random();
        return random.nextBoolean()? "Head" : "Tail";
    }
}
