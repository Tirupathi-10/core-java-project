package com.FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileIO2 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		FileWriter fw = new FileWriter("C:\\UI\\Web\\tiru.txt");
		fw.write("Hii Good Morning");
		fw.write("Have a Nice Day");
		System.out.println("main method ended");

		fw.close();
	}

}
