package com.Oops.Abstract;

class Student {

	void calculateGrade(int marks) {

	}
}

class EngineeringStudent extends Student {
	@Override
	void calculateGrade(int marks) {
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid Marks. Please enter marks between 0 and 100.");
		} else if (marks >= 95) {
			System.out.println("Grade :A");
		} else if (marks >= 85) {
			System.out.println("Grade :B");
		} else if (marks >= 70) {
			System.out.println("Grade :C");
		} else if (marks >= 60) {
			System.out.println("Grade :D");
		} else if (marks >= 45) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}

class MedicalStudent extends Student {
	@Override
	void calculateGrade(int marks) {
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid Marks. Please enter marks between 0 and 100.");
		} else if (marks >= 85 && marks <= 100) {
			System.out.println("Grade :A");
		} else if (marks >= 75) {
			System.out.println("Grade :B");
		} else if (marks >= 65) {
			System.out.println("Grade :C");
		} else if (marks >= 50) {
			System.out.println("Grade :D");
		} else if (marks >= 40) {
			System.out.println("Pass");
		} else if (marks < 40) {
			System.out.println("Fail");
		}
	}
}

class ManagementStudent extends Student {
	@Override
	void calculateGrade(int marks) {
		if (marks < 0 || marks > 100) {
			System.out.println("Invalid Marks. Please enter marks between 0 and 100.");
		} else if (marks >= 95) {
			System.out.println("Grade :A");
		} else if (marks >= 90) {
			System.out.println("Grade :B");
		} else if (marks >= 85) {
			System.out.println("Grade :C");
		} else if (marks >= 75) {
			System.out.println("Grade :D");
		} else if (marks >= 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
