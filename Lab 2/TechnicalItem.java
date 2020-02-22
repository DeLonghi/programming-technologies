public class TechnicalItem extends GenericItem {
   short warrantyTime;

   public boolean equals(TechnicalItem o) {
    if (o.ID == this.ID && o.name == this.name && o.warrantyTime == this.warrantyTime)
        return true;
    else
        return false;
}


   void printAll() {
    System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %-20s , warrantyTime: %d \n", ID, name, price, category, warrantyTime);
}
}