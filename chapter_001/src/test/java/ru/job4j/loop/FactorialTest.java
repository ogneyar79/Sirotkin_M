package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
   * We test int calc for factorial.
   *  @author Sirotkin
   *  @since  31.04.2017
   */
public class FactorialTest {

     /**
      * Chek method int calc for 5.
      */
	@Test
	public void whenCalculateFactorialOneHundreedTwenty() {
		Factorial fF = new Factorial();
		fF.calc(5);
		int result = fF.calc(5);
	    int expected = 120;
	assertThat(result, is(expected));
	}

     /**
      * Chek method int calc for 0.
      */
	@Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial fF = new Factorial();
        fF.calc(0);
        int result = fF.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }

}