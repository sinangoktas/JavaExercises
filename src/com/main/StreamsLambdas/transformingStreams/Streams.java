package com.main.StreamsLambdas.transformingStreams;
import com.main.StreamsLambdas.utility.StreamPrinter;

import java.util.stream.Stream;

public class Streams
{
   public static void main(String[] args)
   {
      Stream<String> words = Stream.of("A", "Tale", "of", "Two", "Cities");
      Stream<String> lowerCaseWords = words.map(w -> w.toLowerCase());
      StreamPrinter.show("Mapping to lowercase: ", lowerCaseWords);

      lowerCaseWords = Stream.of("A", "Tale", "of", "Two", "Cities")
         .map(w -> w.toLowerCase());

      Stream<String> consonantsOnly = lowerCaseWords.map(w -> w.replaceAll("[aeiou]", ""));
      StreamPrinter.show("Removing vowels", consonantsOnly);

      consonantsOnly = Stream.of("A", "Tale", "of", "Two", "Cities")
         .map(w -> w.toLowerCase())
         .map(w -> w.replaceAll("[aeiou]", ""));

      Stream<Integer> consonantCount = consonantsOnly.map(w -> w.length());
      StreamPrinter.show("Counting consonants", consonantCount);

      words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "));
      Stream<String> cWords = words.filter(w -> w.substring(0, 1).equals("c"));
      StreamPrinter.show("Words with c", cWords);

      words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "));
      Stream<String> distinctWords = words.distinct();
      StreamPrinter.show("Distinct words", distinctWords);

      distinctWords = Stream.of(
         "how much wood could a wood chuck chuck".split(" "))
         .distinct();
      Stream<String> sortedWords = distinctWords.sorted();
      StreamPrinter.show("Sorted words", sortedWords);
   }

}
