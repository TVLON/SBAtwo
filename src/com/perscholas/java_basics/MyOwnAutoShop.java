package com.perscholas.java_basics;

public class MyOwnAutoShop {

    public static void main(String[] args) {
        //Car Instance
	    Car truck = new Truck(180, 35000.0, "black", 2500);
        System.out.println("Sales Price: " + truck.getSalesPrice());
        //Ford Instances
        Ford focus = new Ford(180, 45000.0, "black", 2010, 2000);
        System.out.println("Sales Price: " + focus.getSalesPrice());
        Ford ford = new Ford(200, 40000.0, "Yellow", 2007, 5000);
        System.out.println("Sales Price: " + ford.getSalesPrice());
        //Sedan Instance
        Sedan sedan = new Sedan(190, 25000.0, "blue", 19);
        System.out.println("Sales Price: " + sedan.getSalesPrice());
    }
}
