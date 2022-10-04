package com.study;

import com.study.strategy.DrivingStrategy;
import com.study.strategy.NormalDrivingStrategy;
import com.study.strategy.SportyDrivingStrategy;

public class Main {

    public static void main(String[] args) {
        DrivingStrategy drivingStrategy=new SportyDrivingStrategy();
	    Vehicle vehicle=new Vehicle(drivingStrategy);
        vehicle.drive();
    }
}
