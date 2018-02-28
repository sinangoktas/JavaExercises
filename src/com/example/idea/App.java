package com.example.idea;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {


        String[] words = ("how much wood would a woodchuck chuck "
                + "if a woodchuck could chuck wood").split(" ");

        Map<String, Set<String>> groups = Stream.of(words)
                .collect(Collectors.groupingBy(
                        w -> w.substring(0, 1), Collectors.toSet()));
        System.out.println("Lists by first letter: " + groups);

    }
}

