package com.kavinschool.pattern.factory;

import com.kavinschool.shape.Cube;
import com.kavinschool.shape.Shape3dEnum;
import com.kavinschool.shape.Shape3dFactory;

public class Shape3dFactoryDemo {
    public static void main(String[] args) {
        Cube cube = (Cube) Shape3dFactory.getInstance().getShape3D(Shape3dEnum.CUBE);
        cube.setSide(5);
        cube.draw();

    }
}
