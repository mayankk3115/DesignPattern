package com.mySpringboot.corepatterns.Factory.AbstractFactory;

public class XMLDeptDao implements Dao{

    @Override
    public void save() {
        System.out.println("Saving Department Details to XML");
    }
}
