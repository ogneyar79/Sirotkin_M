package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;

public class ListCompare implements Comparator<List<Integer>> {
    @Override
    public int compare(List<Integer> left, List<Integer> right) {
        return left.equals(right) ? 0 : left.size() - right.size() == 0 ? 1 : -1;
    }
}