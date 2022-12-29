package com.mySpringboot.corepatterns.FlyWeight;

public class Circle extends Shape{
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Circle() {
        label="Circle";
    }

    @Override
    public void draw(int radius, String fillColour, String lineColour) {
        System.out.println("Drawing a "+ label + " with radius:"+ radius +
                " with fillColour:"+ fillColour + " and lineColour:"+ lineColour);
    }
}
