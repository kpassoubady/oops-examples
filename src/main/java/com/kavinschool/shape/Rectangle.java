package com.kavinschool.shape;

public class Rectangle extends Shape2D {

	int length, breadth;
    static final String NAME = "Rectangle";

    Rectangle(int l, int b) {
        length = l;
        breadth = b;

        count();
        count2D();
    }

    public Rectangle() {
    }

    public double perimeter() {
        return 2 * length + 2 * breadth;
    }

    /**
     * Finds the circumference of a Rectangle.
     *
     * @deprecated  Not for public use.
     *    This method is expected to be retained only as a package
     *    private method.  Replaced by
     *    {@link #perimeter}
     */
    @SuppressWarnings("unused")
	@Deprecated
    private double circumference() {
        return 2 * length + 2 * breadth;
    }

    public double area() {
        return length * breadth;
    }

    public void draw() {
        System.out.println("Name: :" + NAME);
        System.out.println("Type: " + type);
        System.out.println("ID: " + id);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    public void count() {
        Shape2D.totalShapes++;
    }

    public void count2D() {
        Rectangle.total2dShapes++;
    }

    public void assignUniqueID() {
        id = Shape.totalShapes;
    }

}
