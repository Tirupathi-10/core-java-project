package com.javaintro;

public class Rectangle {
	void calculatateArea() {
		int length=4;
		int breadth=5;
		int Area=2*length*breadth;
        System.out.println(Area);
		
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println("Area of rectangle ");
		r.calculatateArea();
		
	}

}
