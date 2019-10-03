package com.main.StreamsLambdas.lambdaExpressions.demo_16;

//Demonstrate a constructor reference with a generic class.
//MyFunc is now a generic functional interface.

public interface MyFunc<T> {
    MyClass<T> func(T n);
}
