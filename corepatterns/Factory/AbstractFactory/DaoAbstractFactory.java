package com.mySpringboot.corepatterns.Factory.AbstractFactory;

public abstract class DaoAbstractFactory {

    public abstract Dao createDao(String type);
}
