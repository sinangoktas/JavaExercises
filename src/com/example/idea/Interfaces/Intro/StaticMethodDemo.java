package com.example.idea.Interfaces.Intro;

public class StaticMethodDemo {

    public static void main(String[] args) {
        int defNum = MyIF.getDefaultNumber();
        System.out.println(defNum);

        // we do not need an instance of a class to call a static method
        // same applies to static methods of an interface
        // and a static method can not be called from an instance of a class
        // because they are static - belongs to class/interface not an instance

    }
}
