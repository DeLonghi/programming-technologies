package task1;
class GenericItem {
    public Category category = Category.GENERAL;
    public int ID;
    public String name;
    public float price;
    public GenericItem analog;
    static int currentID;

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
        GenericItem genericItem =new GenericItem();
        genericItem.ID = this.ID;
        genericItem.name = this.name;
        genericItem.price = this.price;
        return genericItem;
    }

    public GenericItem(String name, float price, Category category) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this. price = price;
        this.category = category;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.ID = GenericItem.currentID++;
        this.name = name;
        this. price = price;
        this.analog = analog;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
        this.analog = new GenericItem();
    }

    void printAll() {
        System.out.printf("ID: %d , Name: %-20s , price:%5.2f , category: %-20s \n", ID, name, price, category);
    }
}