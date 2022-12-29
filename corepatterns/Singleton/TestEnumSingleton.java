package com.mySpringboot.corepatterns.Singleton;

public class TestEnumSingleton {

    public static void main(String[] args) {
        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
        System.out.println(instance.getName());

        instance.setName("Mayank");
        System.out.println(instance.getName());
    }
}
