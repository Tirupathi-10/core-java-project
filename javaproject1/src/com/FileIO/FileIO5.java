package com.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO5 {
	public static void main(String[] args) throws IOException {
		System.out.println("main method Started");

		FileReader f = new FileReader("C:\\FileIO\\file.txt");
		BufferedReader br = new BufferedReader(f);

		FileReader f1 = new FileReader("C:\\FileIO\\file2.txt");
		BufferedReader br1 = new BufferedReader(f1);

		FileWriter fw = new FileWriter("C:\\FileIO\\fileC.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		String s;
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();

		}
		while ((s = br1.readLine()) != null) {
			bw.write(s);
			bw.newLine();
		}
		br.close();
		br1.close();
		bw.close();
		System.out.println("Copied Successfully");

		System.out.println("main method ended");
	}

}
