package com.main.StreamsLambdas.streamAPI_Notes;

//Use a Spliterator.

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo_Spliterator {

    /*
    Spliterator offers an alternative to Iterator,
    especially when parallel processing is involved
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
        // Iterate the elements of the stream.
        while (splitItr.tryAdvance((n) -> System.out.println(n)))
            ;

        // tryAdvance() returns true if there is a next element

    }
}
