package com.vik.generics.test.exc8;

public class TestExcercise10 {

    public static void main(final String args[]) throws Exception {
        final ThreadPool pool = new ThreadPool();
        /*
         * pool.execute(); Thread.sleep(10); pool.execute(); Thread.sleep(10); pool.execute(); Thread.sleep(10); pool.execute(); Thread.sleep(10); pool.execute(); Thread.sleep(10); pool.execute();
         * Thread.sleep(10); pool.execute(); Thread.sleep(10); pool.execute(); Thread.sleep(10); pool.execute();
         * 
         * Thread.sleep(1000);
         */

        final ProducerConsumer producerConsumer = new ProducerConsumer();
        final Runnable producer = producerConsumer.createProducer();

        pool.execute(producer);
        pool.execute(producer);

        final Runnable consumer = producerConsumer.createConsumer();

        pool.execute(consumer);

        Thread.sleep(10000);

    }

}
