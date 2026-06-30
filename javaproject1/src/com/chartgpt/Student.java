package com.chartgpt;

public class Student {
	static String collegeName;
	static String collegeLocation;
	String studentName;
	int studentId;
	int marks;
	static {
		collegeName="JNTU";
		collegeLocation="HYD";
	}
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		s.studentName = "Vasu";
		s.studentId =13;
		s.marks = 90;
		s1.studentName = "Tiru";
		s1.studentId =12;
		s1.marks = 70;
		s2.studentName = "Sai";
		s2.studentId =14;
		s2.marks = 45;
		s.display();
		s.isPass();
		s.grade();
		s1.display();
		s1.isPass();
		s1.grade();
		s2.display();
		s2.isPass();
		s2.grade();
	}
	void display() {
		System.out.println("Brand Name: "+collegeName);
		System.out.println("College Location: "+collegeLocation);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Id: "+studentId);
		System.out.println("Marks: "+marks);
		System.out.println();
	}
	void isPass(){
		if (marks >= 35) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
	}
	void grade() {
		 if (marks >= 90) {
	            System.out.println("Grade : A");
	        } else if (marks >= 75) {
	            System.out.println("Grade : B");
	        } else if (marks >= 60) {
	            System.out.println("Grade : C");
	        } else if (marks >= 35) {
	            System.out.println("Grade : D");
	        } else {
	            System.out.println("Grade : Fail");
	        }

	        System.out.println();
	}
}
