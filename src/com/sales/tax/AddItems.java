package com.sales.tax;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AddItems {
    private ArrayList<SalesItem> salesItems=new ArrayList<SalesItem>();

    public void addSalesItem(String itemName, double itemPrice, boolean isExempted, boolean isImported){
        this.salesItems.add(new SalesItem(itemName, itemPrice, isExempted, isImported));
    }

    public void printItems(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double total =0, totalTax =0;

        for (SalesItem si : this.salesItems){
            TaxAndPrice aftercalcTP = si.calculatePrice(1);
            System.out.println(aftercalcTP.getQuantity()+"  " +si.getItemName()+"\t\t\t\t"+df.format(aftercalcTP.getPrice()));
            total += aftercalcTP.getPrice();
            totalTax += aftercalcTP.getTax();
        }
        System.out.println("________________________________________\n");
        System.out.println("Sales Tax: "+df.format(totalTax)+ "\t\t\tTotal : " +df.format(total));
    }
}
