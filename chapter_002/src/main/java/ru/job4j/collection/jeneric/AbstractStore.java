package ru.job4j.collection.jeneric;

import java.util.Iterator;

public abstract class AbstractStore<T extends Base> implements Store {

    SimpleArray userOrRoleArray = new SimpleArray<T>();

    public AbstractStore(final SimpleArray userOrRoleArray) {
        this.userOrRoleArray = userOrRoleArray;
    }

    @Override
    public void add(Base model) {
        userOrRoleArray.add(model);
    }

    @Override
    public boolean replace(String id, Base model) {
        boolean doneReplacedIt = false;
        Iterator<T> simpleArrayIterator = userOrRoleArray.iterator();
        while (simpleArrayIterator.hasNext()) {
            int positionItBeforeNext = userOrRoleArray.getIndex();
            Base wanted = simpleArrayIterator.next();
            if (wanted.getId().compareTo(id) == 0) {
                userOrRoleArray.set(positionItBeforeNext, model);
                doneReplacedIt = true;
                break;
            }
        }
        if (!doneReplacedIt) {
            System.out.println(" Check your String id, Might it's inccorect");
        }
        return doneReplacedIt;
    }

    @Override
    public boolean delete(String id) {
        boolean done = false;
        Iterator<T> simpleArrayIterator = userOrRoleArray.iterator();
        while (simpleArrayIterator.hasNext()) {
            int positionItBeforeNext = userOrRoleArray.getIndex();
            Base wanted = simpleArrayIterator.next();
            if (wanted.getId().compareTo(id) == 0) {
                userOrRoleArray.delete(positionItBeforeNext);
                done = true;
                break;
            }
        }
        if (!done) {
            System.out.println(" Check your String id, Might it's inccorect");
        }
        return done;
    }

    @Override
    public Base findById(String id) {
        Iterator<T> simpleArrayIterator = userOrRoleArray.iterator();
        while (simpleArrayIterator.hasNext()) {
            Base wanted = simpleArrayIterator.next();
            if (wanted.getId().compareTo(id) == 0) {
                return wanted;
            }
        }
        return null;
    }
}

