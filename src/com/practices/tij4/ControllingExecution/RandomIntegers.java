package com.practices.tij4.ControllingExecution;

import java.util.Random;

public class RandomIntegers {

    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            compare(random.nextInt(), random.nextInt());
        }

        while (true) {
            compare(random.nextInt(), random.nextInt());
        }
    }

    static void compare(int a, int b) {
        if (a > b) {
            System.out.println(String.format("%d > %d", a, b));
        } else if (a < b) {
            System.out.println(String.format("%d < %d", a, b));
        } else {
            System.out.println(String.format("%d = %d! Woww", a, b));
        }
    }
}
