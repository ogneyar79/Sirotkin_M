package ru.job4j.multithereading.threads.produserconsumer;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleBlockingQueueTest {
    Queue<Integer> queue;
    SimpleBlockingQueue<Integer> myQueue;
    Produser produser;
    Consumer consumer;
    Thread producerTread;
    Thread consumerTread;

    @Before
    public void setUp() throws Exception {
        queue = new LinkedList<>();
        myQueue = new SimpleBlockingQueue<Integer>(queue, 1000);
        produser = new Produser(myQueue);
        consumer = new Consumer(myQueue);
        producerTread = new Thread(produser);
        consumerTread = new Thread(consumer);
    }

    @Test
    public void offerAndPoll() throws Exception {


        producerTread.start();
        producerTread.join(002);

        consumerTread.start();




        System.out.println( consumerTread.getState());
        System.out.println(producerTread.getState());
    }
}