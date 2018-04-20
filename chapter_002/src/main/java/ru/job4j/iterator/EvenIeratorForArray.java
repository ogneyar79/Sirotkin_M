package ru.job4j.iterator;

import java.util.Iterator;

public class EvenIeratorForArray implements Iterator<Integer> {

    int[] value;
    int indexEvenNumber;

    public EvenIeratorForArray(int[] value) {
        this.value = value;
    }

    public Integer next() {
        System.out.println(indexEvenNumber);
        int a = value[indexEvenNumber];
        while (a % 2 != 0) {
            System.out.println(indexEvenNumber);
            indexEvenNumber++;
        }
        System.out.println(indexEvenNumber);
        return value[indexEvenNumber++];

    }

    @Override
    public void remove() {
    }

    public boolean hasNext() {
        int indexFindNextEven = indexEvenNumber;
        System.out.println(indexEvenNumber);
        System.out.println(indexFindNextEven);
        int a = value[indexFindNextEven];
        while (a % 2 != 0 && value[indexFindNextEven] < value.length) {
            System.out.println(indexFindNextEven);
            indexFindNextEven++;
            if (a == value[value.length - 1] && a % 2 != 0) {
                return false;
            }
        }
        System.out.println(indexFindNextEven);
        return true;
    }
}
