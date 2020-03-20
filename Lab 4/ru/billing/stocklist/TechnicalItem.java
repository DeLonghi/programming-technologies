package ru.billing.stocklist;
public class TechnicalItem extends GenericItem {
    private short warrantyTime;

    
    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %-20s , warrantyTime: %d \n", getID(), getName(), getPrice(),
                getCategory(), warrantyTime);
    }

    /**
     * @return the warrantyTime
     */
    public short getWarrantyTime() {
        return warrantyTime;
    }

    /**
     * @param warrantyTime the warrantyTime to set
     */
    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }
}