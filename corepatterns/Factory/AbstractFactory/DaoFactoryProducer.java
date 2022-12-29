package com.mySpringboot.corepatterns.Factory.AbstractFactory;

public class DaoFactoryProducer {

    public static  DaoAbstractFactory produce(String factoryType) {
        DaoAbstractFactory daf = null;
        if(factoryType.equals("xml")) {
            daf = new XMLDaoFactory();
        } else if (factoryType.equals("db")) {
            daf = new DbDaoFactory();
        }
        return daf;
    }
}
