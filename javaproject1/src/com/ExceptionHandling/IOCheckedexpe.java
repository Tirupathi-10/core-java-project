package com.ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOCheckedexpe {

	public static void main(String[] args) throws Exception {
		System.out.println("Main method started");
		File f = new File("C:\\UI\\abcd\\tiru123.txt");
		try {
			boolean status = f.createNewFile();
			if (status) {
				System.out.println("File created Successfully");
			} else {
				System.out.println("Something went Wrong");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Main method ended");
	}

}
