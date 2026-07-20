package com.languagefundamendals.methods;

import java.util.Scanner;

public class Areas1 {
	String customerName(String fname,String lname) {
		return fname+" "+lname;
	}
	long mobileNumber(long mobilenum) {
		return mobilenum;
	}
	String productName(String PName) {
		return PName;
	}
	String brand(String Brand) {
		return Brand;
	}
	char size(char size) {
		return size;
	}
	String colour(String Colour) {
		return Colour;
	}
	int quantity(int Quantity) {
		return Quantity;
	}
	double price(double Price) {
		return Price;
	}
	double totalAmount(int Quantity,double Price) {
		return (Quantity*Price);
	}
	double discount(double totalAmount,double discount) {
		return totalAmount-(totalAmount*discount/100);
	}
	double finalAmount(double finalAmount) {
		return finalAmount;
	}

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		Areas1 A=new Areas1();
		System.out.println("Enter the First Name: ");
		String fName=sc.nextLine();
		System.out.println("Enter the last Name: ");
		String lName=sc.nextLine();
		String name=A.customerName(fName,lName);
		System.out.println("Enter the mobile number: ");
		long mobileNumber=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Product Name: ");
		String ProductName=sc.nextLine();
		System.out.println("Enter the Brand Name: ");
		String brand=sc.nextLine();
		System.out.println("Enter the size: ");
		char S=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("colour:");
		String color=sc.nextLine();
		System.out.println("Quantity: ");
		int Quan=sc.nextInt();
		System.out.println("price:");
		double Pric=sc.nextDouble();
		System.out.println("Discount:");
		double dis=sc.nextDouble();
		long num=A.mobileNumber(mobileNumber);
		String Pro=A.productName(ProductName);
		String Brand=A.brand(brand);
		char s=A.size(S);
		String C=A.colour(color);
		int Q=A.quantity(Quan);
		double P=A.price(Pric);
		double TA=A.totalAmount(Quan, Pric);
		double D=A.discount(TA, dis);
		double Amount=A.finalAmount(D);
		

		System.out.println("Customer Name: "+name);
		System.out.println("Mobile Number: "+num);
		System.out.println("Product Name: "+Pro);
		System.out.println("Bramd: "+Brand);
		System.out.println("Size: "+S);
		System.out.println("colour:"+color);
		System.out.println("Quantity: "+Quan);
		System.out.println("price:"+Pric);
		System.out.println("Discount:"+dis);
		System.out.println("Total Amount:"+Amount);
	}

}
