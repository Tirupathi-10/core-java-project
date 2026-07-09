package com.javaintro;

public class CrickerPlayer {
	 String PlayerName;
	 int Runs;
	static String teamName="India";
	
//	void Hello() {
//		System.out.println("PlayerName: "+ PlayerName);
//		System.out.println("Runs: "+ Runs);
//		System.out.println("TeamName: " + teamName);
//		System.out.println();
//	}
	
	public static void main(String[] args) {
		CrickerPlayer p1=new CrickerPlayer();
		p1.PlayerName="Virat Kohli";
		p1.Runs=10000;
//		p1.Hello();
		
		System.out.println("PlayerName: "+ p1.PlayerName);
		System.out.println("Runs: "+ p1.Runs);
		System.out.println("TeamName: " + teamName);
		System.out.println();
		
		CrickerPlayer p2=new CrickerPlayer();
		p2.PlayerName="Dhoni";
		p2.Runs=9000;
		teamName="South Africa";
//		p2.Hello();
		
		System.out.println("PlayerName: "+ p2.PlayerName);
		System.out.println("Runs: "+ p2.Runs);
		System.out.println("TeamName: " + teamName);
		System.out.println();
		
		CrickerPlayer p3=new CrickerPlayer();
		p3.PlayerName="Rohit";
		p3.Runs=8500;
//		p3.Hello();
//		
    	System.out.println("PlayerName: "+ p3.PlayerName);
		System.out.println("Runs: "+ p3.Runs);
		System.out.println("TeamName: " + teamName);
    	System.out.println();
	}

}
