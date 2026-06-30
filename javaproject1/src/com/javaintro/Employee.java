package com.javaintro;

public class Employee {
	
	int id;
	String name;
	int age;
	
	static int orgId = 1234;
	static String orgName="VSS";
	
	void display(){
		System.out.println("Employee Id: "+ id);
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee Age: "+ age);
		System.out.println("Org Id: "+ orgId);
		System.out.println("Org Name: "+ orgName);
		System.out.println();
		
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.id=101;
		e1.name="Hari";
		e1.age=25;
		e1.display();
		

		Employee e2=new Employee();
		e2.id=102;
		e2.name="Vasu";
		e2.age=29;
		e2.display();
		
		orgId=98765;
		orgName="VID";
		Employee e3=new Employee();
		e3.id=103;
		e3.name="Sai";
		e3.age=27;
		e3.display();
		

		Employee e4=new Employee();
		e4.id=104;
		e4.name="Tiru";
		e4.age=24;
		e4.display();
		
		
	}

}
