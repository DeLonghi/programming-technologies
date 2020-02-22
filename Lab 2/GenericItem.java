class GenericItem {
    public Category category = Category.GENERAL;
    public int ID;
    public String name;
    public float price;

    public boolean equals(GenericItem o) {
        if (o.ID == this.ID && o.name == this.name)
            return true;
        else
            return false;
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %-20s \n", ID, name, price, category);
    }
}