import java.util.Date;

class Main {
    public static void main(String[] args) {
        GenericItem gi_1 = new GenericItem();
        gi_1.ID = 1;
        gi_1.name = "foo1";
        gi_1.price = 100;

        GenericItem gi_2 = new GenericItem();
        gi_2.ID = 2;
        gi_2.name = "foo2";
        gi_2.price = 200;

        GenericItem gi_3 = new GenericItem();
        gi_3.ID = 3;
        gi_3.name = "foo3";
        gi_3.price = 300;

        gi_1.printAll();
        gi_2.printAll();
        gi_3.printAll();

        System.out.println();

        GenericItem gi[] = new GenericItem[2];
        TechnicalItem tItem = new TechnicalItem();
        tItem.ID = 1;
        tItem.name = "TechnicalItem";
        tItem.price = 999;

        FoodItem foodItem = new FoodItem();
        foodItem.ID = 2;
        foodItem.name = "TechnicalItem";
        foodItem.price = 111;
        foodItem.dateOfIncome = new Date();
        
        gi[0] = tItem;
        gi[1] = foodItem;

        for (GenericItem genericItem : gi) {
            genericItem.printAll();
            
        }

        System.out.println();

        FoodItem fi1 = new FoodItem();
        fi1.ID = 111;
        fi1.dateOfIncome = new Date();

        FoodItem fi2 = new FoodItem();
        fi2.ID = 222;
        fi2.dateOfIncome = new Date();

        System.out.println(fi1.equals(fi2));
        fi1.clone(fi2);
        System.out.println(fi1.equals(fi2));
    }
}