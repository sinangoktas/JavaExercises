package com.example.idea.SimpleJavaExercises.InnerClasses;

public class Outer_1 {

    // static nested class
    static class Inner {

        void go() {
            System.out.println("Inner class reference is: " + this);
        }
    }

    public static void main(String[] args) {

      Inner n = new Inner();
      n.go();

    }
}

