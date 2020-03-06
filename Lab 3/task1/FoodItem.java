package task1;
import java.util.Date;

public class FoodItem extends GenericItem {
    Date dateOfIncome;
    short expires;

    public boolean equals(FoodItem o) {
        if (o.ID == this.ID && o.dateOfIncome == this.dateOfIncome)
            return true;
        else
            return false;
    }

    public Object clone(FoodItem foodItem) {
        foodItem.ID = this.ID;
        foodItem.category = this.category;
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
                ID, name, price, category, dateOfIncome.toString(), expires);
    }
}