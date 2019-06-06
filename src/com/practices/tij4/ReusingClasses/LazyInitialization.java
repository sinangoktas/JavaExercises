package com.practices.tij4.ReusingClasses;

public class LazyInitialization {

    private Simple simple;

    public static void main(String[] args) {
        new LazyInitialization().instantiateSimple();

    }

    public void instantiateSimple() {
        if(simple == null) {
            simple = new Simple();
            System.out.printf("Simple object lazy initialised");
        }
    }
}


class Simple {

}
