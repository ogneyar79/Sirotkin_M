package ru.job4j.collection.Map;

import java.util.*;

public class User {

    String name;

    int children;

    Calendar birthday;


    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        Calendar birthday = new GregorianCalendar(21,02,1990);

        User userOne = new User("Ivan", 2, birthday);
        User userTwo = new User("Ivan", 2, birthday);

        Map<User, Object> usrs = new HashMap<>();
        usrs.put(userOne, new Object());
        usrs.put(userTwo, new Object());
        System.out.println(usrs);

    }



}
