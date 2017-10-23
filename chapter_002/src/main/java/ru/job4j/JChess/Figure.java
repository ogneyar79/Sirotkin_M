package ru.job4j.JChess;

public abstract class Figure {


     String name;
     Cell_1 currentPosition;
    Cell_1 firstPosition;

    public Figure(String name, Cell_1 currentPosition, Cell_1 firstPosition) {
        this.name = name;
        this.currentPosition = currentPosition;
        this.firstPosition = firstPosition;
    }

  public abstract Figure move();
}
