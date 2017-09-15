package ru.job4j.tracker;
/**
 * класс Item for kreating orders.
 *
 * @author Sirotkin.
 *
 */


public class Item {
    private String id;
    private String name;

    private String description;
    public long create;

    public Item() {

    }

    public Item(String name, String description, long create) {
        this.name = name;
        this.description = description;
        this.create = create;
    }


    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public long getCreate() {
        return this.create;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item inputName () {
        Item item = new
                Item( );
          item.name = name;
        return item;

    }

    public Item inputDescription() {
        this.description = description;
        return this;
    }
    public Item inputCreate() {
        this.create = create;
        return this;
    }

}