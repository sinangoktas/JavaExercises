package com.example.idea.StreamsLambdas.streamAPI_Notes;


//Demonstrate trySplit().

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo_TrySplit {

    /*
    If it is not possible to split the invoking Spliterator, null is returned.
    Otherwise, a reference to the partition is returned.
     */

    public static void main(String[] args) {

        // Create a list of Strings.
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");
        // Obtain a Stream to the array list.
        Stream<String> myStream = myList.stream();
        // Obtain a Spliterator.
        Spliterator<String> splitItr = myStream.spliterator();
        // Now, split the first iterator.
        Spliterator<String> splitItr2 = splitItr.trySplit();
        // If splitItr could be split, use splitItr2 first.
        if (splitItr2 != null) {
            System.out.println("Output from splitItr2: ");
            splitItr2.forEachRemaining((n) -> System.out.println(n));

            /*
            forEachRemaining()
            This method applies action to each unprocessed element and then returns.
            For example, assuming the preceding program, the following displays the strings remaining in the stream
            Notice how this method eliminates the need to provide a loop
            to cycle through the elements one at a time; another advantage of Spliterator.
             */
        }
        // Now, use the splitItr.
        System.out.println("\nOutput from splitItr: ");
        splitItr.forEachRemaining((n) -> System.out.println(n));


        // Some more methods provided by stream

        /*
        • To determine if one or more elements in a stream satisfy a specified predicate, use allMatch(), anyMatch(), or noneMatch().
        • To obtain the number of elements in the stream, call count().
        • To obtain a stream that contains only unique elements, use distinct().
        • To create a stream that contains a specified set of elements, use of().
         */

    }

}
