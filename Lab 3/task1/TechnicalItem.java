package task1;
public class TechnicalItem extends GenericItem {
    short warrantyTime;

    
    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %-20s , warrantyTime: %d \n", ID, name, price,
                category, warrantyTime);
    }
}