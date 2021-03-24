package com.main.OracleExamples.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ran {

    // Write a program that prints its arguments in random order.

    public static void main(String[] args) {

        String[] arr = new String[] {"sinan", "ali", "devrim"};

        // Get and shuffle the list of arguments
        List<String> argList = Arrays.asList(arr);
        Collections.shuffle(argList);

        // Print out the elements using JDK 8 Streams
        argList.stream()
                .forEach(e->System.out.format("%s ",e));

        // Print out the elements using for-each
        for (String arg: argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}
