package ru.job4j.collection.tree;

import org.junit.Before;
import org.junit.Test;

public class TreeTest {
    Integer [] forArraysA = {1, 2, 3};
    Integer [] forArraysB = {4, 5, 6};
    Integer [] forArraysC = {7, 8, 9};
           ArrayWithComparableForTree<Integer> arrays = new ArrayWithComparableForTree<>(forArraysA);

    Tree<ArrayWithComparableForTree<Integer>> treeTest = new Tree<>();



    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void add() throws Exception {
    }

    @Test
    public void findBy() throws Exception {
    }

    @Test
    public void iterator() throws Exception {
    }

}