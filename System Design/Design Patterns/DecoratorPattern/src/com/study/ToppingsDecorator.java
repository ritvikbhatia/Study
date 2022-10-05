package com.study;

public abstract class ToppingsDecorator extends BasePizza {
     BasePizza basePizza;
     ToppingsDecorator(BasePizza basePizza)
     {
          this.basePizza=basePizza;
     }

     public ToppingsDecorator() {

     }
}
