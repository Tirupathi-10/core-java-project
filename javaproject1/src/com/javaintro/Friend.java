package com.javaintro;

public class Friend {
	int id;
	String name;
	
	static int clgId = 12345;
	static String clgName = "ACET";

	public static void main(String[] args) {
		
		System.out.println("<--------Friends info-------->");
		Friend f1=new Friend();
		f1.id=111;
		f1.name="Tiru";
		
		System.out.println("Friend Id: "+ f1.id);
		System.out.println("Friend Name: "+ f1.name);
		System.out.println("College Id: "+ clgId);
		System.out.println("College Name: "+ clgName);
		System.out.println();
		
		Friend f2=new Friend();
		f2.id=222;
		f2.name="Ravi";
		
		System.out.println("Friend Id: "+ f2.id);
		System.out.println("Friend Name: "+ f2.name);
		System.out.println("College Id: "+ clgId);
		System.out.println("College Name: "+ clgName);
		System.out.println();
		Friend f3=new Friend();
		f3.id=333;
		f3.name="Raju";
		
		System.out.println("Friend Id: "+ f3.id);
		System.out.println("Friend Name: "+ f3.name);
		System.out.println("College Id: "+ clgId);
		System.out.println("College Name: "+ clgName);
		System.out.println();
		
		Friend f4=new Friend();
		f4.id=444;
		f4.name="Sai";
		clgId=45678;
		clgName="DNR";
		
		System.out.println("Friend Id: "+ f4.id);
		System.out.println("Friend Name: "+ f4.name);
		System.out.println("College Id: "+ clgId);
		System.out.println("College Name: "+ clgName);
		System.out.println();
		
		Friend f5=new Friend();
		f5.id=555;
		f5.name="Vasu";
		
		System.out.println("Friend Id: "+ f5.id);
		System.out.println("Friend Name: "+ f5.name);
		System.out.println("College Id: "+ clgId);
		System.out.println("College Name: "+ clgName);
		
	}

}
