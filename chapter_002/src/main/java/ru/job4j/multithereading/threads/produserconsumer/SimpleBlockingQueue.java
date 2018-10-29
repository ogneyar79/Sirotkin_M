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
    public synchronized void offer(T value) {
        try {
            while (size < limetedSize) {
                queue.offer(value);
                wait(10);
                System.out.println("We send it");
                if (size == limetedSize / 2) {
                    notify();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println(" We caught InteruptedExeption");
        }
    }

    /**
     * Получение элемента из очереди.
     *
     * @return возвращаемый элемент.
     */
    public synchronized T poll() {
        while (size < 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(" We caught InteruptedExeption");
            }
        }
        try {
            if (size < 25) {
                notify();
                wait(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Getting");

        try {
            wait(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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


