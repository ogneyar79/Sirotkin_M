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
        cells[0] = new Cell_1(0, 0,0, 0);
        for (int i = 0; i < cells.length; i++) {
            cells[i] = new Cell_1(i, i, i, i);
        }
           for ( int j = 0; j<=7 ; j++) {
            if (j%2 ==0) {
                cells[j].setColor(0);
            }
            else {
                cells[j].setColor(1);
            }
            for ( int l = 8; l <= 15; l++) {
                if (l%2 == 0) {
                    cells[l].setColor(1);
                } else {
                    cells[l].setColor(0);
                }
            }
           }
        return cells;
    }
     Board_1 board_1 = new Board_1(figures, cel1s);

    boolean move(Cell_1 sourse, Cell_1 dist)
         
}
