package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * we test sorting by bubble.
 * @author Sirotkin
 *  @since  31.08.2017
 */
public class BubbleSortTest {

    /**
     * Chek method int[] sort.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        //�������� ����� ����, ����������� ���������� ������� �� 10 ��������� ������� ��������, �������� {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
        BubbleSort bS = new BubbleSort();

        int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};


        int[] resultArray = bS.sort(array);
        int[] expectedArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(resultArray, is(expectedArray));
    }
}