package com.languagefundamendals.constructors;

public class Mobile {
	String brand;
	String model;
	int year;
	int price;
	String color;
	String ram;
	public Mobile() {
		brand="Vivo";
		model="unknow";
		year=2023;
		price=20000;
		color="unknown";
	}
	public Mobile(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	public Mobile(String brand, String model, int year, int price) {
		this(brand,model,year);
		this.price = price;
	}
	public Mobile(String brand, String model, int year, int price, String color) {
		this(brand,model,year,price);
		this.color = color;
	}
	public Mobile(String brand, String model, int year, int price, String color, String ram) {
		this(brand,model,year,price,color);
		this.ram = ram;
	}
	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.display();
		Mobile m1=new Mobile("Realme","Narzo 20",2024);
		m1.display();
		Mobile m2=new Mobile("sumsung","ultra24",2025,90000);
		m2.display();
		Mobile m3=new Mobile("Iphone","16Pro",2026,150000,"purple");
		m3.display();
		Mobile m4=new Mobile("Oppo","f11Pro",2026,75000,"Blue","16GB");
		m4.display();
	}
	void display() {
		System.out.println("Name of the Mobile:"+brand);
		System.out.println("Name of the Model:"+model);
		System.out.println("Name of the Year:"+year);
		System.out.println("Name of the Price:"+price);
		System.out.println("Name of the Color:"+color);
		System.out.println("Name of the Ram:"+ram);
		System.out.println();

	}

}
