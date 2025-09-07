package com.WithStrategyPattern;

import com.WithStrategyPattern.driverStrategy.DriverStrategy;
import com.WithStrategyPattern.driverStrategy.NormalDriving;

public class Vehicle {

    DriverStrategy driverStrategy;

    //This is a constructor injuction!!!..........
    public Vehicle(DriverStrategy driverStrategy_Obj){
        this.driverStrategy = driverStrategy_Obj;
    }

    public void drive(){
        driverStrategy.drive();
    }
}
