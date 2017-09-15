package ru.job4j.tracker;

import java.util.Scanner;


public class StartUI {


private IInput input;

 String userChoice;

String s;

Scanner scanner;

    private static final String ADDITEM = "0";

    private static final String SHOWALL = "1";

    private static final String EDIT = "2";

    private static final String DELETE = "3";

    private static final String FINDID = "4";

    private static final String FINDNAME = "5";

    private static final String EXIT = "6";

ConsoleInput consoleInput = new ConsoleInput(new String [] {"0. Add new Item", "1. Show all items", "2. Edit item ", "3.Delete item", "4. Find item by Id",
        "5. Find items by name", "6. Exit Program", "Select"});


public StartUI (IInput input){
     this.scanner = consoleInput.getScanner();
    this.input = input;
}

public void init () {
    String s;

    Tracker tracker = new Tracker();
    userChoice = this.consoleInput.ask("LLL ");
    if (ADDITEM.equals(userChoice)) ;
    {
        System.out.print("Прошу Вас уазать ваше имя");
        String name;
        name = scanner.nextLine();
        Item item = new Item().inputName();
        System.out.println("Прошу Вас указать описание заявки ");
        String description;

        description = scanner.nextLine();

        item.inputDescription();

        tracker.add(item);


    }

    if (SHOWALL.equals(userChoice)) {

    }
}



public static void main (String[]args) {

     new StartUI( new ConsoleInput(new String [] {"0. Add new Item", "1. Show all items", "2. Edit item ", "3.Delete item", "4. Find item by Id",
            "5. Find items by name", "6. Exit Program", "Select"})).init();



}
}

/**[8:39 PM] Alex Krasnopolsky: допустим у тебя есть константа ADD = "0"
        [8:39 PM] Alex Krasnopolsky: что соответствует пункту меню 0
        [8:39 PM] Maksim: так
        [8:39 PM] Alex Krasnopolsky: if userChoice.equals(ADD)
        [8:40 PM] Alex Krasnopolsky: метод добавления итема
        [8:40 PM] Alex Krasnopolsky: и так по всем пунктам меню
*/



