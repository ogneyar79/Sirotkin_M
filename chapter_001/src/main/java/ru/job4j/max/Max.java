package ru.job4j.max;
/**
* ������ Max ���  ����������� ������������� ����� ��.
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
	  public double max(double first, double second) {

	/**
     *@ param value Value
     */
          double max;

	   max = first > second ? first : second;
     	   return max;
    }
	
	/**
	  * metod for max from 3 point.
	  * @param
	  * @param
	  * @param
	  * @return
	  */
    public double maxOf3(double first, double second, double third) {
		
			return max(first, max(second, third));
			}
}