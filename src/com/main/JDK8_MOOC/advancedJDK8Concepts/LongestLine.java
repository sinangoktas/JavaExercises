package com.main.JDK8_MOOC.advancedJDK8Concepts;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class LongestLine {

    public static void main(String[] args) throws IOException {

        Path input = Paths.get("SonnetI.txt");
        int longestLineLength = 0;
        try {
            longestLineLength = Files.lines(input)
                    .mapToInt(String::length)
                    .max()
                    .getAsInt();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(longestLineLength);

        // Another way of finding longest line
        String longest = null;
        try {
            longest = Files.lines(input)
                    .sorted((x, y) -> y.length() - x.length())
                    .findFirst()
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(longest.length());

        //Another way of finding longest line
        String lngst = "";
        String s;
        try {
            BufferedReader rd = new BufferedReader(new FileReader("SonnetI.txt"));
            while((s = rd.readLine()) != null)
                if(s.length() > lngst.length() )
                    lngst = s;
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(lngst.length());

        // Solution with Stream API reduce()
        // Optional<T> reduce(BinaryOperator<T> accumulator)
        // Use the recursive approach as an accumulator for a reduction

        String lngstLine = Files.lines(input)
                .reduce((x, y) -> {
                    if(x.length() > y.length())
                        return x;
                    return y;
                }).get();

        System.out.println(lngstLine.length());

        // Use a specialised form of max() one that takes a Comparator as a parameter
        String lngstLn = Files.lines(input)
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println(lngstLn.length());

        /*
        Reduction take a stream and reduces it to a single value
        The way the reduction works is defined by the accumulator
        - which is a binary operator
        - the accumulator applied successively to the stream elements
        - the reduce() method maintains a partial result state
        - like a recursive approach, but without the resource overhead
         */




    }
}
