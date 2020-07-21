package com.sales.tax;

public class Main {

    public static void main(String[] args) {
        // Adding the first set of input
        Items addItemsList1 = new Items();
        addItemsList1.addSalesItem("Book", 12.49, true, false);
        addItemsList1.addSalesItem("Music CD", 14.99, false, false);
        addItemsList1.addSalesItem("Chocolate box", 0.85, true, false);
        System.out.println("Output 1 : ");
        addItemsList1.printItems();
        System.out.println("________________________________________\n");

        // Adding the second set of input
        Items addItemsList2 = new Items();
        addItemsList2.addSalesItem("Imported Chocolate", 10.00, true, true);
        addItemsList2.addSalesItem("Imported Perfume ", 47.50, false, true);
        System.out.println("Output 2 : ");
        addItemsList2.printItems();
        System.out.println("________________________________________\n");

        //// Adding the third set of input
        Items addItemsList3 = new Items();
        addItemsList3.addSalesItem("Imported Perfume", 27.99, false, true);
        addItemsList3.addSalesItem("Perfume", 18.99, false, false);
        addItemsList3.addSalesItem("Headache pills", 9.75, true, false);
        addItemsList3.addSalesItem("Imported Chocolate", 11.25, true, true);
        System.out.println("Output 3: ");
        addItemsList3.printItems();
        System.out.println("________________________________________\n");
    }
}
