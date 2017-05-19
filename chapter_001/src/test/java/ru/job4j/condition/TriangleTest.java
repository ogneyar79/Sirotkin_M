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
	Point a1=new Point(0D,0D);
	Point b2=new Point(2D,2D);
	Point c3=new Point(3D,3D);
	
	double result = s;
	double expected = 12;
	assertThat(result, is(expected));
	}
	}