package ru.job4j.tracker;


import java.util.Scanner;

/**
 * класс IInput for enter text.
 *
 * @author Sirotkin.
 *
 */
public class StubInput implements IInput {

    private String userChoice;

    /**
     *@ param value String [] answers.
     */
    private String[] answers;

    /**
     *@ param value position int.
     */
    private int position = 0;

    /**
     *@ param field String question.
     * for hand text to method
     */
    private String question;

    /**
     * method for creaction StubInput object.
     * @param  answers [] String
     *
     */
    public StubInput(String[] answers) {

        this.answers = answers;
    }

    /**
     *@ param field Scanner.
     * for realisation read entering text
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * method for input and ofput text.
     * @param  question String
     * @return String s
     */
    public String ask(String question) {

        this.question = question;

        System.out.println(this.question);

        System.out.println(" DDDD");
        for (int position = 0; position <= answers.length; ) {

        }

       return answers[position++];
    }



/**
 * method for get scanner.
 *
 * @return scanner
 */
public Scanner getScanner() {
        return scanner;
    }
}