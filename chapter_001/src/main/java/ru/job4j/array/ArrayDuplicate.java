package ru.job4j.array;

import java.util.Arrays;

/**
 * ArrayDuplicate.
 *
 * @author Sirotkin.
 */
public class ArrayDuplicate {

    /**
     * method for sort array to the end and delete double.
     *
     * @param array String [] values
     * @return the Arrays.copyOf()
     */
    public String[] remove(String[] array) {
        String t;
        int stResult;
      int  count = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println(array[i] + "i" + i + "and" + "j" + j + array[j]);
                stResult = array[i].compareTo(array[j]);

                if (stResult == 0) {

                    t = array[array.length - 1 - count];
                    array[array.length - 1 - count] = array[i];
                    array[i] = t;
                    count++;
                    break;

                }
            }
        }

        return Arrays.copyOf(array, (array.length - count));
    }
}
