package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorPrimeNumber implements Iterator<Integer> {
    final int[] value;
    int indexPrimeNumber;

    public IteratorPrimeNumber(final int[] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        boolean result = false;
        boolean marker = false;

        for (int i = indexPrimeNumber; i < value.length; i++) {
            if (marker == true) {
                result = true;
                break;
            } else if (value[i] == 0 || value[i] == 1 || (value[i] > 2 && value[i] % 2 == 0) || (value[i] > 5 && value[i] % 5 == 0)) {
                result = false;
            } else if (value[i] == 2) {
                result = true;
                marker = true;
                break;
            } else {
                for (int j = 2; j < value[i]; j++) {
                    if (value[i] % j == 0) {
                        result = false;
                        break;
                    } else {
                        result = true;
                        marker = true;
                    }
                }
            }
        }
        return result;
    }

    public boolean checkPrimeNumberIs(int number) {
        boolean result = false;
        if (number == 2) {
            result = true;
        } else if (number == 0 || number == 1 || number % 2 == 0 || (number > 5 && number % 5 == 0)) {
            result = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }

    @Override
    public Integer next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        while (!checkPrimeNumberIs(value[indexPrimeNumber])) {
            indexPrimeNumber++;
        }
        return value[indexPrimeNumber++];
    }

    public boolean hasNextSecond() {
        int indexFindPrimeNumber = indexPrimeNumber;
        boolean resault;

        while (indexFindPrimeNumber < value.length && !(checkPrimeNumberIs(value[indexFindPrimeNumber]))) {
            resault = checkPrimeNumberIs(value[indexFindPrimeNumber]);
            indexFindPrimeNumber++;
        }
        if (indexFindPrimeNumber < value.length && (checkPrimeNumberIs(value[indexFindPrimeNumber]))) {
            resault = true;
        }
        else {
            resault = false;
        }
        return resault;
    }
}
