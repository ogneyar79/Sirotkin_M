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
	  * method for add
	  * param double first, get double value
	  */
    public void add(double first, double second) {
        this.result = first + second;
    }
	public void sub(double first, double second) {
		this.result = first - second;
	}
	public void div(double first, double second) {
	this.result = first / second;
	}
	public void multiple(double first, double second) {
		this.result = first * second;
	}
    public double getResult() {
        return this.result;
    }
}