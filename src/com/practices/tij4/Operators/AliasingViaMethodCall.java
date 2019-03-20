package com.practices.tij4.Operators;

public class AliasingViaMethodCall {

    public static void main(String[] args) {

        Aliasing a = new Aliasing();
        a.f = 22f;
        System.out.println(a.f);

        setF(a);
        System.out.println(a.f);

    }

    static void setF(Aliasing b) {
        b.f = 11f;
    }
}
