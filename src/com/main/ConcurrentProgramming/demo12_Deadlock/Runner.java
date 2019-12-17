package com.main.ConcurrentProgramming.demo12_Deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private Account acc1 = new Account();
    private Account acc2 = new Account();

    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    // in case lock() is not called in the same order on different threads
    // deadlock may occur - to avoid this we need a custom method
    private void acquireLocks(Lock firstLock, Lock secondLock) throws InterruptedException {
        while (true) {
            // acquire locks
            boolean gotFirstLock = false;
            boolean gotSecondLock = false;

            try{
                gotFirstLock = firstLock.tryLock();
                gotSecondLock = secondLock.tryLock();
            }finally {
                if(gotFirstLock && gotSecondLock) {
                    return;
                }
                if(gotFirstLock) {
                    firstLock.unlock();
                }
                if(gotSecondLock) {
                    secondLock.unlock();
                }
            }
            // locks not acquired
            Thread.sleep(1);
        }

    }


    public void firstThread() throws InterruptedException {
        // transfer from acc1 to acc2
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {

            acquireLocks(lock1, lock2);
            try {
                Account.transfer(acc1, acc2, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }


    }

    public void secondThread() throws InterruptedException {
        // transfer from acc2 to acc1
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {

            acquireLocks(lock2, lock1);
            try {
                Account.transfer(acc2, acc1, random.nextInt(100));
            }finally {
                lock1.unlock();
                lock2.unlock();
            }
        }

    }

    public void finished() {

        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());
        System.out.println("Total balance: " + (acc1.getBalance() + acc2.getBalance()));

    }
}
