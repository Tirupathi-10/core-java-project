package com.languagefundamendals.methods;

public class RestarantBill {
	String customerName() {
		return "Tirupathi";
	}
	String foodItem() {
		return "Biryani";
	}
	int quantity() {
		return 9;
	}
	double amount() {
		return quantity()*300;
	}
	double gst() {
		return amount()*0.18;
	}
	double total() {
		return amount()+gst();
	}
	String customer(String name) {
		return name;
	}
	String item(String Itemname) {
		return Itemname;
	}
	int quantity(int quan) {
		return 	quan;
	}
	double price(double price) {
		return price;
	}
	double amount(double quan,double price) {
		return quan * price;
	}
	

	public static void main(String[] args) {
		RestarantBill b=new RestarantBill();
		
		System.out.println("Customer Name: "+b.customerName());
		System.out.println("Food item Name: "+b.foodItem() );
		System.out.println("Quantity: "+b.quantity());
		System.out.println("Amount: "+b.amount());
		System.out.println("gst: "+b.gst());
		System.out.println("Total Amount: "+b.total());
		
		String s=b.customer("Tirupathi");
		String i=b.item("Mutton dum");
		int q=b.quantity(5);
		double p=b.price(500);
		double a=b.amount(5, 500);
		System.out.println("Customer Name: "+s);
		System.out.println("Item Name: "+i);
		System.out.println("Quantity: "+q);
		System.out.println("price: "+p);
		System.out.println("Amount: "+a);
	}

}
