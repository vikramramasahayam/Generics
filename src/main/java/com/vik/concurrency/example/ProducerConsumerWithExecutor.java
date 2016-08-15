package com.vik.concurrency.example;

import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ProducerConsumerWithExecutor {

    private static final BlockingQueue<UUID> queue = new ArrayBlockingQueue<>(10000);

    public static void main(String args[]) {

        ExecutorService service1 = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            service1.execute(new Producer(i));
        }

        ExecutorService service2 = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 2; i++) {
            service2.execute(new Consumer(i));
        }
    }

    private static class Producer implements Runnable {

        private int number;

        Producer(int n) {
            this.number = n;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    UUID uuid = UUID.randomUUID();
                    System.out.println(Thread.currentThread().getName() + " Producer  : " + number + " UUID :" + uuid);
                    queue.offer(uuid);
                } catch (Exception e) {
                    System.out.println("Producer Exception " + e);
                }
            }
        }
    }

    private static class Consumer implements Runnable {

        private int number;

        public Consumer(int n) {
            this.number = n;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    UUID uuid = queue.poll();
                    System.out.println(Thread.currentThread().getName() + " Consumer : " + number + " UUID :" + uuid);
                } catch (Exception e) {
                    System.out.println("Consumer Exception " + e);
                }
            }
        }
    }

}
