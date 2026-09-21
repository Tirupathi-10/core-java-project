package com.Oops.Abstract;

public class ProductInfo {

	public static void main(String[] args) {

		Product e = new Electronics(101, "Mobile", 25000, "Vivo");
		e.displayProductDetails();
		double discount = e.calculateDiscount();
		System.out.println("Discount: " + discount);
		System.out.println("Final Price: " + (e.price - discount));
		Product c = new Clothing(102, "Shirt", 2000, "Medium");
		c.displayProductDetails();
		double discount1 = c.calculateDiscount();
		System.out.println("Discount: " + discount1);
		System.out.println("Final Price: " + (c.price - discount1));
		Product f = new Furniture(103, "Sofa", 15000, "Sofa");
		f.displayProductDetails();
		double discount2 = f.calculateDiscount();
		System.out.println("Discount: " + discount2);
		System.out.println("Final Price: " + (f.price - discount2));

	}

}
