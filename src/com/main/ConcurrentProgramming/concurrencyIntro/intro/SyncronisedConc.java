package com.main.ConcurrentProgramming.concurrencyIntro.intro;

public class SyncronisedConc implements Runnable {

    public void run() {
        System.out.println(getCount());
    }

    Object obj = new Object();
    private int n = 0;

    public int getCount() {
        synchronized (obj) {
            increment();
            decrement();
            return n;
        }
    }

    // alternatively you can synchronise the full method
    /*
     public synchronized int getCount() {
            increment();
            decrement();
            return n;
     }
     */

    public void increment() {
        n++;

    }
    public void decrement() {
        n--;
    }

    public static void main(String[] args) {
        Thread T1 = new Thread(new SyncronisedConc());
        Thread T2 = new Thread(new SyncronisedConc());
        T1.start();
        T2.start();
    }
}
