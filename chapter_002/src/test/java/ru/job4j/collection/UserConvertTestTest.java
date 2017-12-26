package ru.job4j.collection;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserConvertTestTest {


    /**
     * we test method convert list of User to HashMap.
     */
    @Test
        public void whenConvertListUserToHashMap() {
        UserConvert forConvertUser = new UserConvert();
        forConvertUser.listUser.add(new User(0, "Ivan", "Moscow"));
        forConvertUser.listUser.add(new User(1, "Liza", "Moscow"));
        forConvertUser.listUser.add(new User(2, "Robert", "Norilsk"));
        forConvertUser.listUser.add(new User(3, "Yana", "Tula"));
        forConvertUser.process(forConvertUser.listUser);
        forConvertUser.usersList = forConvertUser.process(forConvertUser.listUser);
        System.out.print(forConvertUser.usersList);
        assertThat(forConvertUser.usersList.get(0), is( forConvertUser.listUser.get(0)));
    }






}