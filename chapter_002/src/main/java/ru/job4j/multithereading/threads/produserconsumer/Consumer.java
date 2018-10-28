package ru.job4j.multithereading.threads.produserconsumer;

public class Consumer implements Runnable {

    private SimpleBlockingQueue<Integer> myQueue;
    private volatile boolean stop;

    public Consumer(SimpleBlockingQueue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (myQueue.getSize() > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myQueue.poll();
        }
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
