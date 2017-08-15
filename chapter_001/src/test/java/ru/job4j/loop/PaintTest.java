package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ %s^^^\r\n", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }

    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
       //�������� ����� ����, ����������� ������������ �������� ��� ������ 3.
	   
	   Paint pyramid = new Paint();
	   String result = pyramid.piramid(3);
       String expected = String.format("  ^  %s ^^^ \r\n^^^^^\r\n", System.getProperty("line.separator"));
       assertThat(result, is(expected));
    }
}