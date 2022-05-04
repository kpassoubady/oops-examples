package com.kavinschool.shape;

public class DemoShape {

	public static void main(String[] args) {
		Square square1 = new Square(12);
		Square square2 = new Square(9);

		square1.draw();
		square2.draw();

		System.out.println("Square1 Area: " + square1.area());
		System.out.println("Square1 Perimeter: " + square1.perimeter());
		System.out.println("Square2 Area: " + square2.area());
		System.out.println("Square2 Perimeter: " + square2.perimeter());

//		Cone cone1 = new Cone(14, 4, 20);
//		Cone cone2 = new Cone(14, 4, 20);
//
//		cone1.draw();
//		System.out.println("Cone1 Area: " + cone1.area());
//		System.out.println("Cone1 Perimeter: " + cone1.perimeter());
//		System.out.println("Cone1 Volume: " + cone1.volume());
//
//		cone2.draw();
//		System.out.println("Cone1 Area: " + cone2.area());
//		System.out.println("Cone1 Perimeter: " + cone2.perimeter());
//		System.out.println("Cone1 Volume: " + cone2.volume());
//
//		Rectangle rec = new Rectangle(4, 7);
//		rec.draw();
//		System.out.println("Rectangle Perimeter: " + rec.perimeter());
//		System.out.println("Rectangle area: " + rec.area());
//
//		Circle cir = new Circle(5);
//		System.out.println("Circle Perimeter: " + cir.perimeter());
//		System.out.println("Circle area: " + cir.area());
//		cir.draw(true);
//
//		Cuboid cuboid1 = new Cuboid(10, 4, 5);
//		Cuboid cuboid2 = new Cuboid(4, 6, 25);
//		cuboid1.draw();
//		cuboid2.draw();
//		System.out.println("Cuboid area: " + cuboid1.area());
//
//		Cube cube = new Cube(12);
//		cube.draw();
//		System.out.println(Cube.NAME + " area: " + cube.area());
//
//		try {
//			CirclePlus cir2 = new CirclePlus(13.0, 4, "KavinSchool is Cool");
//			cir2.draw();
//			System.out.println("Cicle Color:" + cir2.getColorName());
//			System.out.println("Circle Label:" + cir2.getShapeLabel());
//		} catch (ColorRangeException e) {
//			e.printStackTrace();
//		}
//
//		RectanglePlus rec2 = new RectanglePlus(4, 7, RainbowColors.BLUE, "Learning Java");
//		rec2.draw();
//		System.out.println("Rectangle Color:" + rec2.getColorName());
//		System.out.println("Rectangle Label:" + rec2.getShapeLabel());
//		RectanglePlus rec3 = new RectanglePlus(4, 7, RainbowColors.ORANGE, "What is in your mind?");
//		rec3.draw();
//
//		System.out.println("Rectangle Color:" + rec3.getColorName());
//		System.out.println("Rectangle Label:" + rec3.getShapeLabel());

		System.out.println("Total Shapes created: " + Shape.totalShapes);
		System.out.println("Total 2D Shapes created: " + Shape2D.total2dShapes);
		System.out.println("Total 3D Shapes created: " + Shape3D.total3dShapes);

	}

}
