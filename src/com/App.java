package com;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        int[] accessControl = new int[9];
        for (int i = 0; i < accessControl.length; i++) {
            accessControl[i] = i + 1;
        }

        int random = new Random().nextInt(accessControl.length);

        System.out.println(accessControl[random]);


      }
    }

