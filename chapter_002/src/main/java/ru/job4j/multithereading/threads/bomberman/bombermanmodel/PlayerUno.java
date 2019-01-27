package ru.job4j.multithereading.threads.bomberman.bombermanmodel;

public class PlayerUno extends Figure {

    /**
     * имя фигуры.
     */
    String name;

    String color;
    /**
     * клетка которую занимает фигура.
     */
    Cell myPlace;

    int numKoord;
    boolean Bomb;


    /**
     * конструктор фигуры игрока
     *
     * @param name,   фигуры, которая ходит.
     * @param color,  Фигуры, которая ходит.
     * @param myPlace клетка занимаемая Фигурой, которая ходит.
     */
    public PlayerUno(String name, String color, Cell myPlace) {
        super(name, color, myPlace);
        Bomb = true;
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

    public boolean isBomb() {
        return Bomb;
    }

    public void setMyPlace(Cell myPlace) {
        this.myPlace = myPlace;
    }


}
