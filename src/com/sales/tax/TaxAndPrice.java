package com.sales.tax;

public class TaxAndPrice {
    private double tax;
    private double price;
    private int quantity;

   // Constructor for the quantity, tax, price for the sales items
    public TaxAndPrice(double tax, double price, int quantity) {
        this.tax = tax;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
