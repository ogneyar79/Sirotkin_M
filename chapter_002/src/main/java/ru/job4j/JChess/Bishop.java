package ru.job4j.JChess;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bishop extends Piece {

    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATE = {-9, -7, 7, 9};

    public Bishop(Alliance pieceAlliance, int piecePosition) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(Board board) {

        final List<Move>legalMoves = new ArrayList<>();
        for (final int candidateCoordinateOffset : CANDIDATE_MOVE_VECTOR_COORDINATE) {
             int candidateDestinationCoordinate = this.piecePosition;

            while (BoardUtils.isValidCellCoordinate(candidateDestinationCoordinate)) {
                if (isFirstColumnExclusion(candidateDestinationCoordinate, candidateCoordinateOffset)|| isEigthColumnExclusion(candidateDestinationCoordinate, candidateCoordinateOffset)){
                    break;
                }

                candidateDestinationCoordinate = +candidateCoordinateOffset;

                if (BoardUtils.isValidCellCoordinate(candidateDestinationCoordinate)) {
                    final Cell candidateDestinationCell = board.getCell(candidateDestinationCoordinate);

                    if (!candidateDestinationCell.isCellOccupied()) {
                        legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
                    } else {
                        final Piece pieceAtDestination = candidateDestinationCell.getPiece();
                        final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();
                        if (this.pieceAlliance != pieceAlliance) {
                            legalMoves.add(new Move.AttackMove(board, this, candidateDestinationCoordinate, pieceAtDestination));
                        }
                        break;
                    }
                }
            }
        }
        return ImmutableList.copyOf(legalMoves);
    }
    private static boolean isFirstColumnExclusion(final int carrentPosition, final int candidateOffset) {
        return BoardUtils.FIRST_COLUMN[carrentPosition] && (candidateOffset == -9 || candidateOffset == 7);
            }
    private static boolean isEigthColumnExclusion(final int carrentPosition, final int candidateOffset) {
        return BoardUtils.EIGTH_COLUMN[carrentPosition] && (candidateOffset == -7 || candidateOffset == 9);
}
}