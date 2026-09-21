package com.Oops.Abstract;

import java.util.Scanner;

public abstract class Shape {
	Scanner sc = new Scanner(System.in);

	abstract void area();

}

class Circle extends Shape {

	@Override
	void area() {
		System.out.print("Enter the Circle Radius:");
		double r = sc.nextDouble();
		double area = Math.PI * r * r;
		System.out.println("Area of the Circle: " + area);
		System.out.println();
	}

}

class Rectangle extends Shape {

	@Override
	void area() {
		System.out.print("Enter the Rectangle Length:");
		double l = sc.nextDouble();
		System.out.print("Enter the Rectangle Breadth:");
		double b = sc.nextDouble();
		double areaRec = l * b;
		System.out.println("Area of the Rectangle: " + areaRec);
		System.out.println();
	}

}
class Triangle extends Shape {

	@Override
	void area() {
		System.out.print("Enter the Triangle Base:");
		double b = sc.nextDouble();
		System.out.print("Enter the Triangle  Height:");
		double h = sc.nextDouble();
		double areaTri = 0.5 * b * h;
		System.out.println("Area of the Triangle: " + areaTri);
	}

}