package com.kavinschool.shape;

public class CirclePlus extends Circle implements ShapeColor, ShapeLabel {

	static final String NAME = "CirclePlus";

	private int Color;
	private String Label;

	CirclePlus(int r) {
		super(r);
	}

	CirclePlus(double radius, int CircleColor, String CircleLabel) throws ColorRangeException {
		super(radius);
		setShapeLabel(CircleLabel);
		try {
			setColorName(CircleColor);
		} catch (ColorRangeException e) {
			if (Color < 0 || Color > 255)
				throw new ColorRangeException("An out of range color value was specified");
			e.printStackTrace();
		} finally {
			setColorName(0);
		}

	}

	public int getColorName() {
		return Color;

	}

	public void setColorName(int ColorName) throws ColorRangeException {
		Color = ColorName;
		if (Color < 0 || Color > 255)
			throw new ColorRangeException("An out of range color value was specified");
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
