package ru.job4j.loop;
/**
* ������ Factorial ��� ���������� ����������.
*
* @author Sirotkin.
*/
public class Factorial {

	/**
	 * @ param int Value for factorial
	 */
	int fact = 1;

	/**
	 * method for calc factorial.
	 *
	 * @param n int value factorial
	 */
	 public int calc(int n) {
	 	fact=1;
		if (n == 0) {
			fact = 1;
		} else {
			for (int i = 2; i <=n; ++i) {
				fact *= i;
			}
		}
		return fact;
	}
}
