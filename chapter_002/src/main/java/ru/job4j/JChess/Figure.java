package ru.job4j.JChess;

public abstract class Figure {


    final String name;
      Cell_1 currentPosition;
    final Cell_1 firstPosition;

    public Figure(final String name, Cell_1 currentPosition, final Cell_1 firstPosition) {
        this.name = name;
        this.currentPosition = currentPosition;
        this.firstPosition = firstPosition;

    }


    /*Добавить в класс Figure абстрактный метод Cell[] way(Cell dist) throw ImposibleMoveException
    Метод должен работать так. dist - задают ячейку куда следует пойти. Если фигура может туда пойти. то Вернуть массив ячеек. которые должна пройти фигура.
    Если фигура туда пойти не может. выбросить исключение ImposibleMoveException
    */

   public abstract Cell_1[] way(Cell_1 dist);


}
