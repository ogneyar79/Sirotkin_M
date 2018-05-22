package ru.job4j.collection.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinamicArrayConteiner<E> implements Iterable<E> {

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
        }
    }

    public E get(int index) {
        E value = (E) this.container[index];
        return value;
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
}
