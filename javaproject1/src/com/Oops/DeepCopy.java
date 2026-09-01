package com.Oops;

class Student1 {
	int sid;
	String sname;
	Address1 address;

	public Student1(int sid, String sname, Address1 address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

	public Student1(Student1 s1) {
		this.sid = s1.sid;
		this.sname = s1.sname;
		this.address = new Address1(s1.address);
	}
}

class Address1 {
	String city;

	public Address1(Address1 address) {
		this.city = address.city;
	}

	public Address1(String city) {
		this.city = city;
	}

}

public class DeepCopy {

	public static void main(String[] args) {

		Address1 address = new Address1("VIjayawada");
		Student1 s = new Student1(10, "Hari", address);

		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.address.city);

		Student1 s1 = new Student1(s);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);

		s1.sid = 100;
		s1.sname = "John";
		s1.address.city = "Warangal";

		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.address.city);

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);

	}

}
