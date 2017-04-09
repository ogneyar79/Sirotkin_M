package ru.job4j.calculator;
/**
* Класс Calculate для примитивных расчетов.
*
* @author Sirotkin.
*/
public class Calculator {
	/**
     *@ param value Value
     */
    private double result;

	/**
	  * method for add.
	  * @param first get double value and add with second
	  * @param second get double value
	  */
    public void add(double first, double second) {
        this.result = first + second;
    }

	/**
	  * method for subtraction.
	  * @param first get double value and sub with second
	  * @param second get double value
	  */
	public void sub(double first, double second) {
		this.result = first - second;
	}

	/**
	  * method for division.
	  * @param first get double value and div with second
	  * @param second get double value
	  */
    public void div(double first, double second) {
	this.result = first / second;
	}

	/**
	  * method for multiplication.
	  * @param first get double value and multiple with second
	  * @param second get double value
	  */
	public void multiple(double first, double second) {
		this.result = first * second;
	}

	/**
	  * method for getting result from arithmetic expression.
	  * @return.
	  *\
    public double getResult() {
        return this.result;
    }
}