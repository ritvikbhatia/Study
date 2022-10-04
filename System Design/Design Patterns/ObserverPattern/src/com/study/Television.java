package com.study;

public class Television implements ObserverInterface{

    @Override
    public void update() {
        System.out.println("Television updated");
    }
}
