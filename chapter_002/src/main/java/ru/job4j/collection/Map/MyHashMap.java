package ru.job4j.collection.Map;

public class MyHashMap<L, O> {
    DinamicArraycontainerForHashMap<MyEntry> containerMap = new DinamicArraycontainerForHashMap();

    MyEntry myEntry;
     private int size = this.containerMap.getSize();
    private int hash(final L key) {
        int hash = 31;
        hash = hash * 31 + key.hashCode();

        return hash % this.containerMap.getContainer().length;
    }



    boolean insert(L key, O value) {
        boolean result;
        int indexHash = hash(key);
        MyEntry<L, O> entry = (MyEntry<L, O>) this.containerMap.getContainer()[indexHash];
        if (entry.getKey().equals(key)) {
            result = false;
            System.out.println("We have already had such key, please to change or delete it");
        } else {
            MyEntry basket = new MyEntry(key, value);
            containerMap.set(indexHash, basket);
            result = true;
        }
        return result;
    }

     boolean delete (L key) {
        boolean result = false;
        int indexHash = hash(key);
        this.containerMap.getContainer()[indexHash] = null;


        return result;
     }

    O getValue(L key) {
        return null;
    }
}
