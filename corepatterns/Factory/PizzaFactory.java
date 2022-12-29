package com.mySpringboot.corepatterns.Factory;

public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza p = null;

        if(type.equals("cheese")) {
            p = new CheesePizza();
        }

        if(type.equals("chicken")) {
            p = new ChickenPizza();
        }

        if(type.equals("veg")) {
            p = new VeggiePizza();
        }

        return p;
    }
}
