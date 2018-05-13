package ru.job4j.collection.jeneric;

import java.util.Iterator;

public class UserStore extends AbstractStore<SimpleArray<User>> {

    SimpleArray simpleArrayForUstore = new SimpleArray<User>();

    public UserStore(SimpleArray<User> arrayForUsOrrole) {
        super(arrayForUsOrrole);
    }

    @Override
    public void add(Base model) {
        simpleArrayForUstore.add(model);
    }

    @Override
    public boolean replace(String id, Base model) {
        boolean doneReplacedIt = false;
        Iterator simpleArrayIterator = simpleArrayForUstore.iterator();
        while (simpleArrayIterator.hasNext()) {
            int positionItBeforeNext = simpleArrayForUstore.getIndex();
            Base wanted = (User) simpleArrayIterator.next();

            if (wanted.getId().compareTo(id) == 0) {

                simpleArrayForUstore.set(positionItBeforeNext, model);
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
        Iterator simpleArrayIterator = simpleArrayForUstore.iterator();
        while (simpleArrayIterator.hasNext()) {
            int positionItBeforeNext = simpleArrayForUstore.getIndex();
            Base wanted = (User) simpleArrayIterator.next();

            if (wanted.getId().compareTo(id) == 0) {
                simpleArrayForUstore.delete(positionItBeforeNext);
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
        Iterator simpleArrayIterator = simpleArrayForUstore.iterator();
        while (simpleArrayIterator.hasNext()) {

            Base wanted = (User) simpleArrayIterator.next();
            if (wanted.getId().compareTo(id) == 0) {
                return wanted;
            }
        }
        return null;
    }

}
