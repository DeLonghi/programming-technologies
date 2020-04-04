package ru.billing.client;

import java.util.Date;
import ru.billing.stocklist.*;
import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

class Main {
    public static void main(String[] args) {
        // task 4-1

        ItemCatalog cat = new ItemCatalog();
        try {
            cat.addItem(new GenericItem("Foo1", (float) 1, Category.GENERAL));
            cat.addItem(new GenericItem("Foo2", (float) 2, Category.GENERAL));

            cat.addItem(new GenericItem("Foo3", (float) 3, Category.GENERAL));
            cat.addItem(new GenericItem("Foo4", (float) 4, Category.GENERAL));

            cat.addItem(new GenericItem("Foo5", (float) 5, Category.GENERAL));
            cat.addItem(new GenericItem("Foo6", (float) 6, Category.GENERAL));

            cat.addItem(new GenericItem("Foo7", (float) 7, Category.GENERAL));
            cat.addItem(new GenericItem("Foo8", (float) 8, Category.GENERAL));

            cat.addItem(new GenericItem("Foo9", (float) 9, Category.GENERAL));
            cat.addItem(new GenericItem("Foo10", (float) 10, Category.GENERAL));
        } catch (ItemAlreadyExistsException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        long begin = new Date().getTime();

        for (int i = 0; i < 100000; i++)
            cat.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: " + (end - begin));
        begin = new Date().getTime();
        for (int i = 0; i < 100000; i++)
            cat.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: " + (end - begin));
        System.out.println();

        // task 4-2

        CatalogLoader loader = new CatalogStubLoader();
        try {
            loader.load(cat);
            System.out.println(cat.findItemByID(11).getName());
            System.out.println(cat.findItemByID(12).getName());
        } catch (CatalogLoadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}