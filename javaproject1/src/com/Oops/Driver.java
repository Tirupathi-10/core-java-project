package com.Oops;

public class Driver {

	public static void main(String[] args) {
		Encap e = new Encap();

		e.setStdid(1);
		e.setSname("Raju");
		e.setMarks(101);

		System.out.println(e.getStdid());
		System.out.println(e.getsname());
		System.out.println(e.getMarks());
	}

}
