package com.study;

public class Cheese extends ToppingsDecorator{
    BasePizza basePizza;
    Cheese(BasePizza basePizza) {
        this.basePizza=basePizza;
    }

    @Override
    public int price() {
        return this.basePizza.price()+80;
    }
}
