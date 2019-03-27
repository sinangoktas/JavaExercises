package com.practices.tij4.Initialisation;

public class VarArgString {

    static void printStrings(String... args) {
        for (String s : args) {
            System.out.println(s);

        }
    }

    public static void main(String[] args) {
        printStrings("a", "b", "c");
        printStrings(new String[]{"d", "e", "f"});
    }
}
