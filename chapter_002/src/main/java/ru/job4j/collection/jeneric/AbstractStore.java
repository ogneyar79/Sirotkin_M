package ru.job4j.collection.jeneric;

public abstract class  AbstractStore < SimpleArray> implements Store{
              SimpleArray arrayForUsOrrole;

    public AbstractStore( final SimpleArray arrayForUsOrrole) {
        this.arrayForUsOrrole = arrayForUsOrrole;
    }

    public SimpleArray getArrayForUsOrrole() {
        return arrayForUsOrrole;
    }


    @Override
    public void add(Base model) {
        
    }

    @Override
    public boolean replace(String id, Base model) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Base findById(String id) {
        return null;
    }
}
