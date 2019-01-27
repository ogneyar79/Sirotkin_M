package ru.job4j.multithereading.threads.bomberman.bombermanmodel;

/**
 * .
 */
public class BombeManGamePlayerTread implements Runnable {

    Board board;

    Movment movment;


    @Override
    public void run() {

        Cell source = board.getPlayerUno().getMyPlace();
        Cell dest = board.getCells()[movment.stepNext()];
        board.getBoardRlForGame()[source.getKoordinateLineX()][source.getKoordinateLinecolumneY()].lock();
        while (!Thread.currentThread().isInterrupted()) {
            try {
                board.move(source, dest);
            } catch (InterruptedException e) {
                System.out.println("BomberMan game over");
                Thread.currentThread().interrupt();

            }
        }
    }
}
