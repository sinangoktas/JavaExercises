package com.main.InputOutput.special_topic_1;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
   This program prints all lines from a web page that contain
   references to other web sites.
*/
public class WebPageReader
{
   public static void main(String[] args) throws IOException
   {
      String address = "https://theguardian.com/uk";
      URL pageLocation = new URL(address);
      Scanner in = new Scanner(pageLocation.openStream());
      while (in.hasNext())
      {
         String line = in.next();
         if (line.contains("href=\"http://")) 
         {
            int from = line.indexOf("\"");
            int to = line.lastIndexOf("\"");
            System.out.println(line.substring(from + 1, to));
         }
      }
   }
}
