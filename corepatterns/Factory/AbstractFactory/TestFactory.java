package com.mySpringboot.corepatterns.Factory.AbstractFactory;

public class TestFactory {

    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("db");
        Dao dao = daf.createDao("dept");
        dao.save();
    }

}
