package com.kavinschool.shape;

public class Square extends Shape2D {

    static final String NAME = "Square";
    double side;

    Square(int s) {
        side = s;
        count();
        count2D();
        assignUniqueID();
    }

    public Square() {
    }

    public double perimeter() {
        return 4 * side;
    }

    public double area() {
        return side * side;
    }

    public void draw() {
        System.out.println("Name:" + NAME);
        System.out.println("Type: " + type);
        System.out.println("ID: " + id);
        System.out.println("Side: " + side);
    }

    protected void count() {
        Square.totalShapes++;
    }

    protected void count2D() {
        Shape2D.total2dShapes++;
    }

    protected void assignUniqueID() {
        id = Shape.totalShapes;
    }
}
