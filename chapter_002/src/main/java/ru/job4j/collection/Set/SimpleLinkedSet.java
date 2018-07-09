package ru.job4j.collection.Set;

import ru.job4j.collection.list.SimpleArrayList;

import java.util.Iterator;

public class SimpleLinkedSet<E> implements Iterable<E> {

    private SimpleArrayList simpleLinkedSetcontainer = new SimpleArrayList();

    boolean checkEauals(E e) {
        boolean result = false;
        Iterator<E> simpleLinkedSetItetator = simpleLinkedSetcontainer.iterator();
        while (simpleLinkedSetItetator.hasNext()) {
            E content = simpleLinkedSetItetator.next();
            if (content.equals(e)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void add(E element) {
        if (!this.checkEauals(element)) {
            simpleLinkedSetcontainer.add(element);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return this.simpleLinkedSetcontainer.iterator();
    }
}
