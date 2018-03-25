package com.example.idea;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);


        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        scan.nextLine();
        String s2 = scan.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);

        scan.close();









    }

}