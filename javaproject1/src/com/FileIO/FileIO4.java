package com.FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO4 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		FileWriter f=new FileWriter("C:\\FileIO\\file2.txt");
		
		BufferedWriter bw=new BufferedWriter(f); 
		bw.write("Hello World");
		bw.newLine();
		bw.write("Have a nice day");
		bw.flush();
		System.out.println("main method ended");
	}

}
