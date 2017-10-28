package ru.job4j.JChess;


public  class Cell_1 {

    final int cell_x, cell_y;
    final int cell_oneCoordinate;


    public Cell_1(int cell_x, int cell_y, int cell_oneCoordinate) {
        this.cell_x = cell_x;
        this.cell_y = cell_y;
        this.cell_oneCoordinate = cell_oneCoordinate;
    }

    public int getCell_x() {
        return cell_x;
    }

    public int getCell_y() {
        return cell_y;
    }

    public int getCell_oneCoordinate() {
        return cell_oneCoordinate;
    }
}
