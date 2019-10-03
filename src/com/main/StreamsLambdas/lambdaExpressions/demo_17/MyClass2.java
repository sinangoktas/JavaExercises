package com.main.StreamsLambdas.lambdaExpressions.demo_17;

// A simple, non-generic class.
public class MyClass2 {
    String str;
    // A constructor that takes an argument.
    MyClass2(String s) {
        str = s;
    }

    // The default constructor. This constructor is NOT used by this program.
    MyClass2() {
        str = "";
    }

    // ...
    String getVal() {
        return str;
    }
}
