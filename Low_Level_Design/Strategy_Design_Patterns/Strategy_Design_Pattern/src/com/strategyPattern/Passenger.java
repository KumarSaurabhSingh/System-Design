package com.strategyPattern;

public class Passenger extends Vehicle{
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.Drive();

        //isEngine method from the main class - parent class
        System.out.println(vehicle.isEngine());
    }
    
}
