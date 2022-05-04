package com.kavinschool.shape;

public class Cube extends Shape3D {

    double side;
    static final String NAME = "Cube";

    Cube(int s) {
        side = s;
        count();
        count3D();
        assignUniqueID();

    }

    public Cube() {
    }

    public double area() {
        return 6 * side * side;
    }

    public double volume() {
        return side * side * side;
    }

    public double perimeter() {
        return 12 * side;
    }

    public void draw() {
        System.out.println("Name:" + NAME);
        System.out.println("Type: " + type);
        System.out.println("ID: " + id);
        System.out.println("Side: " + side);
    }

    protected void count() {
        Shape3D.totalShapes++;
    }

    protected void count3D() {
        Cube.total3dShapes++;
    }

    protected void assignUniqueID() {
        id = Shape.totalShapes;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    protected void finalize() {
        System.out.println("Finalizing " + id);
    }
}
