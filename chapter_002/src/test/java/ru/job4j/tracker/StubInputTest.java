package ru.job4j.tracker;

import  org.junit.Test;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;


/**
 * We test different method for testing class StubInput.
 *  @author Sirotkin
 *  @since  17.09.2017
 */
public class StubInputTest {

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        String userChoice = "0";
        String name = "test name";
        String description = "desc";
        IInput stubInputad = new StubInput (new String[]{userChoice, name, description, });

        new StartUI(stubInputad, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }



}
