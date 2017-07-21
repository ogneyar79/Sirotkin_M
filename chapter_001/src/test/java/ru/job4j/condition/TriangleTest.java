package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.hamcrest.number.IsCloseTo.closeTo;

   /**
     * We test calculation value of triangle area.
     * @author Sirotkin
     *  @since  19.05.2017
     */
public class TriangleTest {
	
	/**
      * Chek method double area.
      */
	@Test
	public void forCalculationTriangleArea() {
	Triangle a1B2c2 = new Triangle( );
	Point a1=new Point(0,0);
		a1.getX();
		a1.getY();
	Point b2=new Point(2,2);
	b2.getX();
	b2.getY();
	Point c3=new Point(3,3);
	c3.getX();
	c3.getY();
	a1B2c2.area();
	double result = a1B2c2.area();
	double expected = 12;
	assertThat(result, is(expected));
	}
	}