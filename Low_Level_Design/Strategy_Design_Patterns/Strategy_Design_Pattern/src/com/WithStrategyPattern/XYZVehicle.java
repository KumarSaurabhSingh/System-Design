package com.WithStrategyPattern;

import com.WithStrategyPattern.driverStrategy.XYZ_Driving;

public class XYZVehicle extends Vehicle{
    
    public XYZVehicle(){
        super(new XYZ_Driving());
    }
}
