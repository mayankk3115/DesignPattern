package com.mySpringboot.corepatterns.Factory.AbstractFactory;

public class XMLEmpDao implements Dao{

    @Override
    public void save() {
        System.out.println("Saving Employee Details to XML");
    }
}
