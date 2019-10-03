package com.main.ConcurrentProgramming.demo4_ThreadSynchronization;

public class App3 {

    private static int count = 0;

    public synchronized void increment() {
        count ++;
    }

    public static void main(String[] args) {
        App3 app3 = new App3();
        app3.doWork();

    }

    public void doWork() {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t2.join(); // waiting for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count is " + count);

    }
}
