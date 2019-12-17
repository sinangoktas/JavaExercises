package com.main.StreamsLambdas.streamAPI_Notes;


//Use an iterator with a stream.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo_Iterators {

    /*
    Although a stream is not a data storage object, you can still use an iterator to cycle through its elements in much
    the same way as you would use an iterator to cycle through the elements of a collection.
    The stream API supports two types of iterators. The first is the traditional Iterator.
    The second is Spliterator, which was added by Java 8. It provides significant advantages in certain situations
    when used with parallel streams
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
        // Obtain an iterator to the stream.
        Iterator<String> itr = myStream.iterator();
        // Iterate the elements in the stream.
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
