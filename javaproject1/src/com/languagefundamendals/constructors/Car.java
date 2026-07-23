package com.languagefundamendals.constructors;

public class Car {
	String brand;
	String model;
	int year;
	String color;
	double price;
	public Car() {
		System.out.println("no-arg constructor Called");
		brand="unknown";
		model="unknown";
		year=2020;
		color="black";
		price=0.0;
	}
	

	public Car(String brand, String model) {
		System.out.println("parameterized called");
		this.brand = brand;
		this.model = model;
	}
	
	public Car(String brand, String model, int year) {
		System.out.println("3 arg constructor Called");
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public Car(String brand, String model, int year, String color) {
		System.out.println("4 arg Constructor called");
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
	}


	public Car(String brand, String model, int year, String color, double price) {
		this(brand, model, year, color);
//		this.brand = brand;
//		this.model = model;
//		this.year = year;
//		this.color = color;
		this.price = price;
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		Car c=new Car();
		c.show();
		Car c2=new Car("Audi","XUV");
		c2.show();
		Car c3=new Car("Benz","S10",2025);
		c3.show();
		Car c4= new Car("Mahindra","thar",2026,"white");
		c4.show();
		Car c5= new Car("Suzuki","Swift",2023,"blue",550000);
		c5.show();
	}
	void show() {
		System.out.println("Name of the Car    :"+brand);
		System.out.println("Name of the Model  :"+model);
		System.out.println("Name of the year   :"+year);
		System.out.println("Name of the color  :"+color);
		System.out.println("Name of the price  :"+price);
		System.out.println();
	}

}
