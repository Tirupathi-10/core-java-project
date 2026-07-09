package com.javaintro;

public class Student {
	int sid;
	String sname;
	String add;
	int age;
//	static int collegeid = 121;
//	static String collegeName = "SSS";
	

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Student Information");
		
		Student s1 = new Student();
		
		s1.sid=101;
		s1.sname="Tiru";
		s1.add="Vizag";
		s1.age=24;
		
		System.out.println("Student Id: "+ s1.sid);
		System.out.println("Student sname: "+ s1.sname);
		System.out.println("Student Address: "+ s1.add);
		System.out.println("Student Age: "+ s1.age);
		System.out.println();
		
		Student s2 = new Student();
		
		
		s2.sid=102;
		s2.sname="ravi";
		s2.add="hyd";
		s2.age=25;
		
		
		System.out.println("Student Id: "+ s2.sid);
		System.out.println("Student sname: "+ s2.sname);
		System.out.println("Student Address: "+ s2.add);
		System.out.println("Student Age: "+ s2.age);
		System.out.println();
	}

}
