package com.example.idea.InputOutput.bigJava.section_4_5;

public class InsufficientFundsException extends IllegalArgumentException
{
   public InsufficientFundsException() {

   }

   public InsufficientFundsException(String message)
   {
      super(message);
   }
}
