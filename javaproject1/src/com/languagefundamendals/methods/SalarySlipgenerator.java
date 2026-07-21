package com.languagefundamendals.methods;

import java.util.Scanner;

public class SalarySlipgenerator {
	
	void salarySlip(String empName,double basicSalary) {
		System.out.println("Employee Nam   :"+empName);
		System.out.println("basic salary   :"+basicSalary);
		double HRA=(basicSalary*20)/100;
		double DA=(basicSalary*10)/100;
		double Gross=basicSalary+HRA+DA;
		System.out.println("HRA(20%)       :"+HRA);
		System.out.println("DA(10%)        :"+DA);
		System.out.println("Gross Salary   :"+Gross);
	
	}
	public static void main(String[] args) {
		SalarySlipgenerator g=new SalarySlipgenerator();
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the emp Name:");
	    String empName=sc.nextLine();
	    System.out.println("Enter the Basic Salary:");
	    double Gross=sc.nextDouble();
	    g.salarySlip(empName, Gross);
	    

		
	   
	    
	}

}
