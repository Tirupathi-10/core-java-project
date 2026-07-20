package com.languagefundamendals.methods;

import java.util.Scanner;

public class Areas {
	Scanner sc= new Scanner(System.in);
	double areaOfRectangle() {
		System.out.println("Enter the length: ");
		double length=sc.nextDouble();
		System.out.println("Enter the Breadth: ");
		double breadth=sc.nextDouble();
		double area=length*breadth;
		return area;
	}
	double areaOfSquare() {
		System.out.println("Enter the Side: ");
		double side=sc.nextDouble();
		return side*side;
	}
	int areaOfTriangle() {
		System.out.println("Enter the base: ");
		double base=sc.nextDouble();
		System.out.println("Enter the Height: ");
		double height=sc.nextDouble();
		return (int) (0.5*base*height);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Areas a=new Areas();
		double area=a.areaOfRectangle();
		System.out.println("Area of the Rectangle: "+area);
		System.out.println();
		double Sarea=a.areaOfSquare();
		System.out.println("Area of the Square: "+Sarea);
		int Tarea=a.areaOfTriangle();
		System.out.println("Area of the Triangle: "+Tarea);
	}

}
