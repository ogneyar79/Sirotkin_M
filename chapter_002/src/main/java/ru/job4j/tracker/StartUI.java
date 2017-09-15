package ru.job4j.tracker;

import java.util.Scanner;


/**
 * класс StartUI for cooperation menu and class of programs Trecer.
 *
 * @author Sirotkin.
 *
 */
public class StartUI {


private IInput input;

    /**
     *@ param field String userChoice.
     * for comparing with constants
     */
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

    private static final String Yes = "0";
    private static final String No = "1";

    /**
     *@ param field ConsoleInput consoleInput object.
     * have list menu as array
     */
ConsoleInput consoleInput = new ConsoleInput(new String [] {"0. Add new Item", "1. Show all items", "2. Edit item ", "3.Delete item", "4. Find item by Id",
        "5. Find items by name", "6. Exit Program", "Select"});


public StartUI (IInput input){
     this.scanner = consoleInput.getScanner();
    this.input = input;
}

    /**
     * method for menu work and cooperation with orders.
     *
     */
public void init () {

    while (true) {

        String s;

        Tracker tracker = new Tracker();
        userChoice = this.consoleInput.ask("LLL ");
        if (ADDITEM.equals(userChoice)) {
            System.out.print("Прошу Вас уазать ваше имя");
            String name;
            name = scanner.nextLine();
            Item item = new Item().inputName(name);
            System.out.println("Прошу Вас указать описание заявки ");
            String description;

            description = scanner.nextLine();

            item.inputDescription(description);

            tracker.add(item);


        } else if (SHOWALL.equals(userChoice)) {
            tracker.getAll();

        } else if (EDIT.equals(userChoice)) {
            String id;
            System.out.println("Прошу Вас указать id заявки, которую хотите отредактивровать");
            scanner.nextLine();
            tracker.findById(scanner.nextLine());

            id = tracker.findById(scanner.nextLine()).getId();
            Item item = new Item();
            item.setId(id);
            System.out.print("Прошу Вас уазать name заявки как вы хотитие отредактировать");
            String name;
            name = scanner.nextLine();
            item.inputName(name);

            System.out.println("Прошу Вас указать описание заявки, то что хотите отредактировать ");
            String description;

            description = scanner.nextLine();

            item.inputDescription(description);

            tracker.update(item);

        } else if (DELETE.equals(userChoice)) {

            System.out.println("Прошу Вас id заявки, которую хотите удалить ");
            scanner.nextLine();
            tracker.findById(scanner.nextLine());
            String id;
            id = tracker.findById(scanner.nextLine()).getId();
            Item item = new Item();
            item.setId(id);

            id = tracker.findById(scanner.nextLine()).getId();
            tracker.delete(item);

        } else if (FINDID.equals(userChoice)) {
            System.out.println("Прошу Вас id заявки, которую хотите найти ");
            scanner.nextLine();
            tracker.findById(scanner.nextLine());                                     // Куда девать эту заявку далее?


        } else if (FINDNAME.equals(userChoice)) {
            System.out.println("Прошу Вас указать ключь(name) заявки, которую хотите найти ");
            scanner.nextLine();
            tracker.findByName(scanner.nextLine());

        } else if (EXIT.equals(userChoice)) {

            ConsoleInput consoleInput2 = new ConsoleInput(new String[]{"0. Да", "1. Нет"});
            consoleInput2.ask("Вы уверенны, что хотите выйти из программы? Наберите 0 или 1");
            scanner.nextLine();
            if (No.equals(userChoice)) {
                new StartUI(new ConsoleInput(new String[]{"0. Add new Item", "1. Show all items", "2. Edit item ", "3.Delete item", "4. Find item by Id",
                        "5. Find items by name", "6. Exit Program", "Select"})).init();
            } else {
                       break;
            }


        } else {
            new StartUI(new ConsoleInput(new String[]{"0. Add new Item", "1. Show all items", "2. Edit item ", "3.Delete item", "4. Find item by Id",
                    "5. Find items by name", "6. Exit Program", "Select"})).init();
        }
    }

}



public static void main (String[]args) {

     new StartUI( new ConsoleInput(new String [] {"0. Add new Item", "1. Show all items", "2. Edit item ", "3.Delete item", "4. Find item by Id",
            "5. Find items by name", "6. Exit Program", "Select"})).init();



}
}





