package com.practices.tij4.ReusingClasses;

class A {
    A(){
        System.out.println("A const");
    }
}

class B {
    B() {
        System.out.println("B const");
    }
}

public class ClassC extends A {
    B b = new B();
    public static void main(String[] args) {
        ClassC classC = new ClassC();
    }
}
