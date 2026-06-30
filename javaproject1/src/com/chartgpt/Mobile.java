package com.chartgpt;

public class Mobile {
	static String brandName;
	static String country;
	String modelName;
	int ram;
	int storage;
	int price;
	static {
		brandName = "Vivo";
		country = "china";
	}
	public static void main(String[] args) {
		Mobile b = new Mobile();
		Mobile b1 = new Mobile();
		Mobile b2 = new Mobile();
		
		b.modelName = "y19";
		b.ram =12;
		b.storage = 64;
		b.price = 15000;
		b1.modelName = "T1 44W";
		b1.ram =8;
		b1.storage = 16;
		b1.price = 10000;
		b2.modelName = "s24";
		b2.ram =32;
		b2.storage = 128;
		b2.price = 20000;
		b.display();
		b1.display();
		b2.display();
		
	}
	void display() {
		System.out.println("Brand Name: "+brandName);
		System.out.println("Country: "+country);
		System.out.println("Model Name: "+modelName);
		System.out.println("RAM: "+ram);
		System.out.println("Storage: "+storage);
		System.out.println("Price: "+price);
		System.out.println();
		
	}
}
