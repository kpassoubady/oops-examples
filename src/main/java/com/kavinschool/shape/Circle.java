package com.kavinschool.shape;

public class Circle extends Shape2D {

	double radius;
	static final String NAME = "Circle";

	Circle(int r) {
		radius = r;

		count();
		count2D();
		assignUniqueID();

	}

	public Circle(double radius) {
		this.radius = radius;

		count();
		count2D();
		assignUniqueID();
	}

    public Circle() {
    }

    /**
	 * Finds the circumference of a Circle.
	 *
	 * @deprecated Not for public use. This method is expected to be retained
	 *             only as a package private method. Replaced by
	 *             {@link #perimeter}
	 */
	@SuppressWarnings("unused")
	@Deprecated
	private double circumference() {
		return 2 * Math.PI * radius;
	}

	/**
	 * @return Returns perimeter of a circle
	 */
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	/**
	 * @return Returns area of a circle
	 */
	public double area() {
		return Math.PI * radius * radius;
	}

	public void draw() {
		System.out.println("Name:" + NAME);
		System.out.println("Type: " + type);
		System.out.println("ID: " + id);
		System.out.println("Radius: " + radius);
	}

	/**
	 * @param deep
	 *            - accepts boolean value. If true prints area and perimeter
	 *            values
	 */
	public void draw(boolean deep) {
		draw();
		if (deep) {
			System.out.println("Area: " + area());
			System.out.println("Perimeter: " + perimeter());
		}
	}

	protected void count() {
		Shape2D.totalShapes++;
	}

	protected void count2D() {
		Circle.total2dShapes++;
	}

	protected void assignUniqueID() {
		id = Shape.totalShapes;
	}

}
