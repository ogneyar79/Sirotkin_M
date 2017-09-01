package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
  * We test sub at substring.
 *  @author Sirotkin
  *  @since  31.04.2017
  */
public class SubstringTest {

     /**
       * Chek method boolean contains.
       */
     @Test

    public void whenCheckSubIsInOrigin() {
        Substring originWords = new Substring();
        String orW = "Привет";
        String orsubW = "иве";
        boolean result = originWords.contains(orW, orsubW);
        boolean expected = true;
        assertThat(result, is(expected));

    }
}