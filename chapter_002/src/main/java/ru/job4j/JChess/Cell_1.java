package ru.job4j.JChess;


public abstract class Cell_1 {

    final int cellCoordinate;

    protected Cell_1(int cellCoordinate) {
        this.cellCoordinate = cellCoordinate;
    }
    public abstract boolean isCellOccupied();
    public abstract Figure getFigure();



    public static final class EmptyCell_1 extends Cell_1 {

        public EmptyCell_1(final int cellCoordinate) {
            super(cellCoordinate);
        }
        public boolean isCellOccupied() {
            return false;
        }
        public Figure getFigure() {
            return null;
        }
    }


    public static final class OccuppedCell_1 extends Cell_1 {
        private final Figure figureOnTheCell;

        public OccuppedCell_1(int cellCoordinate, Figure figureOnTheCell) {
            super(cellCoordinate);
            this.figureOnTheCell = figureOnTheCell;
        }

        @Override
        public boolean isCellOccupied() {
            return true;
        }

        @Override
        public Figure getFigure() {
            return figureOnTheCell;
        }
    }
}
