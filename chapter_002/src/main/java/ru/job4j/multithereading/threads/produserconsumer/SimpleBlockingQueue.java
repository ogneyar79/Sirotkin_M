package ru.job4j.multithereading.threads.produserconsumer;

import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import java.util.LinkedList;
import java.util.Queue;

/**
 * блокирующая, потокобезопасная очередь на базе Линкед Лист.
 * <p>
 * "param <T> Тип элемента очереди
 */
@ThreadSafe
public class SimpleBlockingQueue<T> {

    public SimpleBlockingQueue(Queue<T> queue, int limetedSize) {
        this.queue = queue;
        this.limetedSize = limetedSize;
    }

    /**
     * Очередью
     * <p>
     * "param <T> Тип элемента очереди
     */
    @GuardedBy("this")
    Queue<T> queue = new LinkedList<>();

    /**
     * переменная которая показывает количество элементов в очереди.
     */
    private volatile int size = queue.size();

    /**
     * переменная которая показывает предельное количество элементов.
     */
    private volatile int limetedSize = 100;

    /**
     * Добавление элемнтов в очередь.
     *
     * @param value добавляемый объект
     */
    public synchronized void offer(T value) throws InterruptedException {

        while (this.queue.size() == limetedSize) {

            System.out.println(" I try to inform to It's full I offer (add limit) and I get sleep ");
            wait();
        }
        if (this.queue.size() == 0) {
            System.out.println("It's time wake up We want You begin to work when will be " + limetedSize + " And I ll be to sleep");
            notify();
        }
        System.out.println(" I work offer" );
        queue.offer(value);
    }

    /**
     * Получение элемента из очереди.
     *
     * @return возвращаемый элемент.
     */
    public synchronized T poll() throws InterruptedException {
        while (this.queue.size() == 0) {
            System.out.println("size == 0 and I want to sleep No items to poll(bring)");
            wait();
        }
        if (this.queue.size() == limetedSize) {
            System.out.println(" I give comand wake up When I finish work for poll all and get sleep");
            notify();
        }
        System.out.println(" I work poll bring. bring...");
        return queue.poll();
    }

    public SimpleBlockingQueue(Queue<T> queue) {
        this.queue = queue;
    }

    public Queue<T> getQueue() {
        return queue;
    }

    public int getSize() {
        return size;
    }
}


