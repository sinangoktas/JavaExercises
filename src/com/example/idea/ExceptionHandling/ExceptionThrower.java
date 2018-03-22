package com.example.idea.ExceptionHandling;

import java.util.Scanner;

public class ExceptionThrower {

    public static void main(String[] args) {

        ExceptionThrower et = new ExceptionThrower();
        et.launch();
    }

    private void launch() {
        System.out.print("Write a number: ");
        int n = getNumber();
        String isOdd = (n % 2 != 0) ? "odd" : "even";
        if(n != 0) {
            System.out.println("You entered " + n + ", it is " + isOdd + ".");
        } else{
            System.out.println("did you really want to enter 0? Y/N");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            if(str.equalsIgnoreCase("Y")) {
                System.out.println("You entered " + n + ", it is " + isOdd + ".");
            }else if(str.equalsIgnoreCase("N")){
                System.out.print("Try again: ");
                n = getNumber();
                isOdd = (n % 2 != 0) ? "odd" : "even";
                System.out.println("You entered " + n + ", it is " + isOdd + ".");
            }
        }
    }

    private int getNumber() {
        int result = 0;
        try {
            Scanner in = new Scanner(System.in);
            String str = in.next();
            result = Integer.parseInt(str);
            System.out.println("Okkk " + result + ".");
            char thirdDigit = str.charAt(2);
            System.out.println("The third digit is " + thirdDigit + ".");
        }catch (NumberFormatException ex) {
            System.out.println("What you entered is not an integer number!");
            ex.printStackTrace();
            System.exit(0); // stop the JVM
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("Your integer have less than three digits but....");
        }
        return result;
    }
}
