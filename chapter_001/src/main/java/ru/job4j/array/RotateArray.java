package ru.job4j.array;
/**
 * ����� RotateArray, ��������� ������ �� ������� �������.
 *
 * @author Sirotkin.
 */
public class RotateArray {

    /**
     * method for turn two-dimensional array by 90 grades.
     *
     * @param array int[]values
     *    @return the array
     */
    public int[][] rotate(int[][] array) {

        int half = array.length / 2;

        for (int i = 0; i < half; i++) {


            for (int j = i; j < array[i].length - (1 + i); i++) {

                int t = array[ i ][ j ];
                array[ i ][ j ] = array[ array[i].length - 1 - j ][ i ]; //0.0=2.0
                array[ array[i].length - 1 - j ][ i ] = array[ array[i].length - 1 - i][ array[i].length - 1 - j ];     //2.0=2.2
                array[ array[i].length - 1 - i ][ array[i].length - 1 - j ] = array[ j ][ array[i].length - 1 - i ]; // 2.2=0.2
                array[ j ][ array[i].length - 1 - i ] = t;
            }
        }
       return array;
  }

   }
