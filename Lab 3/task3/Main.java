package task3;

import task1.*;

class Main {
    public static void main(String[] args) {
        String line = "Конфеты ’Маска’;45;120";
        String[] item_fld = line.split(";");
        FoodItem foodItem = new FoodItem(item_fld[0], Integer.parseInt(item_fld[1]), Short.parseShort(item_fld[2]));
        foodItem.printAll();

    }
}