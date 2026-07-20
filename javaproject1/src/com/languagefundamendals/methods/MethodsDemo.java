package com.languagefundamendals.methods;

import java.util.Scanner;

public class MethodsDemo {
	Scanner sc=new Scanner(System.in);
	String empName() {
		System.out.println("Enter the Employee Name:");
		String Name=sc.nextLine();
		return Name;
	}
	int empId() {
		System.out.println("Enter the empId:");
		int Id=sc.nextInt();
		return Id;
	}
	double salary() {
		System.out.println("Enter the salary:");
		double sal=sc.nextDouble();
		return sal;
	}
	double bonus() {
		System.out.println("Enter the Bonus: ");
		double bonus=sc.nextDouble();
		return bonus;
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		MethodsDemo md=new MethodsDemo();
		String empName=md.empName();
		int Id=md.empId();
		double salary=md.salary();
		double bonus=md.bonus();
		
		
		System.out.println("Name of the Employee: "+empName);
		System.out.println("Employee Id: "+Id);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+(salary+bonus));
	}

}
