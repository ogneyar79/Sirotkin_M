package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
  * We test array one step like watch.
  * @author Sirotkin
  *  @since  31.04.2017
  */
public class RotateArrayTest {

    /**
     * Chek method int[][] rotate for array 2*2.
     */
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        //�������� ����� ����, ����������� ������� ������� �������� 2 �� 2.
        RotateArray q22Q = new RotateArray();
        int[][] array = {{1, 2}, {3, 4}};
        int[][] resultArray  = q22Q.rotate(array);
        int[][] expectArray = {{3, 1}, {4, 2}};
        assertThat(resultArray, is(expectArray));


    }

    /**
     * Chek method int[][] rotate for array 3*3.
     */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        //�������� ����� ����, ����������� ������� ������� �������� 3 �� 3.
        RotateArray q33Q = new RotateArray();
            int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int[][] resultArray = q33Q.rotate(array);
            int[][] expectArray = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
            assertThat(resultArray, is(expectArray));

        }
    }

