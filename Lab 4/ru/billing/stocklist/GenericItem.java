package ru.billing.stocklist;

public class GenericItem {
    private Category category = Category.GENERAL;
    private int ID;
    private String name;
    private float price;
    private GenericItem analog;
    static int currentID = 1;

    public boolean equals(GenericItem o) {
        return (this.category == o.category && this.ID == o.ID && this.name == o.name && this.price == o.price);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.ID;
        return result;
    }

    public Object clone() {
        GenericItem genericItem = new GenericItem();
        genericItem.ID = this.ID;
        genericItem.name = this.name;
        genericItem.price = this.price;
        return genericItem;
    }

    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this.price = price;
        this.analog = analog;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
        this.analog = new GenericItem();
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %-20s \n", ID, name, price, category);
    }

    /**
     * @return the analog
     */
    public GenericItem getAnalog() {
        return analog;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @return the currentID
     */
    public static int getCurrentID() {
        return currentID;
    }

    /**
     * @return the iD
     */
    public int getID() {
        return ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param analog the analog to set
     */
    public void setAnalog(GenericItem analog) {
        this.analog = analog;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @param currentID the currentID to set
     */
    public static void setCurrentID(int currentID) {
        GenericItem.currentID = currentID;
    }

    /**
     * @param iD the iD to set
     */
    public void setID(int iD) {
        ID = iD;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
}