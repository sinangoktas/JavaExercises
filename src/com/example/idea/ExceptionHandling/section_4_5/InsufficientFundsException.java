package com.example.idea.ExceptionHandling.section_4_5;

public class InsufficientFundsException extends IllegalArgumentException
{
   public InsufficientFundsException() {

   }

   public InsufficientFundsException(String message)
   {
      super(message);
   }
}
