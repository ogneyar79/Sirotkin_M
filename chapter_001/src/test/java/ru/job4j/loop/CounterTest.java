package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    /**
     * We test sub value of range.
     * @author Sirotkin
     *  @since  07.07.2017
     */
public class CounterTest {

    /**
     * Chek method int add.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter sumRange = new Counter();
		sumRange.add(1, 10);
		int result = sumRange.add(1, 10);
	    int expected = 30;
	assertThat(result, is(expected));
    }
}