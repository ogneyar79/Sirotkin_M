package ru.job4j.collection.list;

public class SimpleArrayList<E> {

    private int size;
    private Node<E> first;

    /**
     * Метод вставляет в начало списка данные.
     */
    public void add(E date) {
        Node<E> newLink = new Node<>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }

    /**
     * Реализовать метод удаления первого элемент в списке.
     */
    public E delete() {
        Node<E> copyFirsElement = this.first;
        this.first = this.first.next;
        this.size--;
        return copyFirsElement.date;
    }

    /**
     * Реализовать метод удаления  элементa в списке по индексу.
     */
    public E delete(int index) {
        Node<E> result = this.first;
        Node<E> elementNodeForDeleted = this.first;
        for (int j = 0; j < index; j++) {
            result = result.next;
            if (j == index - 1) {
                Node<E> temp = elementNodeForDeleted.next;
                elementNodeForDeleted.next = elementNodeForDeleted.next.next;
                temp = null;
                break;
            }
            elementNodeForDeleted = elementNodeForDeleted.next;

        }
        this.size--;

        return result.date;
    }

    /**
     * Метод получения элемента по индексу.
     */
    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.date;
    }

    /**
     * Метод получения размера коллекции.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Класс предназначен для хранения данных.
     */
    private static class Node<E> {
        E date;
        Node<E> next;

        Node(E date) {
            this.date = date;
        }
    }

}
