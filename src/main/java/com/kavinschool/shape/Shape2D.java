package com.kavinschool.shape;

public abstract class Shape2D extends Shape {

    static int total2dShapes = 0;
    static final String NAME = "2D Shape";
    protected String type = "2D";

    abstract protected void count2D();

}
