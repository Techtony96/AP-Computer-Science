package me.Techtony96.QuarterThree.Week23;

import java.util.Scanner;

public class Player {
	
	private String playerName;
	private int playerThrow;
	private Scanner in = new Scanner(System.in);
	
	public Player(String name){
		playerName = name;
	}
	
	public void makeThrow(){
		System.out.print("Choose either Rock(1), Paper(2), Scissors(3), or Quit(-1): ");
		playerThrow = Integer.parseInt(in.nextLine());
	}
	
	public int getThrow(){
		return playerThrow;
	}
	
	public String getPlayerName(){
		return playerName;
	}

}
