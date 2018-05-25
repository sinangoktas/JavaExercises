package com.example.idea.SimpleJavaBits.InnerClasses;

public class Outer_2 {

    private int x = 100;

    public void makeInner() {
        Inner i = new Inner();
        i.seeOuter();
    }

    // member inner class: it has access to all methods, fields and Outer's this reference
    class Inner {
        public void seeOuter() {
            System.out.println("Outer x is: " + x);
            System.out.println("Inner class reference is: " + this);
            System.out.println("Outer class reference is: " + Outer_2.this);
        }

    }

    public static void main(String[] args) {
        Outer_2 o = new Outer_2();
        o.makeInner();
    }
}
