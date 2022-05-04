package com.kavinschool.shape;

public interface ShapeColor {
	int getColorName();

	void setColorName(int ColorName) throws ColorRangeException;

	void resetColor();
}
