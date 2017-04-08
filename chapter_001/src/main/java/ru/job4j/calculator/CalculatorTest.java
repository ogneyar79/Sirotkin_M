 package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
** @author Sirotkin
*  @since  01.03.2017
*/

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

	@Test
	public void whenSubstructOneSubTwo() {
	    calc.sub(2D,1D);
	    double result = calc.getResult();
	    double expected = 1D;
	    assertThat(result, is(expected));
	}

	@Test
	public void whenDivisionOneDivTwo () {
		calc.div(2D,1D);
	    double result = calc.getResult();
	    double expected = 2D;
	    assertThat(result, is(expected));
	}

	@Test
	public void whenMultiplicationOneMultipleTwo () {
		calc.multiple(1D,1D);
	    double result = calc.getResult();
	    assertThat(result, is(expected));
	}
}