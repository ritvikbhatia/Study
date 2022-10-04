package com.study.strategy;

public class NormalDrivingStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("Drive Normally");
    }
}
