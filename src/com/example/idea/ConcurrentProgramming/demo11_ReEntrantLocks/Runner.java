package com.example.idea.ConcurrentProgramming.demo11_ReEntrantLocks;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private int count = 0;
    // alternative for Synchronised lock
    private Lock lock = new ReentrantLock();
    // equivalent of notify() and wait() methods for re-entrant
    // is in a class called Condition
    private Condition cond = lock.newCondition();

    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() throws InterruptedException {
        lock.lock();
        System.out.println("Waiting ...");
        cond.await();

        System.out.println("Woken up ...");
        // with try-finally block we make sure that if the method increment() throws an exception
        // unlock() will still be called for sure
        try {
            increment();
        }finally {
            lock.unlock();
        }

    }

    public void secondThread() throws InterruptedException {
        Thread.sleep(1000);
        lock.lock();
        System.out.println("press the return ...");
        new Scanner(System.in).nextLine();
        System.out.println("Got return key ...");
        cond.signal();

        try {
            increment();
        }finally {
            lock.unlock();
        }
    }

    public void finished() {
        System.out.println("Count is " + count);

    }
}
