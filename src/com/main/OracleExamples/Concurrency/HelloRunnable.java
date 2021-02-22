package com.main.OracleExamples.Concurrency;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        // Start a new thread
        new Thread(new HelloRunnable()).start();

    }
}
