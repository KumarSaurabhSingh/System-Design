package com.WithStrategyPattern;

import com.WithStrategyPattern.driverStrategy.NormalDriving;

public class PassengerVehicle extends Vehicle{

    public PassengerVehicle() {
        super(new NormalDriving());
    }

}
