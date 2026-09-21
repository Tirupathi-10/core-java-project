package com.Oops.Abstract;

//1.Create a parent class Product with fields productId, productName, and price, and a method displayProductDetails().
//Create child classes Electronics, Clothing, and Furniture that extend Product.
//Add one additional field to each child class (brand, size, and material respectively).
//Override the method calculateDiscount() in each child class to calculate different discount percentages.
//In the main() method, create objects of all child classes and display the product details, discount, and final price.

public class Product {
	int productId;
	String productName;
	double price;

	public Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	void displayProductDetails() {
		System.out.println("Product Id: " + productId);
		System.out.println("Name of the Product: " + productName);
		System.out.println("Price: " + price);

	}

	double calculateDiscount() {

		return price * 0 / 100;

	}
}

class Electronics extends Product {
	String brand;

	public Electronics(int productId, String productName, double price, String brand) {
		super(productId, productName, price);
		this.brand = brand;
	}

	@Override
	void displayProductDetails() {
		System.out.println();
		System.out.println("-------Electronics---------");
		System.out.println();
		super.displayProductDetails();
		System.out.println("Brand Of the Electronics: " + brand);
	}

	@Override
	double calculateDiscount() {
		return price * 10 / 100;

	}

}

class Clothing extends Product {
	String size;

	public Clothing(int productId, String productName, double price, String size) {
		super(productId, productName, price);
		this.size = size;
	}

	@Override
	void displayProductDetails() {
		System.out.println();
		System.out.println("-------Clothing---------");
		System.out.println();
		super.displayProductDetails();
		System.out.println("Size of the Cloth: " + size);
	}

	@Override
	double calculateDiscount() {
		return price * 5 / 100;
	}

}

class Furniture extends Product {
	String material;

	public Furniture(int productId, String productName, double price, String material) {
		super(productId, productName, price);
		this.material = material;

	}

	@Override
	void displayProductDetails() {
		System.out.println();
		System.out.println("--------Furniture--------");
		System.out.println();
		super.displayProductDetails();
		System.out.println("Name of the Material: " + material);
	}

	@Override
	double calculateDiscount() {
		return price * 15 / 100;
	}
}
