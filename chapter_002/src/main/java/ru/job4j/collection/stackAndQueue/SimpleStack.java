package ru.job4j.collection.stackAndQueue;

import ru.job4j.collection.list.SimpleArrayList;


/**
 * Реализация стэка.
 *
 * @param <T> type of elements.
 */
public class SimpleStack<T> {

    T value;

    // Описание Stack - стек. Описывается LIFO - last input first output.
    /**
     * Наш котнтэйнер со связанным списоком type of Stack.
     */
    private SimpleArrayList<T> ourStackContainer = new SimpleArrayList();


    /**
     * удаляет и возвращает первое значение.
     *
     * @return Значение для удаления.
     */
    public T poll() {
        T element = ourStackContainer.delete();
        return element;
    }

    /**
     * Добовляет значение в наш Stack.
     */
    public void push(T value) {
        ourStackContainer.add(value);
    }

    ;


}
