package com.languagefundamendals.constructors;

public class Bike {
	String name;
	String version;
	double price;
	String year;
	
	Bike(){
		this("Royal Enfield");
	}
	Bike(String name ){
		this(name,"BS-6");
	}
	public Bike(String name, String version) {
		this(name,version,250000);
	}
	public Bike(String name, String version, double price) {
		this(name,version,price,"2025");
	}
	public Bike(String name, String version, double price, String year) {
		this.name = name;
		this.version = version;
		this.price = price;
		this.year = year;
	}
	Bike(Bike m){
		this.name = m.name;
	    this.version = m.version;
	    this.price = m.price;
	    this.year = m.year;
	}
	public static void main(String[] args) {
		Bike b=new Bike("Honda","bs-4",120000,"2024");
		b.show();
		Bike b1=new Bike(b);
		b1.show();
	}
	void show() {
		System.out.println("Name of the Bike:"+name);
		System.out.println("Version of the Bike:"+version);
		System.out.println("Price of the Bike:"+price);
		System.out.println("Year of the bike:"+year);
		System.out.println();
	}

}
