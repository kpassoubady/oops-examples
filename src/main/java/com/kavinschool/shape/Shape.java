package com.kavinschool.shape;

public abstract class Shape {
    /**
     * @serial holds the total number of shapes object created. Note this will contain total of both Shape2D and Shape3D objects.
     */
    static int totalShapes = 0;
    /**
     * @value NAME holds "Shape" string
     */
    static final String NAME = "Shape";
    protected String type = "Abstract";

    /*
     * @serial holds the unique id of objects. This value should be unique for both Shape2D and Shape3D objects.
     */
    protected int id;

    abstract public double area();

    abstract public double perimeter();

    /*
     * This method displys the instance attributes information
     *
     */
    abstract public void draw();

    abstract protected void count();

    abstract protected void assignUniqueID();

}
