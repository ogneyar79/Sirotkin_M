package ru.job4j.strategy;

import static java.lang.System.getProperty;

public class Square implements IShape {


    /**
     * method that is realisation interface, outputting square at console.
     *
     * @return squareBuilder
     */
    @Override
    public String pic() {
        StringBuilder squareBuilder = new StringBuilder();

        squareBuilder.append("+++++");
        squareBuilder.append(getProperty("line.separator"));
        squareBuilder.append("+" + "   " + "+");
        squareBuilder.append(getProperty("line.separator"));
        squareBuilder.append("+++++");
        squareBuilder.append(getProperty("line.separator"));
        squareBuilder.append("+" + "   " + "+");
        squareBuilder.append(getProperty("line.separator"));
        squareBuilder.append("+++++");
        System.out.println(squareBuilder.toString());
        return squareBuilder.toString();

    }
}