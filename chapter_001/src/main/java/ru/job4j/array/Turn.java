package ru.job4j.array;
/**
* ������ Turn ��� ���������� �������.
*
* @author Sirotkin.
*/
public class  Turn {

      /**
	   * method for array backward.
       *@param array int [] values
       *@return the array
	   */
      public int[] back(int[]array) {

// 4,1,5.6

	 for (int i = (array.length - 1); i > 0; i--) {
         for (int j = 0; j < i; ++j) {
             int t = array[ j ];
             array[ j ] = array[ j + 1 ];
             array[ j + 1 ] = t;
         }
     }
	 return array;
 }
}