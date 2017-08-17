package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        //�������� ����� ����, ����������� ��������� ������� � ������ ������ ���������, �������� {2, 6, 1, 4}.

        Turn turn=new Turn();
         int[]b={4,1,6,2};
         int[] result = turn.back(b);
		int [] expected = {2,6,1,4};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn=new Turn();
        int[]array={1,2,3,4,5};
        int[] resultArray = turn.back(array);
        int [] expectedArray = {5,4,3,2,1};
        assertThat(resultArray, is(expectedArray));

    }
}