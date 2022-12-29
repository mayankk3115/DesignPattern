package com.mySpringboot.corepatterns.FlyWeight;

public class TestPaint {

    public static void main(String[] args) {
        PaintApp paintApp = new PaintApp();
        paintApp.render(5);
    }
}
