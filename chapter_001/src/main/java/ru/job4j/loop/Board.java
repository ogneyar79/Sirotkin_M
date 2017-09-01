package ru.job4j.loop;
/*
 ������ Board ��� ��������� ��������� �����.

 @author Sirotkin.
*/


import static java.lang.System.getProperty;

/**
 * класс Board для рисования шахматной доски в псевдографике.
 *
 * @author Sirotkin.
 * @return board.toString()
 */
public class Board {

    /**
     * @ param String Value for result
     */
    private String result;

    {
        result = " ";
    }


    /**
     * method for paint board.
     *
     * @param width  int value
     * @param height int value
     * @return board.toString()
     */
    public String paint(int width, int height) {

        StringBuilder board = new StringBuilder();

        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                if ((i + j) % 2 == 0) {
                    board.append("x");
                } else {
                    board.append(" ");
                }
            }
            board.append(getProperty("line.separator"));
        }

        return board.toString();
    }
}