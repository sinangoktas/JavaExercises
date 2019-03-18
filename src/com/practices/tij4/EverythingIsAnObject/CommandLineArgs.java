package com.practices.tij4.EverythingIsAnObject;

public class CommandLineArgs {

    public static void main(String[] args) {
        if(args.length == 3) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);

            }

        } else {
            throw new IllegalArgumentException("Illegal argument passed");
        }
    }
}
