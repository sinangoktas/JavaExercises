package com.main.OracleExamples.Concurrency;

// The Thread class itself implements Runnable
public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from a thread");
    }

    public static void main(String[] args) {
        new Thread(new HelloThread()).start();
    }
}
