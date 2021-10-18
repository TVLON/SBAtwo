package com.perscholas.java_basics;

public class Truck extends Car{

    //fields
    protected int weight;


    //constructors


    public Truck() {

    }

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    //getters and setters

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //override methods

    @Override
    public double getSalesPrice() {
        if(weight > 2000){
            salePrice = getRegularPrice() - (getRegularPrice() * .10);
        } else{
            salePrice = getRegularPrice() - (getRegularPrice() * .20);
        }
        return super.salePrice;
    }
}
