package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
 /**
  * We test for remove duplicate at array.
  * @author Sirotkin
  *  @since  31.08.2017
  */
public class ArrayDuplicateTest {

     /**
      * Chek method String[] remove.
      */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //�������� ����� ����, ����������� �������� ���������� ����� �� ������� �����.
        ArrayDuplicate words = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] resultArray = words.remove(array);
        String[] expectArray = {"Привет", "Мир", "Супер"};
        assertThat(resultArray, is(expectArray));
    }
}
