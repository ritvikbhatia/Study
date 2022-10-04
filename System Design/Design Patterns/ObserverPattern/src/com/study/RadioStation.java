package com.study;

import java.util.ArrayList;
import java.util.List;

public class RadioStation implements Observable{
    List<ObserverInterface> observerInterfaces=new ArrayList<>();
    @Override
    public void broadcast() {
        for (ObserverInterface i :this.observerInterfaces)
        {
            i.update();
        }
    }

    @Override
    public void add(ObserverInterface observerInterface) {
        this.observerInterfaces.add(observerInterface);
    }

    @Override
    public void remove(ObserverInterface observerInterface) {
        this.observerInterfaces.remove(observerInterface);
    }
}
