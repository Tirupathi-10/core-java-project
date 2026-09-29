package com.Oops.Inheritance;

class Vehicle1 {
	int vSpeed = 50;

	void display() {
		System.out.println("Vechile Speed is 50");
	}
}

class Car1 extends Vehicle1 {
	int cSpeed = 100;

	@Override
	void display() {
		System.out.println("Car Speed is 100");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Vehicle1 v = new Car1();
		System.out.println("Speed: " + v.vSpeed);
		v.display();
	}
}
