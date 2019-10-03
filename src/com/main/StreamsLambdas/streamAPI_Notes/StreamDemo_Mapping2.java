package com.main.StreamsLambdas.streamAPI_Notes;


/*
Use map() to create a new stream that contains only
selected aspects of the original stream.
*/

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo_Mapping2 {

    public static void main(String[] args) {

        // A list of names, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Fred", "555-5555", "Fred@dodgy.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@dodgy.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333", "Mary@dodgy.com"));
        System.out.println("Original values in myList: ");
        myList.stream().forEach((a) -> {
            System.out.println(a.getName() + " " + a.getPhoneNum()+ " "
                    + a.getEmail());
        });
        System.out.println();
        // Map just the names and phone numbers to a new stream.
        Stream<NamePhone> nameAndPhone = myList.stream()
                .map((a) -> new NamePhone(a.getName(), a.getPhoneNum()));

        System.out.println("List of names and phone numbers: ");
        nameAndPhone.forEach((a) -> {
            System.out.println(a.getName() + " " + a.getPhoneNum());
        });

        /*
        the following statement uses filter()
        and then map() to produce a new stream that contains only the name
        and phone number of the elements with the name "James"
         */

        myList.add(new NamePhoneEmail("James", "543-4321", "James2@dodgy.com"));

        Stream<NamePhone> nameAndPhone2 = myList.stream().
                filter((a) -> a.getName().equals("James")).
                map((a) -> new NamePhone(a.getName(),a.getPhoneNum()));

        System.out.println("List of James': ");
        nameAndPhone2.forEach((a) -> {
            System.out.println(a.getName() + " " + a.getPhoneNum());

        });

    }
}

class NamePhoneEmail {
    private String name;
    private String phoneNum;
    private String email;
    public NamePhoneEmail(String n, String p, String e) {
        name = n;
        phoneNum = p;
        email = e; }

    public String getName() {
        return name;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public String getEmail() {
        return email;
    } }

class NamePhone {
    private String name;
    private String phoneNum;
    public NamePhone(String n, String p) {
        name = n;
        phoneNum = p;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNum() {
        return phoneNum;
    } }
