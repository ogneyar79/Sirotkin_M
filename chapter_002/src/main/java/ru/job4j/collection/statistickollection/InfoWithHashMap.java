package ru.job4j.collection.statistickollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoWithHashMap {
    /**
     * показывает количество добавленных элеметов в коллекцию.
     */
    private int infoAboutNewAdded = 0;

    /**
     * показывает количество удаленных элеметов в коллекции.
     */
    private int infoAbDeleletedElement = 0;

    private int changedElement = 0;

    /**
     * карта для сравнения колеций.
     */
    private HashMap<Integer, String> theCompareMap = new HashMap<>();

    /**
     * список для отобрвжения информации про все изменения.
     */
    private List<java.util.List<String>> listsInfo = new ArrayList<>();

    /**
     * информируют объект о измененных и удаленных елементах в коллекции.
     *
     * @param previoues предыдущая коллекция.
     * @param current   текущая коллекция
     */
    public java.util.List<String> changedAndDeletedElments(List<Store.User> previoues, List<Store.User> current) {
        String info;
        java.util.List<String> listInfo = new ArrayList<>();
        for (Store.User userC : current) {
            this.theCompareMap.putIfAbsent(userC.id, userC.name);
        }
        for (Store.User userP : previoues) {
            String userName;
            userName = this.theCompareMap.put(userP.id, userP.name);
            if (userName != null) {
                if (!userP.name.equals(userName)) {
                    changedElement++;
                    info = userP.name + "" + userP.id + "Was changed for " + userName;
                    listInfo.add(info);
                    this.theCompareMap.remove(userP.id);
                } else {
                    this.theCompareMap.remove(userP.id);
                }
            } else {
                info = "" + userP.id + "With" + userP.name + " was deleted";
                infoAbDeleletedElement++;
                listInfo.add(info);
                this.theCompareMap.remove(userP.id);
            }
        }
        info = changedElement +" " + " Elements Was changed";
        listInfo.add(info);
        info = infoAbDeleletedElement + " Elements Was deleted ";
        listInfo.add(info);
        return listInfo;
    }

    /**
     * информируют объект о добавленных эелементах.
     *
     * @param theCompareMap предыдущая коллекция.
     */
    private java.util.List<String> infoAboutAddedElement(HashMap<Integer, String> theCompareMap) {
        String info;
        java.util.List<String> listInfo = new ArrayList<>();
        infoAboutNewAdded = theCompareMap.size();
        info = theCompareMap.size() +"" + "Elements was added ";
        listInfo.add(info);
        for (Map.Entry<Integer, String> entryset : theCompareMap.entrySet()) {
            info = "" + entryset.getKey()+ " " + "With" + entryset.getValue() +" " + "Was added";
            listInfo.add(info);
        }
        return listInfo;
    }

    /**
     * информируют объект о измениниях в коллекции.
     *
     * @param previoues предыдущая коллекция.
     * @param current   текущая коллекция
     */
    public void infoChangeOfcollectiont(java.util.List<Store.User> previoues, java.util.List<Store.User> current) {

        listsInfo.add(this.changedAndDeletedElments(previoues, current));
        listsInfo.add(this.infoAboutAddedElement(this.theCompareMap));
    }

    public int getInfoAboutNewAdded() {
        return infoAboutNewAdded;
    }

    public int getInfoAbDeleletedElement() {
        return infoAbDeleletedElement;
    }


    public HashMap<Integer, String> getTheCompareMap() {
        return theCompareMap;
    }

    public int getChangedElement() {
        return changedElement;
    }

    public List<List<String>> getListsInfo() {
        return listsInfo;
    }
}
