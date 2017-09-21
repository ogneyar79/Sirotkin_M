package ru.job4j.tracker;


import java.util.Scanner;


/**
 * класс ConsoleInput for realisation methods for enter of dates.
 *
 * @author Sirotkin.
 *
 */
public class ConsoleInput implements IInput {

    /**
     *@ param value String [] answers.
     */
    private String[] answers;

    /**
     *@ param value int position.
     * .Show i at arrays answers
     */
    private int position;

    /**
     *@ param field Scanner.
     * for realisation read entering text
     */
    private Scanner scanner = new Scanner(System.in);



    /**
     *@ param field String question.
     * for hand text to method
     */
    private String question;

    /**
     * method for input and ofput text.
     *
     * @param  question String
     * @return String s
     */
   public String ask(String question) {
       String s;
          this.question = question;
         System.out.println(this.question);
         for (int position = 0; position < answers.length; position++) {
         System.out.println(this.answers[position]);
         }
             s = scanner.nextLine();


                 return s;
    }

    /**
     * method for creaction ConsoleInput object.
     * @param  answers [] String
     *
     */
    public ConsoleInput(String[] answers) {

        this.answers = answers;
    }

    /**
     * method for get scanner.
     *
     * @return scanner
     */
    public Scanner getScanner() {
        return scanner;
    }

    /**
     * method for get question.
     *
     * @return question
     */
    public String getQuestion() {
        return question;
    }

}

