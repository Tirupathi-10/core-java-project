package com.chartgpt;

public class Employee {
static String companyName;
static String companyLocation;

String employeeName;
int Salary;
	void display() {
		System.out.println(companyName);
		System.out.println(companyLocation);
		System.out.println(employeeName);
		System.out.println(Salary);
		System.out.println();
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e.employeeName="Tiru";
		e.Salary = 10000;
		e1.employeeName="Sai";
		e1.Salary=20000;
		e2.employeeName="Hari";
		e2.Salary=30000;
		e.display();
		e1.display();
		e2.display();
	}

	static {
		 companyName = "TCS";
		 companyLocation = "Vizag";
	}
}
