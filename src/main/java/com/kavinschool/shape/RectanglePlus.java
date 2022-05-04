package com.kavinschool.shape;

public class RectanglePlus extends Rectangle implements ShapeLabel, ShapeRainbowColor {

	static final String NAME = "RectanglePlus";
	private int Color;
	private String Label;

	RectanglePlus(int l, int b) {
		super(l, b);
	}

	RectanglePlus(int l, int b, int c, String text) {
		super(l, b);
		Color = c;
		Label = text;
	}

	public int getColorName() {
		return Color;
	}

	public void setColorName(int ShapeColor) {
		Color = ShapeColor;
	}

	public void resetColor() {
		Color = 0;
	}

	public void setShapeLabel(String ShapeLabel) {
		Label = ShapeLabel;
	}

	public String getShapeLabel() {
		return Label;
	}

	public void resetLabel() {
		Label = "";
	}
}
