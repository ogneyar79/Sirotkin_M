package ru.job4j.collection.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.Optional;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TreeTest {


    Node<Integer> rootNode = new Node<>(0);

    Tree<Integer> treeObgect = new Tree<>(rootNode);


    @Before
    public void setUp() throws Exception {

        treeObgect.add(0, 1);
        treeObgect.add(0, 2);

    }

    @Test
    public void add() throws Exception {
        Iterator treeIterrator = treeObgect.iterator();
        assertThat(treeIterrator.next(), is(0));
        assertThat(treeIterrator.next(), is(1));
    }

    @Test
    public void findBy() throws Exception {
        Optional<Node<Integer>> rsl = treeObgect.findBy(2);
        Node<Integer> result = rsl.get();

        assertThat(result.getValue(), is(2));
    }

    @Test
    public void iterator() throws Exception {
    }

}