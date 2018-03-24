package com.example.idea.CollectionsFramework.sets;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
   This program checks which words in a file are not present in a dictionary.
*/
public class SpellCheck
{
   public static void main(String[] args) 
      throws FileNotFoundException
   {
      // Read the dictionary and the document
      Set<String> dictionaryWords = readWords("./words.txt");
      Set<String> documentWords = readWords("./alice30.txt");

      // Print all words that are in the document but not the dictionary
      int count = 0;
      for (String word : documentWords) {
         if(!dictionaryWords.contains(word)) {
            System.out.println(word);
            count++;
         }
      }

      System.out.println(count + " words in document not found in the dictionary");
   }

   /**
      Reads all words from a file.
      @param filename the name of the file
      @return a set with all lowercased words in the file. Here, a 
      word is a sequence of upper- and lowercase letters.
   */
   public static Set<String> readWords(String filename)
      throws FileNotFoundException
   {
      Set<String> distinctWords = new HashSet<>();
      Scanner in = new Scanner(new File(filename));
      // Use any characters other than a-z or A-Z as delimiters
      in.useDelimiter("[^a-zA-Z]+");
      while(in.hasNext()) {
         distinctWords.add(in.next().toLowerCase());
      }
      return distinctWords;
   }
}
