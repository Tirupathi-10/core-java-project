package com.languagefundamendals.methods;

public class AllMethods {
	void display() {
		System.out.println("Name of the Student: Tirupathi ");
		System.out.println("Age:23");
		System.out.println("City: Vizag");
	}
	void name(String Name) {
		System.out.println("Name of the Student:"+Name);
	}
	void age(int Age) {
		System.out.println("Age: "+Age);
	}
	void city(String City) {
		System.out.println("City: "+City);
	}
	String getname() {
		return "Tirupathi";
	}
	int getage() {
		return 25;
	}
	String getcity() {
		return "Vizag";
	}
	String stname(String Name) {
		return Name;
	}
	int stage(int age) {
		return age;
	}
	String stcity(String City) {
		return City;
	}

	public static void main(String[] args) {
		AllMethods m= new AllMethods();
		m.display();
		m.name("Tirupathi");
		m.age(23);
		m.city("Vizag");
		String s=m.getname();
		int a=m.getage();
		String c=m.getcity();
		System.out.println(s);
		System.out.println(a);
		System.out.println(c);
		String name=m.stname("Tiru");
		int age=m.stage(23);
		String city=m.stcity("Vizag");
		System.out.println(name);
		System.out.println(age);
		System.out.println(city);
				
	}

}
