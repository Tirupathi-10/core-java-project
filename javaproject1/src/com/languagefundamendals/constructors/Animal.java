package com.languagefundamendals.constructors;

public class Animal {
	String color = "White";

	void sound() {
		System.out.println("Animal Makes Sounds");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.display();
	}

}

class Dog extends Animal {
	String color = "Red";

	void display() {
		System.out.println("Child Class: " + color);
		System.out.println("Parent Class:" + super.color);
		super.sound();

	}

}
