package com.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FNFchechedExp {

	public static void main(String[] args) throws Exception {
		System.out.println("Main method started");
		File f = new File("C:\\UI\\abcd\\tiru123.txt");
		FileReader fr = new FileReader(f);
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i);
			Thread.sleep(500);
			i = fr.read();
		}
		System.out.println("main method ended");
	}

}
