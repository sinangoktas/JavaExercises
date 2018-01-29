package com.example.idea.InputOutput.javaEarlyObjs.handlingInputErrors;

import java.io.IOException;

/**
   This class reports bad input data.
*/
public class BadDataException extends IOException
{
   public BadDataException() {

   }

   public BadDataException(String message)
   {
      super(message);

   }
}
