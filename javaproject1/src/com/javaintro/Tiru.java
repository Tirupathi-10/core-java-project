package com.javaintro;

public class Tiru {

	 void main() throws ClassNotFoundException{
         System.out.println("main method started");
         Class.forName("java.lang.System");
         Class.forName("java.lang.String");
         Class.forName("com.mysql.cj.jdbc.Driver");
         Class.forName("com.javaintro.Dani");
         System.out.println("main method ended");
	}

}
