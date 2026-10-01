package com.FileIO;

import java.io.File;
import java.io.IOException;

public class FileIO1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method Started");
		File f = new File("C:\\UI\\Web\\tiru.txt");
		boolean status = f.createNewFile();
		if (status) {
			System.out.println("File Created Successfully");
		} else {
			System.out.println("Something is Wrong");
		}
		System.out.println("Main method Ended");
	}

}
