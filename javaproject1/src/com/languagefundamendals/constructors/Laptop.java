package com.languagefundamendals.constructors;

public class Laptop {
	String brand;
	String model;
	double price;
	String ram;
	Laptop(){
		this("unknown");
		System.out.println("No-arg Constructor");
	}
	Laptop(String brand){
		this(brand,"intel");
	}
	Laptop(String brand,String model){
		this(brand,model,100000,"16GB");
	}
	Laptop(String brand,String model,double price,String ram){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.ram=ram;
	}
	Laptop(Laptop m){
		this.brand=m.brand;
		this.model=m.model;
		this.price=m.price;
		this.ram=m.ram;
	}

	public static void main(String[] args) {
		Laptop l=new Laptop();
		l.show();
		Laptop l2=new Laptop("Asus","Rizen 5",70000,"128GB");
		l2.show();
		Laptop l3=new Laptop(l2);
		l3.show();
	}
	void show() {
		System.out.println("Brand of the laptop:"+brand);
		System.out.println("Model of the Laptop:"+model);
		System.out.println("Price of the Laptop:"+price);
		System.out.println("Ram of the Laptop:"+ram);
		System.out.println();
	}

}
