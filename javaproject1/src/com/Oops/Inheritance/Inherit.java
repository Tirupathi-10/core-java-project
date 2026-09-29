package com.Oops.Inheritance;

class Vehicle {

	void start() {
		System.out.println("Vehicle Started");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Vehicle Drive");
	}
}

public class Inherit {

	public static void main(String[] args) {
		Car c = new Car();
		c.drive();

	}

}
