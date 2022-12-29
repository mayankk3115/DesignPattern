package com.mySpringboot.corepatterns.Factory.AbstractFactory;

public class DbDeptDao implements Dao{

    @Override
    public void save() {
        System.out.println("Saving Department Details to DB");
    }
}
