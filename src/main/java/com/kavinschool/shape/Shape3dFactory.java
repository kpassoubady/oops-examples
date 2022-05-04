package com.kavinschool.shape;

public class Shape3dFactory {
    private static Shape3dFactory shape3dFactoryInstance;

    private Shape3dFactory() {
    }

    public static Shape3dFactory getInstance() {
        if (shape3dFactoryInstance == null) {
            shape3dFactoryInstance = new Shape3dFactory();
        }
        return shape3dFactoryInstance;
    }

    public Shape3D getShape3D(Shape3dEnum shape3dEnum) {
        switch (shape3dEnum) {
            case CONE: {
                return new Cone();
            }
            case CUBOID: {
                return new Cuboid();
            }
            case CUBE: {
                return new Cube();
            }
            default: {
                return null;
            }
        }
    }
}