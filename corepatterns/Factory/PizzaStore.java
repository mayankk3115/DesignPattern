package com.mySpringboot.corepatterns.Factory;

public class PizzaStore {

    public Pizza order(String type) {
        Pizza p = PizzaFactory.createPizza(type);
        p.prepare();
        p.bake();
        p.cut();

        return p;
    }

}
