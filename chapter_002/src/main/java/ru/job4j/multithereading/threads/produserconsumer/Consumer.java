package ru.job4j.multithereading.threads.produserconsumer;

public class Consumer implements Runnable {

    private SimpleBlockingQueue<Integer> myQueue;
    private volatile boolean stop;

    public Consumer(SimpleBlockingQueue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            int i;
            i = myQueue.poll();
            System.out.println(myQueue.getSize() + " " + "Consumer" + i);
        }
    }
}
