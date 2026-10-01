package com.FileIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileIO3 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		File f = new File("C:\\FileIO\\file.txt");
		PrintWriter pw = new PrintWriter(f);
		pw.println("Hii Gud Morning");
		pw.println(123);
		pw.println('A');
		pw.println(12.33);
	

		System.out.println("main method ended");
	}

}
