package ru.job4j.max;
/**
* ������ Max ���  ����������� ������������� ����� �� ����.
*
* @author Sirotkin.
*/
public class Max {

	/**
	  * method for max.
      * @param first get int value
	  * @param second get int value
	  * @return max.
	  */
	  public int max(int first, int second) {

	/**
     *@ param value Value
     */
          int max;

	   max = first > second ? first : second;
     	   return max;
    }

}