package com.mySpringboot.corepatterns.Template;

public class TestTemplate {

    public static void main(String[] args) {
        DataRenderer dataRenderer = new XMLDataRenderer();
        dataRenderer.render();
    }
}
