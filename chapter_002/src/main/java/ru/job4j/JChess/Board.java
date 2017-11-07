package ru.job4j.JChess;
/**
 * Created by maksi on 03.11.2017.
 */

public class Board {

    /**
     *@ param[] fields figures.
     *
     */
    Figure[] figures;

    /**
     *@ param[] field boardCells(cells at the board).
     *
     */
    Cell[] boardCel1s;

    /**
     *@ param boolean field checkMark(for selekting choises at method).
     *
     */
    boolean checkMark;

    /**
     * method for creating Board object.
     *
     */
    public Board(Figure[] figures, Cell[] boardCel1s) {
        this.figures = figures;
        this.boardCel1s = boardCel1s;
    }

    /**
     * method for kreating Chess board(by filing board with 64 cells).
     *
     * @return boardCells
     */
    public Cell[] kreateBoard() {
        Cell[] boardCells = new Cell[64];
        boardCel1s[0] = new Cell(0, 0, 0, 0);
        for (int i = 0; i < boardCel1s.length; i++) {
            boardCel1s[i] = new Cell(i, i, i, i);
        }
        for (int j = 0; j <= 7; j++) {
            if (j % 2 == 0) {
                boardCel1s[j].setColor(0);
            } else {
                boardCel1s[j].setColor(1);
            }
            for (int l = 8; l <= 15; l++) {
                if (l % 2 == 0) {
                    boardCel1s[l].setColor(1);
                } else {
                    boardCel1s[l].setColor(0);
                }
            }
        }
        return boardCel1s;
    }

    Board board1 = new Board(figures, boardCel1s);


    /**
     * method for definition opportunity figure moving.
     * @param  currentPosition Cell
     * @param dist Cell
     * @return this
     */
    boolean move(Cell currentPosition, Cell dist) throws ImposibleMoveException, OccupiedWayException, FigureNotFoundException {
        checkMark = false;
        Cell[] cells = new Cell[64];
                for (int j = 0; j < boardCel1s.length; j++) {
            boardCel1s[j].getCell_oneCoordinate();
            if (boardCel1s[j].getCell_oneCoordinate() == currentPosition.getCell_oneCoordinate()) {
                if (currentPosition.getCellOccupied() != 0) {
                    checkMark = true;
                } else {
                    throw new FigureNotFoundException();
                }
                cells = figures.way(dist);     // если фигура есть, то проверте может ли она так двигаться, //
                for (int i = 0; i < cells.length; i++) {   // Проверить что полученный путь не занят фигурами, кроме коня и пешки на первом ходу//
                    cells[i].getCellOccupied();
                    if (cells[i].getCellOccupied() == 0) {
                        throw new OccupiedWayException();
                        break;
                    } else {
                        checkMark = true;
                    }
                }
                if (checkMark == true) {
                }
            } else {
                checkMark = true;
            }
        }
        return checkMark;
    }
}


