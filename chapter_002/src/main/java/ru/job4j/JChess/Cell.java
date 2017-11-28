package ru.job4j.JChess;


public  class Cell {

    final int cell_x, cell_y;
    final int cell_oneCoordinate;
    private int color; // white

    public Cell(int cell_x, int cell_y, int cell_oneCoordinate,  int color) {
        this.cell_x = cell_x;
        this.cell_y = cell_y;
        this.cell_oneCoordinate = cell_oneCoordinate;
        this.color = color;
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

    public int getColor() {
        return color;
            }

    public void setColor(final int color) {

        if (color ==0 || color == 1) {
        this.color = color; }
        else  { this.color = 0;
        }
    }
}
