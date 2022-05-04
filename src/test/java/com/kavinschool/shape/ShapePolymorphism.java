package com.kavinschool.shape;

public class ShapePolymorphism {
    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 12);
        shape.draw();
        System.out.println("Rectangle Area: " + shape.area());
        System.out.println("Rectangle Perimeter: " + shape.perimeter());
        System.out.println("=".repeat(40));
        shape = new Cube(3);
        shape.draw();
        System.out.println("Cube Area: " + shape.area());
        System.out.println("Cube Perimeter: " + shape.perimeter());
        System.out.println("=".repeat(40));
        shape = new Circle(3);
        shape.draw();
        System.out.println("Circle Area: " + shape.area());
        System.out.println("Circle Perimeter: " + shape.perimeter());
        System.out.println("=".repeat(40));
    }
}
