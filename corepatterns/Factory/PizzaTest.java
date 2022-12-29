package com.mySpringboot.corepatterns.Factory;

public class PizzaTest {
    public static void main(String[] args) {

        PizzaStore ps = new PizzaStore();
        ps.order("chicken");
    }
}
