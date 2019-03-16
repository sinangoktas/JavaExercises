package com.practices.tij4.EverythingIsAnObject;

public class Incrementable {

    static void increment() {

        StaticTest.i++;

    }

    void increment2() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        increment();
        System.out.println(StaticTest.i);

        increment();
        StaticTest st = new StaticTest();
        System.out.println(st.i);

        Incrementable incrementable = new Incrementable();
        incrementable.increment2();
        System.out.println(st.i);

        System.out.println(st.i == StaticTest.i);





    }
}
