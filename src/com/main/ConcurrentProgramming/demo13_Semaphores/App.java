package com.main.ConcurrentProgramming.demo13_Semaphores;

import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws Exception {
/*        Semaphore sem = new Semaphore(1);
        System.out.println("Available permits: " + sem.availablePermits());

        // release() increments the available permits by one
        sem.release();
        System.out.println("Available permits: " + sem.availablePermits());

        // acquire() decrements the available permits by one
        sem.acquire();
        System.out.println("Available permits: " + sem.availablePermits());

        // acquire() will wait indefinitely if there is no available permit
        Semaphore sem2 = new Semaphore(0);
        sem2.acquire();*/

        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 200; i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    Connection.getInstance().connect();
                }
            });
        }

        executor.shutdown();

        executor.awaitTermination(1, TimeUnit.DAYS);

    }
}
