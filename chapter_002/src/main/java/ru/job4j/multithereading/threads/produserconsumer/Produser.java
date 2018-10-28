package ru.job4j.multithereading.threads.produserconsumer;

import java.util.Random;

public class Produser implements Runnable {

    private SimpleBlockingQueue<Integer> myQueue;
    private volatile boolean stop;

    public Produser(SimpleBlockingQueue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (myQueue.getSize() < 30) {
            myQueue.offer(random.nextInt());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            notify();
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
