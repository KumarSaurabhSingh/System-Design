package com.WithStrategyPattern;
import com.WithStrategyPattern.driverStrategy.SportyDriving;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportyDriving());
    }

}
