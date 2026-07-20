package com.languagefundamendals.methods;

import java.util.Scanner;

public class Swiggy {
	String customerName(String Name) {
		return Name;
	}
	int orderId(int OrderId) {
		return OrderId;
	}
	String itemName(String food) {
		return food;
	}
	double price(double Price) {
		return Price;
	}
	double couponAmount(double price,double couponamount) {
		return price-couponamount;
	}
	
	public static void main(String[] args) {
		Swiggy s=new Swiggy();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String cName=sc.nextLine();
		System.out.println("Enter the Order Id: ");
		int OId=sc.nextInt();
		System.out.println("Enter the Item Name: ");
		String IName=sc.nextLine();
		sc.nextLine();
		System.out.println("Item Price: ");
		double price=sc.nextDouble();
		System.out.println("Coupon Amount: ");
		double Camount=sc.nextDouble();
		
		System.out.println("Name of the Customer: "+s.customerName(cName));
		System.out.println("Order Id: "+s.orderId(OId));
		System.out.println("Item Name: "+s.itemName(IName));
		System.out.println("Price of the Item: "+s.price(price));
		System.out.println("Final Amount: "+s.couponAmount(price, Camount));

	}

}
