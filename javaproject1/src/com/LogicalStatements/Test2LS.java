package com.LogicalStatements;

import java.util.Scanner;

public class Test2LS {
	String marksinfo(double marks) {
		String grade = "";
		if (marks > 100 || marks < 0) {
			grade="Invalid";
		} else if (marks >= 90) {
			grade = "Grade-A";
		} else if (marks >= 75) {
			grade = "Grade-B";
		} else if (marks >= 60) {
			grade = "Grade-C";
		} else if (marks >= 45) {
			grade = "Grade-D";
		} else if (marks >= 35) {
			grade = "Just Passed";
		} else {
			System.out.println("Failed");
		}
		return grade;
	}

	public static void main(String[] args) {
		Test2LS t = new Test2LS();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		double marks = sc.nextDouble();
		String grade = t.marksinfo(marks);
		System.out.println("result:"+grade);
	}

}
