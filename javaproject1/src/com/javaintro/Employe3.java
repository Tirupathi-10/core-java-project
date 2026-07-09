package com.javaintro;

import com.javaintro.Employe3;

public class Employe3 {
	int employeId;
	char employeGrade;
	double salary;
	boolean employeStatus;
	byte experience;
	short workingDays;
	long phNumber;
	float bonusAmount;
	void show() {
		System.out.println("Employe Id: "+employeId);
		System.out.println("Employe Grade: "+employeGrade);
		System.out.println("Employe Salary: "+salary);
		System.out.println("Employe Status: "+employeStatus);
		System.out.println("Employe Experience: "+experience);
		System.out.println("Working Days: "+workingDays);
		System.out.println("phone Number: "+phNumber);
		System.out.println("Bonus: "+bonusAmount);
	}
	public static void main(String[] args) {
		Employe3 e1 = new Employe3();
		e1.employeId=12;
		e1.employeGrade='B';
		e1.salary=30000.034;
		e1.employeStatus=true;
		e1.experience = 3;
		e1.workingDays= 26;
		e1.phNumber=9876543210l;
		e1.bonusAmount=2500.0f;
		e1.show();
	}

}