package com.practices.tij4.ReusingClasses;


class Art {

    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {

    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    /*
    Even if you don’t create a
constructor for Cartoon( ), the compiler will synthesize a default constructor for you that
calls the base class constructor.
     */

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();

        // Base class constructors are always called and called before derived-class constructors

    }


}
