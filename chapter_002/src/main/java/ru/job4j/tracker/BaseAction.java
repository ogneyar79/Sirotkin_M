package ru.job4j.tracker;


abstract class BaseAction implements IUserAktion {


    public BaseAction(String name, int key) {

    }


    public String info() {
        return String.format("%s. %s", this.key(), " Copy");

    }

    abstract void start();

    public class CopyBaseAction extends BaseAction {
           String name;
           int key;
        public CopyBaseAction(String name, int key) {
            super(name, key);
        }
       public void start() {

       }
        public void execute(IInput input, Tracker tracker) {

       }
       public int key() {
           return key;
       }

    }

public static void main(String[] args) {

    BaseAction b = new BaseAction("7", 7) {
        @Override
        void start() {

        }

        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(IInput input, Tracker tracker) {

        }
    };
    b.info();

}

}