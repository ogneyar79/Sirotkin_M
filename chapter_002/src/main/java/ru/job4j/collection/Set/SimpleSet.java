package ru.job4j.collection.Set;

import ru.job4j.collection.list.DinamicArrayConteiner;

import java.util.Iterator;

/**
 * Set на базе динамичесого массива DinamicArrayConteiner.
 * <p>
 * "param <E> Тип элемента в Set
 */
public class SimpleSet<E> implements Iterable<E> {


    /**
     * Наш котнтэйнер для хранения на базе DinamicArrayConteiner<E>.
     */
    DinamicArrayConteiner<E> arrayConteiner = new DinamicArrayConteiner<E>();

    boolean checkEauals(E e) {
        Boolean result = false;
        Iterator<E> arrayConteinerIterator = this.arrayConteiner.iterator();
        for (int i = 0; i < this.arrayConteiner.getSize(); i++) {
            E content = arrayConteinerIterator.next();
            if (content.equals(e)) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Добавление элемнтов в Set.
     *
     * @param e добавляемый объект
     */
    public void add(E e) {

        if (!this.checkEauals(e)) {
            arrayConteiner.add(e);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return this.arrayConteiner.iterator();
    }
}
