package com.reis.interfaces.model.entities;

public class Invoice {
    private double basicPaymente;
    private double tax;

    public Invoice(double basicPaymente, double tax) {
        this.basicPaymente = basicPaymente;
        this.tax = tax;
    }
    public Double getTotalPayment(){
        return getBasicPayment() - getTax();
    }

    public double getBasicPayment() {
        return basicPaymente;
    }

    public void setBasicPaymente(double basicPaymente) {
        this.basicPaymente = basicPaymente;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


}
