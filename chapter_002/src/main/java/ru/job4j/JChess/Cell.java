package ru.job4j.JChess;

/**public abstract class Cell {

    final int cellCoordinate;

    private static final Map<Integer, EmptyCell>EMPTY_CELL_CACHE = createAllPosibleEmptyCell();
    private static Map<Integer, EmptyCell>createAllPosibleEmptyCell() {
        final Map<Integer, EmptyCell>emptyCellMap = new HashMap<>();
        for (int i = 0; i < BoardUtils.NUM_CELL; i++) {
            emptyCellMap.put(i, new EmptyCell(i));
        }
        return ImmutableMap.copyOf(emptyCellMap);
    }

    public static Cell createCell(final int cellCoordinate, final Piece piece) {
        return piece != null ? new OccuppedCell(cellCoordinate, piece) : EMPTY_CELL_CACHE.get(cellCoordinate);
    }
   private Cell( final int cellCoordinate) {
        this.cellCoordinate = cellCoordinate;
    }

    public abstract boolean isCellOccupied();
    public abstract Piece getPiece();




    public static final class EmptyCell extends Cell {

       public EmptyCell(final int cellCoordinate) {
            super(cellCoordinate);
        }
        public boolean isCellOccupied() {
           return false;
        }

        @Override
        public Piece getPiece() {
            return null;
        }
    }

    public static final class OccuppedCell extends Cell {
        private final Piece pieceOnCell;

        private OccuppedCell(int cellCoordinate, final Piece pieceOnCell) {
            super(cellCoordinate);
            this.pieceOnCell = pieceOnCell;
        }

        public boolean isCellOccupied() {
            return true;
        }

        @Override
        public Piece getPiece() {
            return pieceOnCell;
        }
    }
}*/