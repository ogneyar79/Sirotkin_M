package ru.job4j.JChess;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bishop extends Figure {

    public Bishop(final String name, Cell currentPosition, final Cell firstPosition) {
        super(name, currentPosition, firstPosition);
    }

    @Override
    public Cell[] way(Cell dist) throws ImposibleMoveException{
        Cell[] cel1s = new Cell[63];
       if (((dist.getCell_oneCoordinate() - currentPosition.getCell_oneCoordinate())%7 == 0||(dist.getCell_oneCoordinate() - currentPosition.getCell_oneCoordinate())%9 == 0) && (dist.getCell_oneCoordinate() - currentPosition.getCell_oneCoordinate() > 0 || dist.getCell_oneCoordinate() - currentPosition.getCell_oneCoordinate() < 64) && (dist.getColor() == currentPosition.getColor())) {
              Cell[] cell1s = new Cell[dist.getCell_oneCoordinate() - currentPosition.getCell_oneCoordinate()];
       } else {

       throw new ImposibleMoveException();}

        return cel1s;
    }

    public void makeWay() {
        final Cell dist = null;
        try {
             way( dist);
                    } catch (final ImposibleMoveException e) {
                      e.printStackTrace();
        }
    }


}