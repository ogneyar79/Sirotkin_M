package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

   /**
     * We test max.
     * @author Sirotkin
     *  @since  12.04.2017
     */

	 public class MaxTest {

	 /**
       * Chek max value.
       */
     @Test
	 public void whenFirstmoreSecond() {
		 Max maximum = new Max();
     	 maximum.max(2D, 4D);
		 double expected = 4D;
         assertThat(max, is(expected));
	 }
	 	 }