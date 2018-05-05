package ru.job4j.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Converter {
    Iterator<Iterator<Integer>> it;
    int meaning;
    Iterator<Integer> it1;

    final List<Integer> laLa = new ArrayList<>();

    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        final List<Integer> laLa = new ArrayList<>();
        this.it = it;
        while (it.hasNext() == true) {
            Iterator<Integer> it1;
            it1 = it.next();

            while (it1.hasNext() == true) {
                this.laLa.add(it1.next());
            }
        }
        return new Iterator<Integer>() {
            int indexIterator = 0;

            @Override
            public boolean hasNext() {
                return indexIterator < laLa.size();
            }

            @Override
            public Integer next() {
                return laLa.get(indexIterator++);
            }
        };
    }


    Iterator<Integer> convertSecond(Iterator<Iterator<Integer>> it) {
        it1 = it.next();
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return it.hasNext() && it1.hasNext();
            }

            @Override
            public Integer next() {

                if (it1.hasNext() == true) {
                    meaning = it1.next();
                } else {
                    it1 = it.next();
                    while (it1.hasNext() == true) {
                        meaning = it1.next();
                        break;
                    }
                }
                return meaning;
            }
        };
    }
}

