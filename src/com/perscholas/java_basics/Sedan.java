package com.perscholas.java_basics;

public class Sedan extends Car{
    //fields
    protected int length;

    //constructor

    public Sedan() {
    }

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    //getters and setters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //override methods

    @Override
    public double getSalesPrice() {
        if(length > 20){
            salePrice = regularPrice - (regularPrice * .05);
        } else {
            salePrice = regularPrice - (regularPrice * .10);
        }
        return super.salePrice;
    }
}
