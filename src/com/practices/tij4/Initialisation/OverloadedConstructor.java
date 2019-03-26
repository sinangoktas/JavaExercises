package com.practices.tij4.Initialisation;

public class OverloadedConstructor {

    public OverloadedConstructor() {
        System.out.println("This is the default constructor");
    }

    public OverloadedConstructor(String s) {
        System.out.println("This is the overloaded constructor" + s);
    }

    public static void main(String[] args) {
        new OverloadedConstructor();
        new OverloadedConstructor("!");
    }
}
