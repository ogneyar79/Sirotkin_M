package ru.job4j.iterator;



public interface IIterator {

     int next();
     boolean hasNext();
     int valuesCountArray(int[][] value);

     int getCurrent();
     void setCurrent(int current);


}