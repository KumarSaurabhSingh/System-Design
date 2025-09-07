package com.strategyPattern;

public class Sports extends Vehicle{

    @Override
    public void Drive(){
        System.out.println("Drive Speed !!");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        System.out.println(vehicle.isEngine());
    }
}
