package com.example.idea.SimpleJavaExercises.InnerClasses;

public class Outer_3 {

    private String x = "outer";

    // Method-local inner class
    public void doStuff() {

        class Inner {
            public void seeOuter() {
                System.out.println("x is: " + x);
            }
        }

        Inner i = new Inner();
        i.seeOuter();
    }

    public static void main(String[] args) {
        Outer_3 o = new Outer_3();
        o.doStuff();
    }


}
