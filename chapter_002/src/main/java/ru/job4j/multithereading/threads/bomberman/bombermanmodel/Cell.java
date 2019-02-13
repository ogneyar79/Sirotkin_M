package ru.job4j.multithereading.threads.bomberman.bombermanmodel;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Клетка игрового поля.
 */
public class Cell {

    /**
     * массив ReentrantLock
     */
    final ReentrantLock[][] board;

    public void setCellLock(ReentrantLock cellLock) {
        this.cellLock = cellLock;
    }

    /**
     * поле Reentrantlock, связанное с Cell общими координатами
     */
    ReentrantLock cellLock;

    /**
     * Внутренние поля класса, координаты
     */
    int koordinateLineX;
    int koordinateLinecolumneY;

    /**
     * порядковый номер Cell
     */
    int numKoord;

    /**
     * поле показывающее, занята ли ячейка.
     */
    boolean freeCell;

    /**
     * Конструктор игровой клетки.
     *
     * @param board                  связанный координатами с клетками массив блокирующих объектов.
     * @param koordinateLineX        оордината нахождения игрока по оси x.
     * @param koordinateLinecolumneY координата нахождения игрока по оси y.
     */
    public Cell(ReentrantLock[][] board, int koordinateLineX, int koordinateLinecolumneY) {
        this.board = board;
        this.cellLock = board[koordinateLineX][koordinateLinecolumneY];
        this.koordinateLineX = koordinateLineX;
        this.koordinateLinecolumneY = koordinateLinecolumneY;
        this.cellLock = board[koordinateLineX][koordinateLinecolumneY];
    }

    public void setNumKoord(int numKoord) {
        this.numKoord = numKoord;
    }

    /**
     * Получение координаты по оси X.
     *
     * @return Координата по оси X.
     */
    public int getKoordinateLineX() {
        return koordinateLineX;
    }


    /**
     * Получение координаты по оси Y.
     *
     * @return Координата по оси Y.
     */
    public int getKoordinateLinecolumneY() {
        return koordinateLinecolumneY;
    }


    public boolean isFreeCell() {
        return freeCell;
    }

    /**
     * Получение порядкового номера клетки.
     *
     * @return порядковый номер клетки.
     */
    public int getNumKoord() {
        return numKoord;
    }

    /**
     * Установка координаты по оси X.
     *
     * @param koordinateLineX координаты по оси X.
     */
    public void setKoordinateLineX(int koordinateLineX) {
        this.koordinateLineX = koordinateLineX;
    }

    /**
     * Установка координаты по оси Y.
     *
     * @param koordinateLinecolumneY кординаты по оси Y.
     */
    public void setKoordinateLinecolumneY(int koordinateLinecolumneY) {
        this.koordinateLinecolumneY = koordinateLinecolumneY;
    }

    public void cellInfo() {
        System.out.println(getNumKoord());
        System.out.println(getKoordinateLineX());
        System.out.println(getKoordinateLinecolumneY());
    }
}
