package com.Oops;

class Student implements Cloneable {
	int sid;
	String sname;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}

}

public class InheShallow {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("HYD");

		Student s1 = new Student(101, "Naidu", address);

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);

		Student s2 = (Student) s1.clone();
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);

		s2.sid = 102;
		s2.sname = "Sai";
		s2.address.city = "Vizag";

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);

	}

}




//package com.Oops;
//
//class Student1 {
//	int sid;
//	String sname;
//	Address1 address1;
//
//	public Student1(int sid, String sname, Address1 address1) {
//		this.sid = sid;
//		this.sname = sname;
//		this.address1 = address1;
//	}
//
//	public Student1(Student1 s2) {
//		this.sid = s2.sid;
//		this.sname = s2.sname;
//		this.address1 = new Address1(s2.address1);
//	}
//
//}
//
//class Address1 {
//	String city;
//
//	public Address1(Address1 address1) {
//		this.city = address1.city;
//	}
//
//	public Address1(String city) {
//		this.city = city;
//	}
//
//}
//
//public class DeepCopy {
//
//	public static void main(String[] args) {
//
//		Address1 address1 = new Address1("Nellore");
//
//		Student1 s1 = new Student1(1, "Sai", address1);
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.address1.city);
//
//		Student1 s2 = new Student1(s1);
//
//		System.out.println(s2.sid);
//		System.out.println(s2.sname);
//		System.out.println(s2.address1.city);
//
//		s2.address1.city = "Mumbai";
//
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.address1.city);
//
//		System.out.println(s2.sid);
//		System.out.println(s2.sname);
//		System.out.println(s2.address1.city);
//
//	}
//
//}

