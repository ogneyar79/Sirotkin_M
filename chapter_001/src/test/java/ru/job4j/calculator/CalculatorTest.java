 package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

   /**
     * We test calculator.
     * @author Sirotkin
     *  @since  08.04.2017
     */
public class CalculatorTest {

	/**
      * Chek compound addition.
      */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

	/**
      * Chek compound subtraction.
      */
	@Test
	public void whenSubstructOneSubTwo() {
	    calc.sub(2D, 1D);
		double result = calc.getResult();
	    double expected = 1D;
	    assertThat(result, is(expected));
	}

	/**
      * Chek compound division.
      */
	@Test
	public void whenDivisionOneDivTwo() {
		calc.div(2D, 1D);
	    double result = calc.getResult();
	    double expected = 2D;
	    assertThat(result, is(expected));
	}

	/**
      * Chek compound multiplication.
      */
	@Test
	public void whenMultiplicationOneMultipleTwo() {
		calc.multiple(1D, 1D);
	    double result = calc.getResult();
	    assertThat(result, is(expected));
	}
}