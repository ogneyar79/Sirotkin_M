package ru.job4j.tasksortdeparament;


import java.util.*;

public class DescendingComporatorLow implements Comparator<Map.Entry<String, List<String>>> {


    @Override
    public int compare(Map.Entry<String, List<String>> o1, Map.Entry<String, List<String>> o2) {
        int compare;
        if (o1.getKey().length() < o2.getKey().length()) {
            compare = 1;
        } else if (o1.getKey().length() == o2.getKey().length())

            compare = 0;
        else (o1.getKey().length() > o2.getKey().length()) {
            compare = -1;
        }
        return compare;
    }
}