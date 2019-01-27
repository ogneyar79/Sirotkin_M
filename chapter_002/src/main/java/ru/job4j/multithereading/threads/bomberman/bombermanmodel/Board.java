package ru.job4j.multithereading.threads.bomberman.bombermanmodel;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * класс Игрового поля для бомберменов.
 */
public class Board {

    /**
     * Внутренние поля класса, координаты
     */
    int sizeLine;
    int sizeColumn;

    /**
     * клетка на доске.
     */
    Cell cellOnBoard;

    /**
     * движущая модель на доске.
     */
    Figure figure;

    /**
     * фигура игрока бомбермана.
     */
    PlayerUno playerUno;


    /**
     * поле-одномерный массив, где храняться наши клетки, связанные с блокирующими клетками.
     */
    Cell[] cells = new Cell[sizeLine * sizeColumn];

    /**
     * Игровое поле.
     */
    final ReentrantLock[][] boardRlForGame;

    /**
     * объект для реализации движения.
     */
    Movment movment;

    /**
     * Конструктор размерности игрового поля.
     *
     * @param sizeLine   Размер по оси X.
     * @param sizeColumn Размер по оси Y.
     */
    public Board(int sizeLine, int sizeColumn) {
        this.sizeLine = sizeLine;
        this.sizeColumn = sizeColumn;
        this.boardRlForGame = new ReentrantLock[sizeLine][sizeColumn];
        int z = 0;
        for (int i = 0; i < sizeLine; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                boardRlForGame[i][j] = new ReentrantLock();
                final Cell cellOnBoard = new Cell(this.boardRlForGame, i, j);
                cellOnBoard.setNumKoord(z);
                this.cells[z] = cellOnBoard;
                z++;
            }
        }
        Cell myPlace = new Cell(this.boardRlForGame, sizeLine / 2, sizeColumn / 2);
        playerUno = new PlayerUno("TEROR", "RED", myPlace);
    }

    /**
     * Передвижение игрока.
     *
     * @param source Начальная клетка движения.
     * @param dist   Конечная клетка движения.
     * @return результат операции.
     * @throws InterruptedException Выбрасывается при прерывании потока.
     */
    Boolean move(Cell source, Cell dist) throws InterruptedException {
        Movment movment = new Movment(figure, this);
        boolean resultMovment;

        if (this.boardRlForGame[dist.getKoordinateLineX()][dist.koordinateLinecolumneY].tryLock(500, TimeUnit.MILLISECONDS)) {
            this.boardRlForGame[source.getKoordinateLineX()][source.getKoordinateLinecolumneY()].unlock();

            this.playerUno.setMyPlace(dist);
            resultMovment = true;
        } else {
            System.out.println(" Esta occupada)) Позиция ЗАНЯТА");
            resultMovment = false;
        }
        return resultMovment;
    }


    public PlayerUno getPlayerUno() {
        return playerUno;
    }

    /**
     * Получение массива клетко.
     *
     * @return массив клеток.
     */
    public Cell[] getCells() {
        return cells;
    }

    /**
     * Получение двухмерного массива блокирующих клеток объектов.
     *
     * @return двухмерный массив с блокирующиими объектами.
     */
    public ReentrantLock[][] getBoardRlForGame() {
        return boardRlForGame;
    }

    /**
     * Получение размера по оси X.
     *
     * @return размер по оси X.
     */
    public int getSizeLine() {
        return sizeLine;
    }

    /**
     * Получение размера по оси Y.
     *
     * @return размер по оси Y.
     */
    public int getSizeColumn() {
        return sizeColumn;
    }
}
