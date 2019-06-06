package com.practices.tij4.ReusingClasses;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {

    /*
    If your base class doesn’t have default(no argument) const , or if you want to call a base-class constructor
that has an argument, you must explicitly write the calls to the base-class constructor using
the super keyword and the appropriate argument list.
     */
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
     Chess() {
         super(11);
         System.out.println("Chess constructor");
     }

    public static void main(String[] args) {
         Chess chess = new Chess();
    }
}
