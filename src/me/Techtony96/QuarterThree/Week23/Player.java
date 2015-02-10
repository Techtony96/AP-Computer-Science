package me.Techtony96.QuarterThree.Week23;

import java.util.Scanner;

public class Player {
	
	//define private variables
	private String playerName;
	private int playerThrow;
	private Scanner in = new Scanner(System.in);
	
	//public constructor
	public Player(String name){
		playerName = name;
	}
	
	//ask a player to make a play
	public void makeThrow(){
		System.out.print("Choose either Rock(1), Paper(2), Scissors(3), or Quit(-1): ");
		playerThrow = Integer.parseInt(in.nextLine());
	}
	
	//return their current throw
	public int getThrow(){
		return playerThrow;
	}
	
	//return the players name
	public String getPlayerName(){
		return playerName;
	}

}
