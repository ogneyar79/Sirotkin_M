package ru.job4j.array;

import java.util.Arrays;

/**
 * ����� ArrayDuplicate, ��� �������� ���������� ����� �� �������.
 *
 * @author Sirotkin.
 */
public class ArrayDuplicate {
    String[] array;
    int sum = 0;
    int count = 0;

    /**
     * method for sort array to the end and delete double.
     *
     * @param array String [] values
     */
    public String[] remove(String[] array) {
        String t;
        int stResult;
        this.array = array;
        count = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println(array[i] + "i" + i + "and" + "j" + j + array[j]);
                stResult = array[i].compareTo(array[j]); // последний(5) сравнивается с 0, затем последний с 1,2,3.4 ..4 с , 0,1

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
