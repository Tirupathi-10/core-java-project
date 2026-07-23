package com.languagefundamendals.constructors;

import java.util.Scanner;

public class CricketPlayer {
	String PlayerName;
	int MatchesPlayed;
	int TotalRuns;
	
	CricketPlayer(String pName,int Mplayed,int Truns){
		PlayerName=pName;
		MatchesPlayed=Mplayed;
		TotalRuns=Truns;
	}
	void display() {
		double averageruns=TotalRuns/MatchesPlayed;
		System.out.println("Player Name: "+PlayerName);
		System.out.println("Matches:"+MatchesPlayed);
		System.out.println("total runs:"+TotalRuns);
		System.out.println("Average:"+averageruns);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player Name:");
		String pName=sc.nextLine();
		System.out.println("Enter Matches Played:");
		int Mplayed=sc.nextInt();
		System.out.println("Enter TOtal Runs:");
		int Truns=sc.nextInt();
		
		CricketPlayer cp=new CricketPlayer(pName,Mplayed,Truns);
		cp.display();
	}

}
