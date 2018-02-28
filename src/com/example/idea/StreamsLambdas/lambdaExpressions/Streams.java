package com.example.idea.StreamsLambdas.lambdaExpressions;

import java.util.Comparator;
import java.util.stream.Stream;

import static com.example.idea.StreamsLambdas.utility.StreamPrinter.show;


public class Streams
{
   public static void main(String[] args)
   {
      Stream<String> words = Stream.of(
              "how much wood could a wood chuck chuck".split(" "))
              .filter(w -> w.length() > 4);
      show("Filtering with a simple lambda expression", words);

      words = Stream.of(
              "how much wood could a wood chuck chuck".split(" "))
              .filter((String w) -> w.length() > 4);
      show("Filtering with a lambda expression with parameter type", words);

      Stream<String> distinctWords = Stream.of(
              "how much wood could a wood chuck chuck".split(" "))
              .distinct();

      Stream<String> sortedWords = distinctWords
              .sorted(Comparator.comparingInt(String::length));
      /*
      ...sorted((s, t) -> s.length() - t.length());
       */

      show("Sorting with a lambda expression with two parameters", sortedWords);

      distinctWords = Stream.of(
              "how much wood could a wood chuck chuck".split(" "))
              .distinct();
      sortedWords = distinctWords.sorted(
              (v, w) ->
              {
                 int first = v.length();
                 int second = w.length();
                 return first - second;
              });
      show("Sorting with a complex lambda expression", sortedWords);
   }

}
