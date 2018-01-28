package com.example.idea.Interfaces.Intro;

public class DefaultMethodDemo {

    public static void main(String[] args) {
        MyClassImpl obj = new MyClassImpl();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());

        MyIF mf = new MyClassImpl();
        System.out.println(mf.getNumber());
        System.out.println(mf.getString());

        MyIF mf2 = new MyClassImpl() {
            @Override
            public int getNumber() {
                return 99;
            }

            @Override
            public String getString() {
                return "Changed String";
            }
        };

        System.out.println(mf2.getNumber());
        System.out.println(mf2.getString());


    }
}
