package com.Oops.Inheritance;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	String clgName;

	Student(String name, int age, String clgName) {
		super(name, age);
		this.clgName = clgName;
	}
}

public class Main {

	public static void main(String[] args) {
		Student s = new Student("Tiru", 24, "Aditya College");
		System.out.println("Student Name: " + s.name);
		System.out.println("Age :" + s.age);
		System.out.println("College Name: " + s.clgName);

	}

}
