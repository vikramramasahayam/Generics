package com.vik.concurrency.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ProducerConsumer {

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10000);

    public static void main(String args[]) throws InterruptedException {
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());

        producer.start();
        TimeUnit.SECONDS.sleep(1);
        consumer.start();

    }

    private static class Consumer implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                    int value = queue.poll();
                    System.out.println("Consuming value from queue : " + value);
                } catch (InterruptedException e) {
                    System.out.println("Exception inside Consumer : " + e);
                }
            }
        }

    }

    private static class Producer implements Runnable {

        @Override
        public void run() {
            int i = 0;
            while (true) {
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                    System.out.println("Inserting value into queue : " + i);
                    queue.offer(i++);
                } catch (InterruptedException e) {
                    System.out.println("Exception inside Producer " + e);
                }
            }
        }

    }
}
