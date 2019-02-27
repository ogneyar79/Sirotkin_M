package ru.job4j.multithereading.threads.bomberman.bombermanmodel;

import java.util.concurrent.TimeUnit;

public class Monster extends Figure {

    Movment movment;

    Board boardFirst;

    public Monster(String name, String color, Cell myPlace, Board boardFirst) {
        super(name, color, myPlace);
        movment = new Movment(this, boardFirst);
    }

    Boolean moveMonster() throws InterruptedException {
        boolean result = false;
        Cell myPlace = this.getMyPlace();
        Cell dest = boardFirst.getCells()[movment.stepNext()];
        myPlace.cellInfo();
        dest.cellInfo();
        System.out.println(String.format("Monster пытается сделать ход из %s в %s", myPlace, dest));

        if (boardFirst.getBoardRlForGame()[dest.getKoordinateLineX()][dest.koordinateLinecolumneY].tryLock(500, TimeUnit.MILLISECONDS)) {
            boardFirst.getBoardRlForGame()[myPlace.getKoordinateLineX()][myPlace.getKoordinateLinecolumneY()].unlock();
            this.setMyPlace(dest);
            result = true;
            System.out.println(" Monster has steped into");
        } else {
            System.out.println(" Esta occupada)) Позиция ЗАНЯТА");
            result = false;
            System.out.println(" The Cell is occupied");
        }

        return result;
    }

    public Board getBoard() {
        return boardFirst;
    }
}
