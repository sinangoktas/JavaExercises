package com.main.StreamsLambdas.lambdaExpressions.demo_11;

//This class defines an instance method called strReverse().

public class MyStringOps {

    String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }

}
