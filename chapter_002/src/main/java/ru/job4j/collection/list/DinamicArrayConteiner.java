package ru.job4j.collection.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Динамический список на базе массива.
 *
 * @param <E> Тип элементов динамического массива.
 */
public class DinamicArrayConteiner<E> implements Iterable<E> {

    /**
     * Начальное значение размера массива container.
     */
    private int lengthcIndex = 20;

    /**
     * Контейнер объектов.
     */
    private Object[] container = new Object[lengthcIndex];

    /**
     * переменная показывающая, когда надо увеличить размер conteiner.
     */
    private int indexFull = 2;

    /**
     * счетчик элементов в контейнере.
     */
    private int size = 0;

    /**
     * индекс, показывающий на сколько увеличить контейнер.
     */
    private int indexRiseArray = 2;

    /**
     * Количество изменений в контейнере объектов.
     */
    private int modCount = 0;

    /**
     * Добавление элемента в список.
     *
     * @param value добавляемый объект.
     */
    public void add(E value) {
        this.container[size++] = value;
        modCount++;
        if (container.length - size < indexFull) {
            this.container = Arrays.copyOf(container, lengthcIndex * indexRiseArray);
        }
    }

    /**
     * Получение объекта из списка.
     *
     * @param index индекс массива, по которому можно найти искомый объект.
     * @return возвращаемый по индексу объект.
     */
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

    /**
     * Получение размера контейнера.
     *
     * @return Размер контейнера.
     */
    public int getLengthcIndex() {
        return lengthcIndex;
    }

    public Object[] getContainer() {
        return container;
    }

    public int getIndexFull() {
        return indexFull;
    }

    /**
     * Получение количества элементов в контейнере.
     *
     * @return количество элементов контейнера.
     */
    public int getSize() {
        return size;
    }

    public int getIndexRiseArray() {
        return indexRiseArray;
    }

    public int getModCount() {
        return modCount;
    }
}
