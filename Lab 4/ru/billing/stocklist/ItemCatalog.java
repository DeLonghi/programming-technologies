package ru.billing.stocklist;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog {
    private HashMap<Integer, GenericItem> catalog = new HashMap<Integer, GenericItem>();
    private ArrayList<GenericItem> ALCatalog = new ArrayList<GenericItem>();

    public void addItem(GenericItem item) {
        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }

    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }

    public GenericItem findItemByID(int id) {
        // Если нет такого ID, возвращаем пустое значение
        if (!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDAL(int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id)
                return i;
        }
        return null;
    }

    /**
     * @param aLCatalog the aLCatalog to set
     */
    public void setALCatalog(ArrayList<GenericItem> aLCatalog) {
        ALCatalog = aLCatalog;
    }

    /**
     * @param catalog the catalog to set
     */
    public void setCatalog(HashMap<Integer, GenericItem> catalog) {
        this.catalog = catalog;
    }

    /**
     * @return the aLCatalog
     */
    public ArrayList<GenericItem> getALCatalog() {
        return ALCatalog;
    }

    /**
     * @return the catalog
     */
    public HashMap<Integer, GenericItem> getCatalog() {
        return catalog;
    }
}