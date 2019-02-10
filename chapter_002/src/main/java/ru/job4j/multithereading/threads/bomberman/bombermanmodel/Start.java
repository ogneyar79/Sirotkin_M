package ru.job4j.multithereading.threads.bomberman.bombermanmodel;

public class Start {

    public static void main(String[] args) throws InterruptedException {

        Board boardFirst = new Board(8, 8);

        Figure figureBomb = boardFirst.getPlayerUno();
        Movment movmentBomb = new Movment(figureBomb, boardFirst);
        BombeManGamePlayerTread bombert = new BombeManGamePlayerTread(boardFirst, movmentBomb);

        Thread threadBomber = new Thread(bombert);
        threadBomber.start();

    }

}
