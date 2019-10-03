package com.main.ConcurrentProgramming.concurrencyIntro.intro;

public class Animation extends Thread {

    @Override
    public void run() {
        // code for this thread
    }

    // anything else you want in this class


    public static void main(String[] args) {
        Animation anm = new Animation();
        // a newly created Thread is
        anm.start();

    }

}



