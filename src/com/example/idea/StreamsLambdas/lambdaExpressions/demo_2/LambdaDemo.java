package com.example.idea.StreamsLambdas.lambdaExpressions.demo_2;

// A functional interface reference can be used to execute any lambda expression that is compatible with it.

public class LambdaDemo {

    public static void main(String[] args) {

        // A lambda expression that tests if a number is even.
        NumericTest isEven = (n) -> (n % 2 == 0);
        if (isEven.test(10))
            System.out.println("10 is even");
        if(!isEven.test(9))
            System.out.println("9 is not even");

        // A lambda expression that tests if a number is non-negative.
        NumericTest isNonNeg = (n -> (n >= 0));
        if(isNonNeg.test(6))
            System.out.println("6 is non-negative");
        if(!isNonNeg.test(-6))
            System.out.println("-6 is negative");
    }
}
