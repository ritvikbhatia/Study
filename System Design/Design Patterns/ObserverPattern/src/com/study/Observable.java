package com.study;

import java.util.List;

public interface Observable {
    void broadcast();
    void add(ObserverInterface observerInterface);
    void remove(ObserverInterface observerInterface);
}
