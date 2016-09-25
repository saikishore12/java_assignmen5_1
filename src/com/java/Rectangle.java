package com.java;

public class Rectangle extends Dimensions {
	private final double width, length; // sides

	public Rectangle() {
		this.width = 1;
		this.length = 1;
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}

}
