package com.chartgpt;

public class cricketPlayer {
	 static String teamName = "India";
	    String playerName;
	    int runs;
	    void show() {
	    	 System.out.println("Team Name :"+teamName);
		        System.out.println("Player Name :"+playerName);
		        System.out.println("Runs :"+runs);
	    }
	public static void main(String[] args) {
		 cricketPlayer p1 =new cricketPlayer();
	        p1.playerName= "Virat";
	        p1.runs = 10000;
	        p1.show();
	        
//	        System.out.println("Team Name :"+teamName);
//	        System.out.println("Player Name :"+p1.playerName);
//	        System.out.println("Runs :"+p1.runs);
	}

}
