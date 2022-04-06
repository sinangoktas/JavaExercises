package com.main.CollectionsFramework.wordFrequency;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * This program prints the frequencies of all words in "Alice in Wonderland".
 */
public class WordFrequency {
    public static void main(String[] args)
            throws FileNotFoundException {

        Map<String, Integer> frequencies = new TreeMap<>();
        Map<String, Integer> mostFrequent = new TreeMap<>();
        Map<String, Integer> leastFrequent = new TreeMap<>();

        Scanner in = new Scanner(new File("./alice30.txt"));
        while (in.hasNext()) {
            String word = clean(in.next());
            // Get the old frequency count
            Integer count = frequencies.get(word);

            // If there was none, put 1; otherwise, increment the count
            if (count == null) {
                count = 1;
            } else {
                count = count + 1;
            }

            frequencies.put(word, count);


            // Find the most and least frequent 10 words
            mostFrequent.put(word, count);
            leastFrequent.put(word, count);

            if(mostFrequent.size() > 10) {
                // find the least occuring element
                for (String key : mostFrequent.keySet()) {
                    if(mostFrequent.get(key) < count) {
                        count = mostFrequent.get(key);
                        word = key;
                    }
                }
                // and then remove it
                mostFrequent.remove(word, count);
            }

            if(leastFrequent.size() > 10) {
                // find the most occuring element
                for (String key : leastFrequent.keySet()) {
                    if(leastFrequent.get(key) > count) {
                        count = leastFrequent.get(key);
                        word = key;
                    }
                }
                // and then remove it
                leastFrequent.remove(word, count);
            }

            /*
            This code does the same with 20-29
            frequencies.merge(word, 1, (oldValue, value) -> oldValue + value);
             */

        }

        // Print all words and counts
        for (String key : frequencies.keySet()) {
            System.out.printf("%-20s%10d\n", key, frequencies.get(key));
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        for (String key : mostFrequent.keySet()) {
            System.out.printf("%-20s%10d\n", key, mostFrequent.get(key));
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>");

        for (String key : leastFrequent.keySet()) {
            System.out.printf("%-20s%10d\n", key, leastFrequent.get(key));
        }
    }

    /**
     * Removes characters from a string that are not letters.
     *
     * @param s a string
     * @return a string with all the letters from s
     */
    public static String clean(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }
}
