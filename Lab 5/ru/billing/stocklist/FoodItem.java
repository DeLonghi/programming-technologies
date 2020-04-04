package ru.billing.stocklist;
import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires;

    public boolean equals(FoodItem o) {
        if (o.getID() == this.getID() && o.dateOfIncome == this.dateOfIncome)
            return true;
        else
            return false;
    }

    public Object clone(FoodItem foodItem) {
        foodItem.setID(this.getID());
        foodItem.setCategory(this.getCategory());
        foodItem.dateOfIncome = this.dateOfIncome;
        foodItem.expires = this.expires;
        return foodItem;
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        this(name, price, new FoodItem("Food Item"), new Date(), expires);
    }

    public FoodItem(String name) {
        this(name, -1, new FoodItem("Food Item"), new Date(), (short) 31);
    }

    public void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %-20s , dateOfIncome: %-20s , expires: %d \n",
                this.getID(), this.getName(), this.getPrice(), this.getCategory(), dateOfIncome.toString(), expires);
    }

    /**
     * @param dateOfIncome the dateOfIncome to set
     */
    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    /**
     * @param expires the expires to set
     */
    public void setExpires(short expires) {
        this.expires = expires;
    }

    /**
     * @return the dateOfIncome
     */
    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    /**
     * @return the expires
     */
    public short getExpires() {
        return expires;
    }
}