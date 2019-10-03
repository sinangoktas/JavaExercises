package com.main.JDK8_MOOC.advancedJDK8Concepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DebugWithPeek {

    // debugging is especially difficult when using streams and lambdas
    // because lots of things going on under the hood
    // you can use peek() method to see what is going on
    // peek() sends the element under processing to the output stream

    private static final String WORD_REGEXP = "[- .:,]+";

    public static void main(String[] args) {

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get("SonnetI.txt"), StandardCharsets.UTF_8)) {

            List<String> sortedWords = reader.lines()
                    .peek(System.out::println) // print the elements to the console
                    .flatMap(line -> Stream.of(line.split(WORD_REGEXP)))
                    .peek(s -> s.length()) // or call any other method on s
                    .map(String::toLowerCase)
                    .distinct()
                    .sorted((x, y) -> x.length() - y.length())
                    .collect(Collectors.toList());

            sortedWords.stream()
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
