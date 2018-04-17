package com.example.idea.StreamsLambdas.lambdaExpressions.demo_4;

// This block lambda computes the factorial of an int value.

public class LambdaDemo
{
   public static void main(String[] args)
   {

      NumericFunc factorial = (n) -> {
         int result = 1;

         for(int i = 1; i <= n; i++) {
            result = i * result;

         }

         return result;
      };

      System.out.println("The factorial of 3 is " + factorial.func(3));
      System.out.println("the factorial of 5 is " + factorial.func(5));

   }

}
