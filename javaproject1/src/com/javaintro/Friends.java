package com.javaintro;

public class Friends {
	int sid = 111;
	String sname = "ravi";
	
	static int collegeid = 121;
	static String collegeName = "SSS";
	

	public static void main(String[] args) {
		Friends tiru = new Friends();
		
		
		collegeid = 234;
		collegeName = "VID";		
		System.out.println("main method started");
		System.out.println("Student Information from the College");
//		System.out.println("College Id:" + collegeid);
//		System.out.println("College Name:" + collegeName);
		System.out.println( "College Name:" +Friends.collegeid);
		System.out.println("College Name:" +Friends.collegeName);
		System.out.println();
//		System.out.println(tiru.collegeid);
//		System.out.println(tiru.collegeName);
		
//		Student tiru = new Student();
//		tiru.sid = 345;
//		tiru.sname = "krishna";
//		
		System.out.println("Student Id:" + tiru.sid);
		System.out.println("Student Name:" +tiru.sname);
		
		System.out.println("main method ended");

	}

}
