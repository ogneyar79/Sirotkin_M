package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * We test paint.
 *  @author Sirotkin
 *  @since  31.04.2017
 */
public class BoardTest {

    /**
     * Chek method String paint 3*3.
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator"); // ? что это такое данаая строка.
        String expected = String.format("x x%s x %sx x%s", line, line, line); // ?
        assertThat(result, is(expected));
 }

    /**
     * Chek method String paint 5*4.
     */
     @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board1 = new Board();
		String result = board1.paint(5, 4); // ?
		final String line = System.getProperty("line.separator");
		String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line); // ?
        assertThat(result, is(expected));

    }
}

