package ru.job4j.collection.jeneric;

import java.util.Iterator;

public class RoleStore extends AbstractStore<SimpleArray<Role>> {

    SimpleArray simpleArrayForRstore = new SimpleArray<Role>();

    public RoleStore(SimpleArray<Role> arrayForUsOrrole) {
        super(arrayForUsOrrole);
    }

    @Override
    public void add(Base model) {
        simpleArrayForRstore.add(model);
    }

    @Override
    public boolean replace(String id, Base model) {
        boolean doneReplacedIt = false;
        Iterator simpleArrayIterator = simpleArrayForRstore.iterator();
        while (simpleArrayIterator.hasNext()) {
            int positionItBeforeNext = simpleArrayForRstore.getIndex();
            Base wanted = (Role) simpleArrayIterator.next();

            if (wanted.getId().compareTo(id) == 0) {

                simpleArrayForRstore.set(positionItBeforeNext, model);
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
        Iterator simpleArrayIterator = simpleArrayForRstore.iterator();
        while (simpleArrayIterator.hasNext()) {
            int positionItBeforeNext = simpleArrayForRstore.getIndex();
            Base wanted = (Role) simpleArrayIterator.next();

            if (wanted.getId().compareTo(id) == 0) {
                simpleArrayForRstore.delete(positionItBeforeNext);
                done = true;
                break;
            }
            if (!done) {
                System.out.println(" Check your String id, Might it's inccorect");
            }
        }
        return done;
    }

    @Override
    public Base findById(String id) {
        Iterator simpleArrayIterator = simpleArrayForRstore.iterator();
        while (simpleArrayIterator.hasNext()) {

            Base wanted = (Role) simpleArrayIterator.next();
            if (wanted.getId().compareTo(id) == 0) {
                return wanted;
            }
        }
        return null;
    }

    }

