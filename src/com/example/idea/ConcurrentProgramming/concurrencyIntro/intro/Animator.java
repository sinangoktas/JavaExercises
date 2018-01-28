package com.example.idea.ConcurrentProgramming.concurrencyIntro.intro;

public class Animator implements Runnable {

    public void run() {
        // this is effectively the "main" method of your new thread ....
    }

       // anything else you want in this class goes here ....

    public static void main(String[] args) {
        Thread myThread = new Thread(new Animator());
        myThread.start();


        /*
        Thread newT = Thread.currentThread();
        int priority = newT.getPriority();
        newT.setPriority(1);

        if(myThread.isAlive()) {

        }
         */

        /*
        thought to be good idea, turned out to be a very bad idea
        newT.stop();
        newT.suspend();
        newT.resume();
         */
    }
}
