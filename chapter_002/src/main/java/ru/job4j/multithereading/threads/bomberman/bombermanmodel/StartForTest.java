package ru.job4j.multithereading.threads.bomberman.bombermanmodel;

public class StartForTest {
    public static void main(String[] args) throws InterruptedException {
        int monserNumber = 1;
        Thread[] monsterThread = new Thread[monserNumber];

        //    Board boardFirst = new Board(8, 8, monserNumber, monsterThread);
        //  System.out.println(" We are creating monster");
//        boardFirst.createMonsterS(monserNumber);
        //      System.out.println(" The monsters have created"System.out.println(" We have just began to get out monster");
        //    boardFirst.getMonsterThread()[0].start();

        Board board = new Board(8, 8, monserNumber, monsterThread);
        Cell cell = new Cell(board.boardRlForGame, 0, 2);

        Monster monstert = new Monster("Monstertest1", "Green", cell, board);

        MonsterMoveThrread monsterTest = new MonsterMoveThrread(monstert);
        monsterTest.run();
    }

}
