package com.javaintro;

public class Employe {

	static String Companyname;
	static String Location;
	
	 String EmpName;
	 int Salary;
	 
	 

	public static void main(String[] args) {
		
		Employe e1 = new Employe();
		Employe e2 = new Employe();
		Employe e3 = new Employe();
		
		e1.EmpName="Tiru";
		e1.Salary = 10000;
		
		e2.EmpName="Sai";
		e2.Salary = 20000;
		
		e3.EmpName="Hari";
		e3.Salary = 30000;
		e1.Hello();
		e2.Hello();
		e3.Hello();
	}
	static {
		Companyname="HCL";
		Location= "HYD";	
	}
	void Hello() {
		System.out.println("Company Name:+ "+ Companyname);
		System.out.println("Location: "+ Location);
		System.out.println("Employee Name: "+ EmpName);
		System.out.println("Employee Salary: "+ Salary);
		System.out.println();
	}
	

}
