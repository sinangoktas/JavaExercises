package com.main.ConcurrentProgramming.InterruptingThreads;

import java.util.Random;
import java.util.concurrent.*;

public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting.");

        ExecutorService executor = Executors.newCachedThreadPool();

        Future<?> fu = executor.submit(new Callable<Void>() {

            @Override
            public Void call() throws Exception {
                Random ran = new Random();
                for (int i = 0; i < 1E8; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.printf("Interrupted at %d !!!", i);
                        System.out.println();
                        break;
                    }

                    Math.sin(ran.nextDouble());
                }

                return null;
            }
        });

        executor.shutdown();
        Thread.sleep(500);

        // sends flag to isInterrupted()
       // executor.shutdownNow();

        // fu.cancel(false);

        executor.awaitTermination(1, TimeUnit.DAYS);
        System.out.println("Finished.");

    }

}
