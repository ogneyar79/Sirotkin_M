package ru.job4j.collection.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * Динамический список на базе массива
 *
 * "param <E> Тип элемента динамического массива
 */
public class DinamicArrayConteiner<E> implements Iterable<E> {

    /**
     *
     */
    int lengthcIndex = 20;
    Object[] container = new Object[lengthcIndex];
    int indexFull = 2;
    int size = 0;
    int indexRiseArray = 2;
    int modCount = 0;

    public void add(E value) {
        this.container[size++] = value;
        modCount++;
        if (container.length - size < indexFull) {
            this.container = Arrays.copyOf(container, lengthcIndex * indexRiseArray);
            this.lengthcIndex = container.length;
        }
    }

    public E get(int index) {
        E value = (E) this.container[index];
        return value;
    }

    public void set(int position, E model) {
        this.container[position] = model;
    }

    public void delete(int index) {
        this.container[index--] = null;

    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            int indexI;
            int expectedModcount = modCount;

            @Override
            public boolean hasNext() {
                return indexI < size;
            }

            @Override
            public E next() {
                if (expectedModcount != modCount) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (E) container[indexI++];
            }
        };
    }

    public int getLengthcIndex() {
        return lengthcIndex;
    }

    public int getSize() {
        return size;
    }

    public Object[] getContainer() {
        return container;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
