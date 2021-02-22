package com.main.OracleExamples.Concurrency.GuardedBlocks;

public class ProducerConsumerExample {

//    This kind of application shares data between two threads:
//    the producer, that creates the data, and the consumer, that does something with it.
//    The two threads communicate using a shared object. Coordination is essential:
//    the consumer thread must not attempt to retrieve the data before the producer thread has delivered it,
//    and the producer thread must not attempt to deliver new data if the consumer hasn't retrieved the old data.

    public static void main(String[] args) {
            Drop drop = new Drop();
            (new Thread(new Producer(drop))).start();
            (new Thread(new Consumer(drop))).start();

    }

    // Modify the producer-consumer example in Guarded Blocks to use a standard library class instead of the Drop class.
    // https://docs.oracle.com/javase/tutorial/essential/concurrency/QandE/answers.html
}
