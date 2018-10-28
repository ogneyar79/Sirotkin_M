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

    /**
     * Очередью
     * <p>
     * "param <T> Тип элемента очереди
     */
    @GuardedBy("this")
    private Queue<T> queue = new LinkedList<>();

    /**
     * переменная которая показывает количество элементов в очереди.
     */
    private int size = queue.size();

    /**
     * Добавление элемнтов в очередь.
     *
     * @param value добавляемый объект
     */
    public synchronized void offer(T value) {

        queue.offer(value);
    }

    /**
     * Получение элемента из очереди.
     *
     * @return возвращаемый элемент.
     */
    public synchronized T poll() {
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


