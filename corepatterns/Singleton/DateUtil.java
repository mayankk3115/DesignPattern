package com.mySpringboot.corepatterns.Singleton;

import java.io.Serializable;

public class DateUtil  implements Serializable, Cloneable {

    //volatile keyword used to avoid any issues in multithreaded env
    private static volatile DateUtil instance;

//Eager Initialization
//    static {
//        instance = new DateUtil();
//    }

    private DateUtil() {

    }

    public static DateUtil getInstance() {
        // Lock on Object
        if (instance == null) {
            synchronized (DateUtil.class) {
                //Lazy initialization
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
