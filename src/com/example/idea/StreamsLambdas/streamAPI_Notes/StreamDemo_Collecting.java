package com.example.idea.StreamsLambdas.streamAPI_Notes;

//Use collect() to create a List and a Set from a stream.

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo_Collecting {

    public static void main(String[] args) {

        // A list of names, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@dodgy.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@dodgy.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@dodgy.com"));

        // Map just the names and phone numbers to a new stream.
        Stream<NamePhone> nameAndPhone = myList.stream()
                .map((a) -> new NamePhone(a.getName(), a.getPhoneNum()));

        // Use collect to create a List of the names and phone numbers.
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Names and phone numbers in a List:");
        for (NamePhone e : npList)
            System.out.println(e.getName() + ": " + e.getPhoneNum());
        // Obtain another mapping of the names and phone numbers.
        nameAndPhone = myList.stream().map((a) ->
                new NamePhone(a.getName(), a.getPhoneNum()));
        // Now, create a Set by use of collect().
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("\nNames and phone numbers in a Set:");
        for (NamePhone e : npSet)
            System.out.println(e.getName() + ": " + e.getPhoneNum());

        /*
        Here the first argument to collect() is a lambda expression that returns a new LinkedList.
        The second argument uses the standard collection method add() to add an element to the list.
        The third element uses addAll() to combine two linked lists.
        You can use any method defined by LinkedList to add an element to the list.
        For example, you could use addFirst() to add elements to the start of the list
         */

        List<NamePhone> npList2 = nameAndPhone.collect(
                () -> new LinkedList<>(),
                (list, element) -> list.add(element),
                (listA, listB) -> listA.addAll(listB));

        // (list, element) -> list.addFirst(element)

        /*
        It is not always necessary to specify a lambda expression for the arguments to collect(),
        often, method and/or constructor references will do. For example, again assuming the preceding program,
        this statement creates a HashSet that contains all of the elements in the nameAndPhone stream
         */

        Set<NamePhone> npSet3 = nameAndPhone.collect(HashSet::new,
                HashSet::add,
                HashSet::addAll);

        /*
        Notice that the first argument specifies the HashSet constructor reference.
        The second and third specify method references to HashSet’s add() and addAll() methods.
        In the language of the stream API, the collect() method performs what is called a mu- table reduction.
        This is because the result of the reduction is a mutable (i.e., changeable) storage object, such as a collection
         */
    }

}
