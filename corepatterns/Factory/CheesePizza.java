package com.mySpringboot.corepatterns.Factory;

public class CheesePizza implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Preparing Cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese pizza");
    }
}
