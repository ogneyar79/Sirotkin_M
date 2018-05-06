package ru.job4j.iterator;

import java.util.Iterator;


public class Converter {
    Iterator<Iterator<Integer>> it;
    int meaning;
    Iterator<Integer> it1;


    Iterator<Integer> convertSecond(Iterator<Iterator<Integer>> it) {
        it1 = it.next();
        System.out.println(it.hasNext());

        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                boolean marker;
                if (it.hasNext() && !it1.hasNext()) {

                    marker = true;
                }
                else if (it1.hasNext()) {
                    marker = true;
                }
                else {
                    marker = false;
                }
                return marker;
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

