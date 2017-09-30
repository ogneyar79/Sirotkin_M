package ru.job4j.tracker;


import java.util.Scanner;

/**
 * interface IInput for package ru.job4j,tracker.
 *
 * @author Sirotkin.
 *
 */
public interface IInput {
   Scanner scanner = new Scanner(System.in);
    /**
     * method for Iinput and ofput text in our package.
     * @param  question String
     * @return s String
     */
    String ask(String question);


    int ask(String question, int[] range);


}
