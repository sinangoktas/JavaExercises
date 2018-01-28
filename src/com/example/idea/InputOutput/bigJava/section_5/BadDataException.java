package com.example.idea.InputOutput.bigJava.section_5;

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
