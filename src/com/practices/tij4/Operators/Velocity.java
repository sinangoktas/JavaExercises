package com.practices.tij4.Operators;

public class Velocity {

    public static void main(String[] args) {

        System.out.println(calculateVelocity(100, 5));
        System.out.println(calculateVelocity(130, 13));

    }

    static double calculateVelocity(final double distance, final double time) {
        return distance / time;
    }
}
