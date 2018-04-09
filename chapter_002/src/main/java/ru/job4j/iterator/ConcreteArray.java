package ru.job4j.iterator;

public class ConcreteArray implements IArrayIteratorTask {

    int[][] value = {
            {1, 2},
            {3, 4}
    };

    @Override
    public IIterator getIterator() {
        return new IteratorArray();
    }

    public class IteratorArray implements IIterator {
        int index = 0;
        int innerIndex = 0;
        int meaning;
        int current = 0;

        @Override
        public int next() {
            for (int i = 0; i < value.length; i++) {

                for (int j = innerIndex; j < value[i].length; ) {
                    meaning = value[i][j];
                    if (j < value[i].length - 1) {
                        current++;
                        innerIndex++;
                    } else {
                        current++;
                        innerIndex = 0;
                    }
                    break;
                }
                index++;
                break;
            }
            return meaning;
        }

        public int valuesCountArray(int[][] value) {
            int count = 0;
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value[i].length; j++) {
                    count++;
                }
            }
            return count;
        }

        @Override
        public boolean hasNext() {
            return current < valuesCountArray(value) - 1;
        }
    }
}



