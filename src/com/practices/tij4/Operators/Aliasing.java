package com.practices.tij4.Operators;

public class Aliasing {
    float f;

    public static void main(String[] args) {
        Aliasing a1 = new Aliasing();
        Aliasing a2 = new Aliasing();

        a1.f = 10f;
        a2.f = 33f;
        System.out.println(a1.f + " " + a2.f);

        a1 = a2;
        System.out.println(a1.f + " " + a2.f);

        a1.f = 27f;
        System.out.println(a1.f + " " + a2.f);

    }
}
