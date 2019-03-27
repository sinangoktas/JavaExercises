package com.practices.tij4.Initialisation;

public class StringInstanceInitialisation {

    private String s;

    {
        s = "Initialise in non-static block";
        System.out.println(s);
    }

    public StringInstanceInitialisation() {
        s = "Initialise in constructor";
        System.out.println(s);
    }

    public static void main(String[] args) {
        new StringInstanceInitialisation();
    }
}
