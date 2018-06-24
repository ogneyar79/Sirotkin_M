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
     * Начальное значение массива container.
     */
    int lengthcIndex = 20;


    /**
     * Kontainer of objects
     */
    Object[] container = new Object[lengthcIndex];

    /**
     * прееменная показывающая когда надо увеличивать размер container.
     */
    final int indexFull = 2;

    /**
     * счетчик элементов в container.
     */
    int size = 0;

    /**
     * индеск показывающий на сколько нужно увеличитвать контейнерю
     */
    final int indexRiseArray = 2;

    /**
     * количество изменений в контейнере объектовю
     */
    int modCount = 0;



    /**
     * Добавление элемнтов в список
     *
     * @param value добавляемый объект
     */
    public void add(E value) {
        this.container[size++] = value;
        modCount++;
        if (container.length - size < indexFull) {
            this.container = Arrays.copyOf(container, lengthcIndex * indexRiseArray);
            this.lengthcIndex = this.container.length;
        }
    }

    /**
     * Получение элемента из спискаю
     *
     * @param index индекс массива по которому можно найти искомый объект.
     * @return возвращаемый по индеску объект.
     */
        public E get(int index) {
        E value = (E) this.container[index];
        return value;
    }

    /**
     * Изменение содержимого в контейнере
     *
     * @param position индекс ячейки в нашем контейнере, где будем изменять значение.
     * @param model объект на который будем менять содержимое нашей ячейки.
     */
    public void set(int position, E model) {
        this.container[position] = model;
    }

    public E delete(int index) {
        E oldValue = (E) this.getContainer()[index];
              modCount++;

              int nubMoved = size - index - 1;

        Object[] container = this.getContainer();
        System.arraycopy(this.getContainer(), index + 1, this.getContainer(), index, nubMoved);
        this.getContainer()[--size] = null;
             this.lengthcIndex = this.getContainer() .length;
            return oldValue;
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
