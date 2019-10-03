package com.main.TDD.Introduction;

public class Arithmetic {
    private int myNumber;

    public Arithmetic() {
        myNumber = 0;
    }

   int multiply(int a, int b) {
        myNumber = a * b;
        return myNumber;
    }

   boolean isPositive(int a) {

        if(a > 0) {
            return true;
        }
        return false;
    }
}
