package ru.job4j.collection.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedContainer<E> implements Iterable<E> {

    private int size;
    private NodeP first;

    public void add(E value) {
        NodeP<E> newLink = new NodeP<>(first, value);
        this.first = newLink;
        size++;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            NodeP<E> nodeP;
            int indexI;

            @Override
            public boolean hasNext() {
                return indexI < size;
            }

            @Override
            public E next() {
                E result;
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
        E result;
        Iterator<E> iteratorFindEleventByIndex = this.iterator();
        int indexForIterator = index + 1;

        result = iteratorFindEleventByIndex.next();
        return result;
    }

    public int getSize() {
        return size;
    }

    public NodeP getFirst() {
        return first;
    }
}
