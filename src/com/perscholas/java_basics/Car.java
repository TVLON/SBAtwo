package com.perscholas.java_basics;

public class Car {

    //fields
    protected int speed;
    protected double regularPrice;
    protected String color;
    protected double salePrice;


    //constructors

    public Car() {
    }

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    //methods
    public double getSalesPrice(){
        salePrice = regularPrice;
        return salePrice;
    }

    //getters and setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
}
