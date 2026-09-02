package com.Oops;

public class EncapEmp1 {

	public static void main(String[] args) {
		EncapEmp e = new EncapEmp();

		e.setEid(18);
		e.setEname("Virat Kohli");
		e.setPassword("Virat@123");
		e.setSal(200000.0);

		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getPassword());
		System.out.println(e.getSal());
	}

}
