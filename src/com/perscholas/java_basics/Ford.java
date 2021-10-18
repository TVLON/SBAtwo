package com.perscholas.java_basics;

public class Ford extends Car{

    //fields
    protected int year;
    protected int manufacturerDiscount;

    //constructors

    public Ford() {
    }

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    //getters and setters

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    //override method


    @Override
    public double getSalesPrice() {
        salePrice = (regularPrice - manufacturerDiscount);
        return super.salePrice;
    }
}
