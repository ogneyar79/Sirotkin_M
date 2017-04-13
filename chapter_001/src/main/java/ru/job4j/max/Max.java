package ru.job4j.max;
/**
* †класс Max дл€  определени€ максимального числа из двух.
*
* @author Sirotkin.
*/
public class Max {
	/**
     *@ param value Value
     */
	private int max;

	/**
	  * method for max.
      * @param first get int value
	  * @param second get int value
	  * @return max.
	  */
	  public int max(int first, int second) {
            if (first > second) {
     		    max = first;
            } else if (first == second) {
     		    max = first;
		    } else {
         		max = second;
		}
		return this.max;
    }

}