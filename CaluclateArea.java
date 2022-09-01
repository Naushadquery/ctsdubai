package com.nau;

abstract class Shape {

}

class Circle  extends Shape  {
	public void areaCircle(int radius) {
		System.out.println(Math.PI * (radius * radius));
	}
}

class Rectangle extends Shape  {
	public void areaRectancle(int l, int b) {
		System.out.println(l * b);
	}
}

public class CaluclateArea {

	public void area(Shape s) {
		if (s instanceof Circle) {
			Circle circle = (Circle) s;
			circle.areaCircle(5);
		} else {
			Rectangle rectangle = (Rectangle) s;
			rectangle.areaRectancle(3, 3);
		}
	}

	public static void main(String[] args) {
		CaluclateArea calcArea = new CaluclateArea();
		Circle circle = new Circle();
		Rectangle rect = new Rectangle();
		calcArea.area(circle);
		calcArea.area(rect);
	}
}
