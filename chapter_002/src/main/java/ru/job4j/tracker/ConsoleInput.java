package ru.job4j.tracker;


import java.util.Scanner;

public class ConsoleInput implements IInput {

    private Scanner scanner = new Scanner(System.in);

   public String ask (String question) {
         System.out.println(question);
       return scanner.nextLine();
    }

}

