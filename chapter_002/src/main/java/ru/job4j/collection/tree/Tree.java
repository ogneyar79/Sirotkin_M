package ru.job4j.collection.tree;

import java.util.*;

public class Tree<E extends Comparable<E>> implements SimpleTree<E> {
    private Node<E> root;
    int size = 0;

    public Tree(Node<E> root) {
        this.root = root;
        this.size = size;
        size++;
    }

    @Override
    public boolean add(E parentValue, E childValue) {
        boolean rezult = false;
        E valueOfChild = childValue;
        Queue<Node<E>> data = new LinkedList<>();
        Node<E> nodeOfChild = new Node<>(valueOfChild);
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.eqValue(parentValue)) {
                for (Node<E> ch : el.leaves()) {
                    if (ch.eqValue(childValue)) {
                        rezult = false;
                        System.out.println(" We have the same value at " + el);
                        return rezult;
                    }
                }
                el.leaves().add(nodeOfChild);
                size++;
                rezult = true;
                break;
            }
            for (Node<E> ch : el.leaves()) {
                data.offer(ch);
            }
        }
        return rezult;
    }

    @Override
    public Optional<Node<E>> findBy(E value) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.eqValue(value)) {
                rsl = Optional.of(el);
                break;
            }
            for (Node<E> child : el.leaves()) {
                data.offer(child);
            }
        }
        return rsl;
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            Queue<Node<E>> data = new LinkedList<>();
            int indexI = 0;

            {
                data.offer(root);
            }

            @Override
            public boolean hasNext() {
                return indexI < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E result = null;

                while (!this.data.isEmpty()) {
                    Node<E> el = data.poll();
                    result = el.getValue();
                    indexI++;
                    if (el.leaves() != null) {
                        for (Node<E> child : el.leaves()) {
                            data.offer(child);
                        }
                    }
                    break;
                }
                return result;
            }
        };
    }


}
