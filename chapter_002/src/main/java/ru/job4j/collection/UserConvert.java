package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserConvert {

    /**
     * @ param List</User> field
     */
    List<User> listUser;

    /**
     * @ param Map</Integer, User>field for userList
     */
    Map<Integer, User> usersList;

    /**
     * @ param User user
     */
    User user;

    /**
     * method for convert List<User> to HashMap list.
     * @param list<User>
     * @return the userList
     */
    HashMap<Integer, User> process(List<User> list) {
        this.listUser = list;
        HashMap<Integer, User> userList = new HashMap<>();
        for (User user : listUser) {
            userList.put(user.getId(), user);
        }
        return userList;
    }
}
