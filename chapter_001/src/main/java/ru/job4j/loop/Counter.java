package ru.job4j.loop;
 /**
   *  класс Counter  для пдсчета суммы  чисел в диапазоне от start до finish.
   *
   * @author Sirotkin.
  * @return the sum
  */
   public class Counter {


	 /**
	   * method for add sum.
       *@param start int value
	   *@param finish int value
	   * @return sum value
	   */
	 public int add(int start, int finish) {
		int sum = 0;

		for (int i = start; i <= finish; ++i) {
		if (i % 2 == 0) {
		sum = sum + i;
		}
		System.out.println("i" + i + "sum" + sum);
		}
		return sum;
		}
		}
