package ru.job4j.collection.statistickollection;

import java.util.List;

public class Store {

    /**
     * информируют объект о количестве добавленных и удалленнх, измененных элементов путем сравнения двух коллекций.
     *
     * @param previoues предыдущая коллекция.
     * @param current   текущая коллекция
     *
     * @return Info возвращаемый Info объект.
     */
    Info diff(List<User> previoues, List<User> current) {
        Info infoObject = new Info();
        infoObject.makeInfoAboutAddadedElements(previoues, current);
        infoObject.showChangedElement(previoues, current);
        for (String s : infoObject.getListInfo()) {
            System.out.println(s);
        }
        return infoObject;
    }

    static class User {
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
