package com.practices.tij4.EverythingIsAnObject;

public class Incrementable {

    static void increment() {

        StaticTest.i++;

    }

    void increment2() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        // You can call a static method directly from a static scope
        increment();
        System.out.println(StaticTest.i);

        increment();
        StaticTest st = new StaticTest();
        StaticTest st2 = new StaticTest();

        System.out.println(st.i == st2.i);


        // You have to initialize an object to be able
        // to call a non-static method from a static scope
        Incrementable incrementable = new Incrementable();
        incrementable.increment2();
        System.out.println(st.i);

        System.out.println(st.i == StaticTest.i);

    }
}
