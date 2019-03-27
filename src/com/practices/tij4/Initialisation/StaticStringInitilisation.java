package com.practices.tij4.Initialisation;

public class StaticStringInitilisation {
    static String s1 = "Initialised during declaration";
    static String s2;

    static {
        s2 = "Initialises by static block";
    }


    public static void main(String[] args) {
        System.out.println(s1);
        System.out.println(s2);
    }
}
