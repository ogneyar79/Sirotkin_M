package ru.job4j.array;
/**
* ������BubbleSort  ��� ���������� ���������.
*
* @author Sirotkin.
*/
public class BubbleSort {

    int[]array;

     /**
	   * method for sort array by bubble.
       *@param  array int[] values
	   */
public int[] sort(int[] array) {

     this.array = array;


      for (int i=array.length-1;i>=0;--i)
          for (int j = 0; j < i; ++j) {
              if (array[ j ] > array[ j + 1 ]) {
                  int t = array[ j ];
                  array[ j ] = array[ j + 1 ];
                  array[ j + 1 ] = t;
              }
          }
	return array;
    }
}




