package ru.job4j.multithereading.threads.bomberman.bombermanmodel;

import java.util.Random;

public class Movment {

    Random random = new Random();

    /**
     * движущая модель на доске.
     */
    Figure figure;


    /**
     * объект для создания модели игрового поля.
     */
    Board board;

    /**
     * поле обозначающее, откуда начинаеся движение, бертеся namKoord клетки, где стоит фигура.
     */
    int basisMovment;

    /**
     * поле описывающе максимальный диапозон движения по массиву клеток, за один ход.
     */
    int bigRangeMovment;

    /**
     * массив выбора вариантов хода.
     */
    int[] selectionStep;

    /**
     * поле для обозначающее ячейку массива с вариантами ходов.
     */
    int choosingStepRandom;

    /**
     * Конструктор базисного хода.
     *
     * @param figure Фигура, которая ходит.
     * @param board  Поле по которому ходит фигура.
     */
    public Movment(Figure figure, Board board) {

        this.figure = figure;

        basisMovment = figure.getNumKoord();
        this.bigRangeMovment = board.sizeLine;

        this.selectionStep = new int[]{basisMovment + 1, basisMovment - 1, basisMovment + bigRangeMovment, basisMovment - bigRangeMovment};
    }

    /**
     * базовый ход фигуры.
     *
     * @return значение nubKoord клетки, куда осуществляется передвижение фигуры.
     */
    public int stepNext() {
        int result = 0;
        choosingStepRandom = random.nextInt(selectionStep.length);
        result = selectionStep[choosingStepRandom];
        if (!checkStep(result)) {
            result = stepNext();
        }

        return result;
    }

    /**
     * Проверка возможности движения фигуры по доске.
     *
     * @return результат операции.
     */
    public boolean checkStep(int result) {

        return (!(result < 0 || result > this.board.getCells().length - 1));
    }

    /**
     * получение фигуры.
     *
     * @return возврат фигуры, которая осуществляет движение.
     */
    public Figure getFigure() {
        return figure;
    }
}
