package com.sales.tax;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SalesTaxTest {

    @org.junit.jupiter.api.Test
    void testCalculatePriceforExemptedNonImportedItem(){
        SalesItem bookST = new SalesItem("Book", 12.49, true, false);
        com.sales.tax.TaxAndPrice tp = bookST.calculatePrice(1);
        DecimalFormat df = new DecimalFormat("#,###.00");
        double expected = 12.49;
        double actual = (Double) tp.getPrice();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testCalculatePriceforNonExemptedNonImportedItem(){
        SalesItem perfume = new SalesItem("Perfume", 18.99, false, false);
        com.sales.tax.TaxAndPrice tp = perfume.calculatePrice(1);
        DecimalFormat df = new DecimalFormat("#,###.00");
        double expected = 20.89;
        double actual = Double.parseDouble(df.format(tp.getPrice()));
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testCalculatePriceforExemptedImportedItem(){
        SalesItem chocolate = new SalesItem("Chocolate", 10.00, true, true);
        com.sales.tax.TaxAndPrice tp = chocolate.calculatePrice(1);
        DecimalFormat df = new DecimalFormat("#,###.00");
        double expected = 10.50;
        double actual = Double.parseDouble(df.format(tp.getPrice()));
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testCalculatePriceforNonExemptedImportedItem(){
        SalesItem perfume = new SalesItem("Perfume", 27.99, false, true);
        com.sales.tax.TaxAndPrice tp = perfume.calculatePrice(1);
        DecimalFormat df = new DecimalFormat("#,###.00");
        double expected = 32.19;
        double actual = Double.parseDouble(df.format(tp.getPrice()));
        assertEquals(expected, actual);
    }

}

