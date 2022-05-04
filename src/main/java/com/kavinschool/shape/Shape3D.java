package com.kavinschool.shape;

public abstract class Shape3D extends Shape {

	static int total3dShapes = 0;
	static final String NAME = "3D Shape";
	protected String type = "3D";

	abstract public double volume();

	abstract protected void count3D();
}
