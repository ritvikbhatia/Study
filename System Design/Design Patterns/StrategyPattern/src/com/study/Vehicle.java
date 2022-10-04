package com.study;

import com.study.strategy.DrivingStrategy;

public class Vehicle {
    private DrivingStrategy drivingStrategy;
    public Vehicle(DrivingStrategy drivingStrategy)
    {
        this.drivingStrategy=drivingStrategy;
    }
    public void drive()
    {
        this.drivingStrategy.drive();
    }

}
