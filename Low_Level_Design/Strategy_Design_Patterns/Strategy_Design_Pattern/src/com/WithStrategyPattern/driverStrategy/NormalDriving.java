package com.WithStrategyPattern.driverStrategy;

public class NormalDriving implements DriverStrategy{

    //Interfaces don't need to override it's by default overridden
    public void drive(){
        System.out.println("This is Normal Driving!!");
    }
}
