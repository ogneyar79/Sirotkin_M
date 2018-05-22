package ru.job4j.collection.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedContainer<E> implements Iterable<E> {
    private int size;
    private NodeP first;
    int modCount = 0;

    public void add(E value) {
        NodeP<E> newLink = new NodeP<>(first, value);
        this.first = newLink;
        size++;
        modCount++;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int expectedModcount = modCount;
            NodeP<E> nodeP;
            int indexI;

            @Override
            public boolean hasNext() {
                return indexI < size;
            }

            @Override
            public E next() {
                E result;
                if (expectedModcount != modCount) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (indexI == 0) {
                    result = (E) getFirst().getDate();
                    this.nodeP = getFirst();
                    indexI++;
                } else {
                    result = nodeP.getNext().getDate();
                    this.nodeP = nodeP.getNext();
                    indexI++;
                }
                return result;
            }
        };
    }

    public E get(int index) {
        E result = null;
        Iterator<E> iteratorFindEleventByIndex = this.iterator();
        for (int i = 0; i <= index; i++) {
            result = iteratorFindEleventByIndex.next();
        }
        return result;
    }

    public int getSize() {
        return size;
    }

    public NodeP getFirst() {
        return first;
    }
}
