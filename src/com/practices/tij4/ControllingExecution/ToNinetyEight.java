package com.practices.tij4.ControllingExecution;

public class ToNinetyEight {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i == 99){
                //break;
                return;
            }
            System.out.println(i);
        }

    }
}
