package ru.job4j.tracker;

import java.util.Random;


 import  java.util.Arrays;


/**
 * класс Tracker roll for array where we keep orders.
 *
 * @author Sirotkin.
 * @return s
 */

public class Tracker {

   /**
    * method for getting items.
    * @return items[]
    */
    public Item[] getItems() {
        return items;
    }

    /**
     *@ param value Item [].
     */
      private Item[] items = new Item[100];

    /**
     *@ param RN Random.
     */
private static final Random RN = new Random();

    /**
     *@ param value position, show quantity items and where items[position] we get new item.
     */
private int position = 0;

    /**
     * method for add Item item at Item[] and here set Id.
     * @param  item Item
     * @return item
     */
    public Item add(Item item) {

     item.setId(String.valueOf(this.generateId()));
    this.items[position] = item;
    position++;
    return item;
}

    /**
     * method for find item via id.
     * @param id String
     * @return the item
     */
    protected Item findById(String id) {
    Item result = null;
    for (Item item : items) {
        if (item != null && item.getId().equals(id)) {
            result = item;
            break;
        }
    }
    return result;
}

    /**
     * method for creating Id.
     * @return valueOf
     */
    String generateId() {
    return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
}

    /**
     * method for get copy array from items without [i] = Null.
     * @return result[]
     */
    public Item[] getAll() {
    int count = 0;
    Item[] result = new Item[position];
    for (int index = 0; index != position; index++) {


        if (items[index] != null) {
            result[index] = this.items[index];
        }


    }
    return result;
}

    /**
     * metod for changing our array [].
     * @param item Item
     */
    public void update(Item item) {
    String id;
    id = item.getId();
        for (int index = 0; index != position; index++) {
        if (this.items[index].getId().equals(id)) {
             this.items[index] = item;
             break;
        }
        }
    }

    /**
     * method for deleted our items[i] = null and move to end list, and changed position.
     * @param item Item
     */
    public void delete(Item item) {
      String id;
      id = item.getId();
      for (int index = 0; index != position; index++) {
          if (this.items[index].getId().equals(id)) {
              this.items[index] = null;
              break;
          }

      }

      for (int i = 0; i != position; i++) {
          if (this.items[i] == null) {
              this.items[i] = this.items[position - 1];
              this.items[position - 1] = null;
              break;
          }

      }
      position--;
    }

    /**
     * metod for find our items[i], using name.
     * @param key String
     * @return result Arraays.copyOf
     */
    Item[] findByName(String key) {

        Item[] result = new Item[position];
         int count = 0;
        for (int index = 0; index != position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[count] = this.items[index];
                count++;

            }
        }
   result = Arrays.copyOf(result, count);
        return result;

    }
}