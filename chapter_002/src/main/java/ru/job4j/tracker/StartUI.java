package ru.job4j.tracker;



public class StartUI {

private IInput input;

public StartUI (IInput input){

    this.input = input;
}

public void init () {

    String name = input.ask(" What");
    Tracker tracker = new Tracker();
    tracker.add(new Item());
    }

public static void main (String[]args) {

  new StartUI(new StubInput(new String[]{"create stubTask"})).init();
}

new StartUI(new ConsoleInput())
}