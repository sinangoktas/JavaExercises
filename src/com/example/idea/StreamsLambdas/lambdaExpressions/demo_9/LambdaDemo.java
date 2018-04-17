package com.example.idea.StreamsLambdas.lambdaExpressions.demo_9;

public class LambdaDemo {

    public static void main(String[] args) {

        // A local variable that can be captured.
        int num = 10;
        MyFunc myLambda = (n) -> {
            // This use of num is OK. It does not modify num.
            int v = num + n;
            // However, the following is illegal because it attempts
            // to modify the value of num.
            // num++;
            return v; };
        // The following line would also cause an error, because
        // it would remove the effectively final status from num.
        // num = 9;

        System.out.println(myLambda.func(5));

    }
}
