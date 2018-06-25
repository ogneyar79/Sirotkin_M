package ru.job4j.collection.stackAndQueue;


import ru.job4j.collection.list.SimpleArrayList;

/**
 * Реализация очереди.
 *
 * @param <T> type of elements.
 */
public class SimpleQueue<T> {

    /**
     * Наш котнтэйнер со связанным списоком type of Queue.
     */
private SimpleArrayList<T> ourQueueContainer = new SimpleArrayList<>();

    /**
     * Добовляет значение в наш Queue.
     */
    public void push(T value) {
        ourQueueContainer.add(value);
    }

    /**
     * удаляет и возвращает последнее значение.
     *
     * @return Значение для удаления.
     */
    public T poll() {
       int index = ourQueueContainer.getSize() - 1;
       T value = ourQueueContainer.delete(index) ;

        return value;
    }
}
