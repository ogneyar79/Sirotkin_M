package ru.job4j.collection;

import java.util.*;

public class SpeedCollection {



    int amount;
    Collection<String>collectionL = new LinkedList<String>();
    Collection<String>collectionTreeS = new TreeSet<String>();

    public long add(Collection<String> collection, int amount) {
        String e = null;
        long timeOut = 0;

        for (int index = 0 ;index != amount; index++) {
            long timeStart = System.currentTimeMillis();
            collection.add( String.valueOf(index));
            long timeEnd = System.currentTimeMillis();
            long timeResult = timeEnd - timeStart;
            System.out.println(timeResult);
            timeOut = + timeResult;
            System.out.println(timeOut);
        }
             return timeOut;
           }



    public long delete(Collection<String> collection) {
                     long timeStart = System.currentTimeMillis();
                     collection.remove(0);
                     long timeEnd = System.currentTimeMillis();
                     long timeResult = timeEnd - timeStart;
                     System.out.println(timeResult);
                             return timeResult;
    }
    public long delete(LinkedList<String> collection ) {
        long timeStart = System.currentTimeMillis();
        collection.removeFirst();
        long timeEnd = System.currentTimeMillis();
        long timeResult = timeEnd - timeStart;
        System.out.println(timeResult);
        return timeResult;
    }


    public static void main (String[] args) {
        Collection<String> collection = new ArrayList<String>();
             SpeedCollection collectionA = new SpeedCollection();
             collectionA.add(collection, 10);
        Collection<String>collectionL = new LinkedList<String>();
        collectionA.add(collectionL, 10);
        Collection<String>collectionTreeS = new TreeSet<String>();
        collectionA.add(collectionTreeS, 10);
    }

}