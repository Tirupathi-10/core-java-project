package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections01 {

	public static void main(String[] args) {
		Collection<Integer> con = new ArrayList<>();
		Collection<Integer> con1 = new ArrayList<>();

		Collection<Integer> all = new ArrayList<>();

		con.add(10);
		con.add(20);
		con.add(30);
		con.add(40);
		con.add(50);
		con.add(60);
		con.add(70);

		con1.add(70);
		con1.add(60);
		con1.add(50);
		con1.add(40);
		con1.add(30);
		con1.add(30);
		con1.add(10);
		con.remove(20);
		
		
		all.addAll(con);
		all.addAll(con1);
		
		System.out.println(all);
		
		
		
		
		System.out.println(all.contains(20));
		System.out.println(con1);

		System.out.println(con);

	}

}
