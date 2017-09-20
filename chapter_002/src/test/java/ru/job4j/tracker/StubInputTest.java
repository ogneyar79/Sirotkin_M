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


    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {

        Tracker tracker = new Tracker();

        Item item = tracker.add(new Item("test NAME", "deskTest",123L));
        //создаём StubInput с последовательностью действий
        String userChoice = "2";
        String id = item.getId();
        String name = "test name";
        String description = "desc";
        String exit = "6";
        IInput input = new StubInput(new String[]{userChoice, id, name, description, exit});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }

    @Test
    public void whenDeleteThenTrackerHasDeletedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test NAME", "deskTest",123L));
        Item item1 = tracker.add(new Item("ttt", "DDD", 123L));
        String userChoice = "3";
        String id = item.getId();

        String exit = "6";
        IInput input = new StubInput(new String[]{userChoice, id, exit});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.getAll()[0], is(item1));
    }

    @Test
    public void whenFindeByNameThenTrackerHasSameNameValue() {

        Tracker tracker = new Tracker();

        Item item = tracker.add(new Item("test NAME", "deskTest",123L));
        //создаём StubInput с последовательностью действий
        String userChoice = "5";
        String name = "test NAME";
        String exit = "6";
        IInput input = new StubInput(new String[]{userChoice, name, exit});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.getAll()[0].getName(), is ("test NAME"));
    }

    }

