package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

   /**
     * We test If the point lay on our function(y(x) = a * x + b).
     * @author Sirotkin
     *  @since  17.04.2017
     */
public class PointTest {

	/**
      * Chek method boolean is.
      */
    @Test
	public void whenOurPointLayOnOurFunction() {
		Point ourPoint = new Point();
		  ourPoint.getX(1D);
		  ourPoint.getX(1D);
		  ourPoint.boolean is(1D, 1D);
		  double expected = false;
	      assertThat(result, is(expected));
    }
}
