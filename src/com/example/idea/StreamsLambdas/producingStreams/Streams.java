package com.example.idea.StreamsLambdas.producingStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static com.example.idea.StreamsLambdas.utility.StreamPrinter.show;

public class Streams
{
   public static void main(String[] args) throws IOException
   {
      Stream<String> words = Stream.of("Mary", "had", "a", "little", "lamb");
      show("A stream of individually specified words", words);

      Stream<Integer> digits = Stream.of(3, 1, 4, 1, 5, 9);
      show("A stream of individually specified digits", digits);

      Integer[] digitArray = { 3, 1, 4, 1, 5, 9, 6};
      digits = Stream.of(digitArray);
      show("A stream of digits from an array", digits);

      List<String> wordList = new ArrayList<>();
      // Populate wordList
      wordList.add("Hello");
      wordList.add("World");
      words = wordList.stream();
      show("A stream of words from a list", words);
      
      try (Stream<String> lines = Files.lines(Paths.get("countries.txt")))
      {
         show("A stream of lines from a file", lines);
      }
   }


}
