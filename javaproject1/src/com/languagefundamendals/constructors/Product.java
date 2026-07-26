package com.languagefundamendals.constructors;

import java.util.Scanner;

public class Product {

	String productName;
	double price;
	int quantity;
	static Scanner sc=new Scanner (System.in);
	Product(){
		System.out.println("Enter the Name:");
		String productName=sc.nextLine();
		this(productName);
	}

	public Product(String productName) {
		System.out.println("Enter the Price:");
		double price=sc.nextDouble();
		this(productName,price);
	}

	public Product(String productName, double price) {
		System.out.println("Enter the Quantity:");
		int quantity=sc.nextInt();
		this(productName,price,quantity);
	}

	public Product(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public static void main(String[] args) {
		Product p=new Product();
		p.display();
	}
	void display() {
		double totalcost=(price*quantity);
		System.out.println("Product Name:"+productName);
		System.out.println("Price:"+price);
		System.out.println("Quantity:"+quantity);
		System.out.println("Total Cost:"+totalcost);
	}

}
