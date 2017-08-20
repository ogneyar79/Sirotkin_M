package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //�������� ����� ����, ����������� �������� ���������� ����� �� ������� �����.
        ArrayDuplicate words = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир",};
        String[] resultArray = words.remove(array);
        String[] expectArray = {"Привет", "Мир", "Супер"};
        assertThat(resultArray, is(expectArray));
    }
}
