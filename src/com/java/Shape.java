package com.java;

public class Shape {
public static void main(String[] args) {
	 // Rectangle test
    double width = 5, length = 7;
    Rectangle rectangle = new Rectangle(width, length);
    System.out.println( "Rectangle area: " + rectangle.area()
            + "\nRectangle perimeter: " + rectangle.perimeter() + "\n");

    // Circle test
    double radius = 5;
    Circle circle = new Circle(radius);
    System.out.println("Circle Area: " + circle.area()
        + "\nCircle Perimeter: " + circle.perimeter() + "\n");

    // Triangle test
    double a = 5, b = 3, c = 4;
    Triangle triangle = new Triangle(a,b,c);
    System.out.println("Traingle Area: " + triangle.area()
            + "\nTraingle Perimeter: " + triangle.perimeter() + "\n");
}
}
