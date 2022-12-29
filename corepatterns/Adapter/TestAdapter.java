package com.mySpringboot.corepatterns.Adapter;

public class TestAdapter {

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.showTemperature(116);
    }
}
