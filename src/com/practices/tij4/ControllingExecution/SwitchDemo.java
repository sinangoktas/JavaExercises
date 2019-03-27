package com.practices.tij4.ControllingExecution;

public class SwitchDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("it is zero");
                    //break;
                case 1:
                    System.out.println("it is one");
                    //break;
                case 2:
                    System.out.println("It is two");
                    //break;
                default:
                    System.out.println("It is an unknown integer");
            }
        }
    }
}
