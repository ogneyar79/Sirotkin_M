package ru.job4j.tracker;


import java.util.Scanner;

public class ConsoleInput implements IInput {

    private String [] answers;

    private int position;

    public Scanner getScanner() {
        return scanner;
    }

    private Scanner scanner = new Scanner(System.in);

     String question;
   public String ask (String question) {
       String s;
          this.question = question;
         System.out.println(this.question);
         for (int position = 0; position < answers.length; position++) {
         System.out.println(this.answers[position]);}
             s = scanner.nextLine();


                 return s;
    }

    public ConsoleInput (String [] answers){

        this.answers = answers;

    }




}

