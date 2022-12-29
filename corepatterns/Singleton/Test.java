package com.mySpringboot.corepatterns.Singleton;

import java.io.*;

public class Test  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:/Users/mkumar6087/Documents/Spring-App/third-springboot-project/date.ser")));
        oos.writeObject(dateUtil1);

        DateUtil dateUtil2 = DateUtil.getInstance();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/Users/mkumar6087/Documents/Spring-App/third-springboot-project/date.ser")));
        dateUtil2 = (DateUtil) ois.readObject();
        oos.close();
        ois.close();

        System.out.println(dateUtil1 == dateUtil2);
    }
}
