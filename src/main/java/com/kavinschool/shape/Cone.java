package com.kavinschool.shape;

public class Cone extends Shape3D {

	double height;
    double side;
    double radius;
    static final String NAME = "Cone";

    Cone(int s, int r, int h) {
        side = s;
        radius = r;
        height = h;

        count();
        count3D();
        assignUniqueID();
    }

    public Cone() {
    }

    public double area() {
        return Math.PI * side * radius;
    }

    public double perimeter() {
        return Math.PI * radius * radius + Math.PI * radius * Math.sqrt(radius * radius + height * height);
    }

    public double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }

    public void draw() {
        System.out.println("Name:" + NAME);
        System.out.println("Type: " + type);
        System.out.println("ID: " + id);
        System.out.println("Side: " + side);
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
    }

    protected void count() {
        Shape3D.totalShapes++;
    }

    protected void count3D() {
        Cone.total3dShapes++;
    }

    protected void assignUniqueID() {
        id = Shape.totalShapes;
    }

}
