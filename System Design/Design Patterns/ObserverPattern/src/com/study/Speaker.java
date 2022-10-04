package com.study;

public class Speaker implements ObserverInterface{
    @Override
    public void update() {
        System.out.println("Radio updated");
    }
}
