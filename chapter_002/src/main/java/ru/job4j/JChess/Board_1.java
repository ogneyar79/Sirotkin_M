package ru.job4j.JChess;

public class Board_1 {

    Figure[] figures;
    Cell_1[] cel1s;

    public Board_1(Figure[] figures, Cell_1[] cel1s) {
        this.figures = figures;
        this.cel1s = cel1s;
    }

    public Cell_1[] kreateBoard() {
        Cell_1[] cells = new Cell_1[64];
        cells[0] = new Cell_1(0, 0, 0);
        for (int i = 0; i < 64; i++) {
            cells[i] = new Cell_1(i, i, i);
        }
        return cells;
    }
     Board_1 board_1 = new Board_1(figures, cel1s);
         
}
