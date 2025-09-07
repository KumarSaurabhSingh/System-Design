package com.strategyPattern;

public class OffRoading extends Vehicle{

    @Override
    public void Drive(){
        System.out.println("Drive OffRoading yeahhhhhhh !!");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        System.out.println(vehicle.isEngine());
    }
}
