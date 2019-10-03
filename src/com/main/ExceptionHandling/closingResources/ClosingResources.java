package com.main.ExceptionHandling.closingResources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClosingResources
{
   public static void main(String[] args) throws FileNotFoundException
   {
      File inFile = new File("./test1.txt");
      File outFile = new File("./output.txt");

      try (Scanner in = new Scanner(inFile); PrintWriter out = new PrintWriter(outFile))
      // catch block is not needed
      {
         while (in.hasNextLine()) {
            String result = process(in.nextLine());
            out.println(result);

         }
         //Both in.close() and out.close() are called here
         in.close();
         out.close();
      }

   }

   public static String process(String line)
   {
      int value = Integer.parseInt(line);
      value++;
      return "" + value;
   }
}