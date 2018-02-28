package com.example.idea.StreamsLambdas.transformingStreams;
import java.util.stream.Stream;
import static com.example.idea.StreamsLambdas.utility.StreamPrinter.show;

public class Streams
{
   public static void main(String[] args)
   {
      Stream<String> words = Stream.of("A", "Tale", "of", "Two", "Cities");
      Stream<String> lowerCaseWords = words.map(w -> w.toLowerCase());
      show("Mapping to lowercase: ", lowerCaseWords);

      lowerCaseWords = Stream.of("A", "Tale", "of", "Two", "Cities")
         .map(w -> w.toLowerCase());

      Stream<String> consonantsOnly = lowerCaseWords.map(w -> w.replaceAll("[aeiou]", ""));
      show("Removing vowels", consonantsOnly);

      consonantsOnly = Stream.of("A", "Tale", "of", "Two", "Cities")
         .map(w -> w.toLowerCase())
         .map(w -> w.replaceAll("[aeiou]", ""));

      Stream<Integer> consonantCount = consonantsOnly.map(w -> w.length());
      show("Counting consonants", consonantCount);

      words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "));
      Stream<String> cWords = words.filter(w -> w.substring(0, 1).equals("c"));
      show("Words with c", cWords);

      words = Stream.of(
         "how much wood could a wood chuck chuck".split(" "));
      Stream<String> distinctWords = words.distinct();
      show("Distinct words", distinctWords);

      distinctWords = Stream.of(
         "how much wood could a wood chuck chuck".split(" "))
         .distinct();
      Stream<String> sortedWords = distinctWords.sorted();
      show("Sorted words", sortedWords);
   }

}
