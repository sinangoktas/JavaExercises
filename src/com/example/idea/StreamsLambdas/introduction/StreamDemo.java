package com.example.idea.StreamsLambdas.introduction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamDemo
{
   public static void main(String[] args) throws IOException
   {
      Scanner in = new Scanner(new File("/home/cyn/IdeaProjects/JavaExercises/countries.txt"));
      // This file contains one country name per line
      List<String> wordList = new ArrayList<>();
      int numberOfCountries = 0;
      while(in.hasNext()) {
         wordList.add(in.next());
         numberOfCountries ++;
      }
      System.out.println("Number of countries is: " + numberOfCountries);

      // Traditional loop for counting the long words
      long count = 0;
      for (String w : wordList)
      {
         if (w.length() > 10) { count++; }
      }
      
      System.out.println("Long words: " + count);

      // The same computation with streams
      count = wordList.stream()
         .filter(w -> w.length() > 10)
         .count();

      System.out.println("Long words: " + count);
   }
}
