package ru.job4j.multithereading.threads.bomberman.bombermanmodel;

/**
 * Базовый класс для создания движущих фигур в игре.
 */
public class Figure {



    String name;

    String color;

    Cell myPlace;

    int numKoord;

    public Figure(String name, String color, Cell myPlace) {
        this.name = name;
        this.color = color;
        this.myPlace = myPlace;
        numKoord = 0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Cell getMyPlace() {
        return myPlace;
    }
    public void setNumKoord(int numKoord) {
        this.numKoord = numKoord;
    }


    public void setMyPlace(Cell myPlace) {
        this.myPlace = myPlace;
    }

    public int getNumKoord() {
        return numKoord;
    }
}
