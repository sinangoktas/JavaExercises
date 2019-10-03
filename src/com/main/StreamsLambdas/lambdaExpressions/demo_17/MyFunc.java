package com.main.StreamsLambdas.lambdaExpressions.demo_17;

//Implement a simple class factory using a constructor reference.

public interface MyFunc<R, T> {
    R func(T n);
}