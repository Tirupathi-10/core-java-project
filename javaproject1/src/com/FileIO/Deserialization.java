package com.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method started");

		File f = new File("C:\\FileIO\\Tiru.ser");
		FileInputStream fi = new FileInputStream(f);
		ObjectInputStream objs = new ObjectInputStream(fi);

		Student obj = (Student) objs.readObject();
		System.out.println(obj.sId);
		System.out.println(obj.sName);
		System.out.println(obj.age);

		System.out.println("main method ended");
	}

}
