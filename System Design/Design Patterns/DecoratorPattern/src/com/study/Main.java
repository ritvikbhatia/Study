package com.study;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BasePizza basePizza=new Marghareeta();
        ToppingsDecorator toppingsDecorator=new Onion(new Cheese(new Onion(basePizza)));
        int price=toppingsDecorator.price();
        System.out.println(price);
    }
}
