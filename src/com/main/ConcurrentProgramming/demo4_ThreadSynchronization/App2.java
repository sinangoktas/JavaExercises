package com.main.ConcurrentProgramming.demo4_ThreadSynchronization;

public class App2 {

    private int count = 0;

    public static void main(String[] args) {
        App2 app2 = new App2();
        app2.doWork();

    }

    public void doWork() {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    count++;
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    count++;
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // waiting for t1 to finish
            t2.join(); // waiting for t2 finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // still ... main thread may finish before t1 and t2 finished running

        System.out.println("Count is " + count);

    }
}
