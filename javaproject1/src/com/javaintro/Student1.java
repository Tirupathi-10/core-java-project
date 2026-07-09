package com.javaintro;

public class Student1 {
	static String collegeName;
	static String collegeLocation;
	
	String studentName;
	int studentId;
	void news() {
		System.out.println("College Name :"+collegeName);
		System.out.println("College Location :"+collegeLocation);
		System.out.println("studentName :"+studentName);
		System.out.println("studentId :"+studentId);
		System.out.println();
	}
	public static void main(String[] args) {
		Student1 s= new Student1();
		Student1 s1= new Student1();
		
		s.studentName="Tiru";
		s1.studentName="Sai";
		s.news();
		s1.news();
	}
	static {
		collegeName = "DNR";
		collegeLocation = "bvrm";
	}

}
