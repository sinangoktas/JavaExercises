package com.example.idea.SimpleJavaExercises.InnerClasses;

public class Outer_4 {

    // Outer with static fields and methods
    private static String x = "outer";

    // Method-local inner class
    public static void doStuff() {

        class Inner {
            public void seeOuter() {
                System.out.println("x is: " + x);
            }
        }

        Inner i = new Inner();
        i.seeOuter();
    }

    public static void main(String[] args) {
        Outer_4.doStuff();
    }
}
