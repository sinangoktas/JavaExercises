package com.example.idea.ConcurrentProgramming.concurrencyIntro.intro;

public class Concurrency implements Runnable {

    public void run() {
        System.out.println("hello from thread");
    }

    public static void main(String[] args) {
        Thread newT = new Thread(new Concurrency());
        newT.start();
        System.out.println("main thread by java");

    }
}
