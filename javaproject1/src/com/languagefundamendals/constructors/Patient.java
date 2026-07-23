package com.languagefundamendals.constructors;

import java.util.Scanner;

public class Patient {
	String patientName;
	int age;
	double roomchargeperday;
	int numberofdaysAdmitted;
	
	

	public Patient(String patientName, int age, double roomchargeperday, int numberofdaysAdmitted) {
		this.patientName = patientName;
		this.age = age;
		this.roomchargeperday = roomchargeperday;
		this.numberofdaysAdmitted = numberofdaysAdmitted;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String Name=sc.nextLine();
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		System.out.println("Enter the charge per day:");
		double charge=sc.nextDouble();
		System.out.println("number of Days Admitted:");
		int days=sc.nextInt();
		Patient p=new Patient(Name,age,charge,days);
		p.display();
	}
	void display() {
		double TotalHospitalBill=roomchargeperday*numberofdaysAdmitted;
		System.out.println("Patient Name: "+patientName);
		System.out.println("Age: "+age);
		System.out.println("Room Charge Per Day:"+roomchargeperday);
		System.out.println("Days of Admitted:"+numberofdaysAdmitted);
		System.out.println("Total Hospital Bill:"+TotalHospitalBill);
	}
}
