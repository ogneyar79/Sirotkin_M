package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * класс StartUI for cooperation menu and class of programs Trecer.
 *
 * @author Sirotkin.
 *
 */
public class StartUI {

    /**
     *@ param field input IInput userChoice.
     *
     */
private IInput input;


private Tracker tracker;

    /**
     *@ param field String userChoice.
     * for comparing with constants
     */
  private String userChoice;


    /**
     *@ param field String s.
     * for comparing with constants
     */
     private String s;

    /**
     *for getting S.
     * @return s
     *
     */
    public String getS() {
        return s;
    }



    /**
     *@ param field Scanner scanner.
     *
     */
 private Scanner scanner = new Scanner(System.in);


    List<String> answers;

    /**
     *for getting scanner.
     * @return scanner
     */
    public Scanner getScanner() {
        return scanner;
    }


    /**
     *@ param field String ADITEM.
     * constant for comparing
     */
    private static final String ADDITEM = "0";

    /**
     *@ param field String SHOWALL.
     * constant for comparing
     */
    private static final String SHOWALL = "1";

    /**
     *@ param field String EDIT.
     * constant for comparing
     */
    private static final String EDIT = "2";

    /**
     *@ param field String DELETE.
     * constant for comparing
     */
    private static final String DELETE = "3";

    /**
     *@ param field String FINDID.
     * constant for comparing
     */
    private static final String FINDID = "4";

    /**
     *@ param field String FINDNAME.
     * constant for comparing
     */
    private static final String FINDNAME = "5";

    /**
     *@ param field String EXIT.
     * constant for comparing
     */
    private static final String EXIT = "6";

    /**
     *@ param field String YES.
     * constant for comparing and exit
     */
    private static final String YES = "0";

    /**
     *@ param field String NO.
     * constant for comparing and exit
     */
    private static final String NO = "1";


    private static final String BREAKKK = "7";

    /**
     *@ param field ConsoleInput consoleInput object.
     * have list menu as array
     */
private ConsoleInput consoleInput = new ConsoleInput();

    /**
     * method for creaction SrartUI object.
     * @param  input IInput
     *
     */
public StartUI(IInput input) {
      this.scanner = input.getScanner();
    this.input = input;
}

public StartUI(IInput input, Tracker tracker) {
    this.scanner = input.getScanner();
       this.input = input;
       this.tracker = tracker;
}

    /**
     *for getting userChoice.
     * @return userChoice
     */
    public String getUserChoice() {
        return userChoice;
    }

    /**
     *for getting consoleinput.
     * @return consoleInput
     */
    public ConsoleInput getConsoleInput() {
        return consoleInput;
    }



    List<Integer> range;

    /**
     * method for menu work and cooperation with orders.
     *
     */
public void init() {
    Tracker tracker = new Tracker();

      MenuTracker menu = new MenuTracker(this.input, tracker);
       range = new ArrayList<Integer>();
      range.add(0);
      range.add(1);
      range.add(2);
      range.add(3);
      range.add(4);
      range.add(5);
      range.add(6);

      menu.fillActionInit();
        do {
              System.out.println(range.size());
             menu.show();
            menu.select(input.ask("Select:", range));
        } while (!"Y".equals(this.input.ask("Exit?, Y")));
        }

    /**
     * method for enter at program.
     * @param args []String
     */
public static void main(String[]args) {

          IInput input = new ValidateInput();
     new StartUI(input).init();

}

}





