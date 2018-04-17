package com.example.idea.StreamsLambdas.lambdaExpressions.demo_3;

// This lambda expression determines if one number is a factor of another.

public class LambdaDemo {

    /*
    Whenever more than one parameter is required, the parameters are specified, separated by commas,
    in a parenthesised list on the left side of the lambda operator.
     */

    public static void main(String[] args) {

        NumericTest isFactor = (n, d) -> (n % d == 0);

        if(isFactor.test(9, 3))
            System.out.println("3 is a factor of 10");
        if (isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");



    }
}
