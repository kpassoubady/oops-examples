package com.kavinschool.shape;

public class Cuboid extends Shape3D {

	double height, width, length;
	static final String NAME = "Cubiod";

	Cuboid(double height, double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;

		count();
		count3D();
		assignUniqueID();
	}

	Cuboid(int h, int w, int l) {
		height = h;
		width = w;
		length = l;

		count();
		count3D();
		assignUniqueID();

	}

    public Cuboid() {
    }

    public double area() {
		return 2 * (height * width + width * length + length * height);
	}

	public double volume() {
		return height * width * length;
	}

	public double perimeter() {
		return 2 * (length + width + height);
	}

	public void draw() {
		System.out.println("Name:" + NAME);
		System.out.println("Type: " + type);
		System.out.println("ID: " + id);
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
		System.out.println("Length: " + length);
	}

	protected void count() {
		Shape3D.totalShapes++;
	}

	protected void count3D() {
		Cuboid.total3dShapes++;
	}

	protected void assignUniqueID() {
		id = Shape.totalShapes;
	}

}
