package com.main.StreamsLambdas.lambdaExpressions.demo_10;

public class MethodRefDemo {
    // This method has a functional interface as the type of
// its first parameter. Thus, it can be passed any instance
// of that interface, including a method reference.


    private static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Lambdas add power to Java";
        String outStr;

        // Here, a method reference to strReverse is passed to stringOp().
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);

        /*
        Here, a reference to the static method strReverse(), declared inside MyStringOps,
        is passed as the first argument to stringOp(). This works because strReverse
        is compatible with the StringFunc functional interface.
        Thus, the expression
        MyStringOps::strReverse evaluates to a reference to an object in which strReverse
        provides the implementation of func() in StringFunc.
         */


    }


}
