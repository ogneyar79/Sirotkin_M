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
     	 double result=maximum.max(2D, 4D);
		 double expected = 4D;
         assertThat(maximum.max(2D, 4D), is(expected));
	 }
	 	 		 
   /**
     * Chek max3 value.
     */
	@Test
	 public void whenWhatMoreOfThree() {
		 Max maximum3=new Max();
		 maximum3.maxOf3(2D,3D,5D);
		 double result = maximum3.maxOf3(2D,3D,5D);
		 double expected = 5D;
		 assertThat(maximum3.maxOf3(2D,3D,5D), is(expected));
      }
	 }
	 
		 
		 
		 
		 