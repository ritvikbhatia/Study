package com.study;

public class Onion extends ToppingsDecorator {
    BasePizza basePizza;
    public Onion(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int price() {
        return this.basePizza.price()+90;
    }
}
