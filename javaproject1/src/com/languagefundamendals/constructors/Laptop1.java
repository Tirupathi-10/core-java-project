package com.languagefundamendals.constructors;

import java.util.Scanner;

public class Laptop1 {
	String brand;
	String model;
	double price;
	String loc;
	
	static Scanner sc =new Scanner(System.in);
	Laptop1(){
		System.out.println("no- arg constructor!!!");
		System.out.println("Enter the Brand:");
		String b=sc.nextLine();
		this(b);
	}
	Laptop1(String brand){
		System.out.println("Enter the model");
		String m=sc.nextLine();
		this(brand,m);
	}
	Laptop1(String brand,String model){
		System.out.println("Enter the price:");
		double p=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the location:");
		String l=sc.nextLine();
		this(brand,model,p,l);
	}
	Laptop1(String brand,String model,double price,String loc){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.loc=loc;
	}
	Laptop1(Laptop1 a){
		this.brand=a.brand;
		this.model=a.model;
		this.price=a.price;
		this.loc=a.loc;
	}

	public static void main(String[] args) {
		Laptop1 lp=new Laptop1();
		lp.display();
		Laptop1 lp1=new Laptop1(lp);
		lp1.display();
	}
	void display() {
		System.out.println("Brand:"+brand);
		System.out.println("model:"+model);
		System.out.println("Price:"+price);
		System.out.println("Location:"+loc);
		System.out.println();
	}

}
