package com.sales.tax;

public class SalesItem {
    private final String itemName;
    private final double itemPrice;
    private final boolean isExempted;
    private final boolean isImported;

    // Constructor to create the sale item
    public SalesItem(String itemName, double itemPrice, boolean isExempted, boolean isImported) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.isExempted = isExempted;
        this.isImported = isImported;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public boolean isExempted() {
        return isExempted;
    }

    public boolean isImported() {
        return isImported;
    }

    //Method to calculate the tax depending on the criteria (exempted and imported)
    public TaxAndPrice calculatePrice(int qty){
        double totalPrice=0;
        double tax =0;
        double exemptedTaxRate = (10.0 / 100);
        double importedTaxRate = (5.0 / 100);
        if ((this.isExempted) && (this.isImported)) {
            tax = Math.round((importedTaxRate*this.itemPrice)*10.0)/10.0;
            totalPrice = this.itemPrice+tax*qty;
        }
        else if ((this.isExempted) && (!this.isImported)) {
            tax = 0;
            totalPrice = this.itemPrice+tax*qty;
        }
        else if ((!this.isExempted) && (this.isImported)) {
            tax =Math.round(((exemptedTaxRate * this.itemPrice)+(importedTaxRate * this.itemPrice))*20.0)/20.0;
            totalPrice = this.itemPrice+tax*qty;
        }
        else if ((!this.isExempted) && (!this.isImported)) {
            tax = Math.round((exemptedTaxRate * (this.itemPrice))*20.0)/20.0;
            totalPrice = this.itemPrice+tax*qty;
        }
        TaxAndPrice tp = new TaxAndPrice(tax, totalPrice, qty);
        return tp;
    }
}
