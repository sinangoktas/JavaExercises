package com.example.idea.StreamsLambdas.lambdaExpressions.demo_11;

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

        // Create a MyStringOps object.
        MyStringOps strOps = new MyStringOps();

        // Now, a method reference to the instance method strReverse
        // is passed to stringOp().

        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println("Original string: " + inStr);

        /*
        In the program, notice that strReverse() is now an instance method of MyStringOps.
Inside main(), an instance of MyStringOps called strOps is created. This instance is
used to create the method reference to strReverse in the call to stringOp, as shown
again, here:
         */


    }

}
