package ru.job4j.collection.statistickollection;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StoreTest {
    List<Store.User> previoues;
    List<Store.User> current;
    Store store;

    @Before
    public void setUp() throws Exception {
        previoues = new ArrayList<>();
        current = new ArrayList<>();
        previoues.add(new Store.User(0001, "Vasilio"));
        previoues.add(new Store.User(0002, "Maksimus"));
        previoues.add(new Store.User(0003, "Olya"));
        previoues.add(new Store.User(0004, " Karina"));
        current.add(new Store.User(0001, "Vasilio"));
        current.add(new Store.User(0002, "Maksimus"));
        current.add(new Store.User(0003, "Olya"));
        current.add(new Store.User(0004, " Karina"));
        current.remove(2);
        current.add(new Store.User(0005, "Evgenia"));
        current.get(2).setName("Carina");
        store = new Store();
        store.diff(previoues, current);
    }

    @Test
    public void diff() throws Exception {
    }

}