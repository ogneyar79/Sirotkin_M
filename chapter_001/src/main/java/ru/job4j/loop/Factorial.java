package ru.job4j.loop;
/**
* ������ Factorial ��� ���������� ����������.
*
* @author Sirotkin.
*/
public class Factorial {

	/**
	 * method for calc factorial.
	 *
	 * @param n int value factorial
	 * @return fact value
	 */
	 public int calc(int n) {
	 	int fact = 1;
		if (n == 0) {
			fact = 1;
		} else {
			for (int i = 2; i <= n; ++i) {
				fact *= i;
			}
		}
		return fact;
	}
}
