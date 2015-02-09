package me.Techtony96.QuarterThree.Week23;

import me.Techtony96.Utilities.RandomUtil;

public class Game {
	
	private int compThrow, playerWins, compWins;
	private boolean Continue = true;
	
	public void makeComputerThrow(){
		compThrow = RandomUtil.randInt(1, 3);
	}
	
	public int getCompThrow(){
		if (compThrow > 3 || compThrow < 1){
			makeComputerThrow();
		}
		return compThrow;
	}
	
	public void announceWinner(Player p){
		makeComputerThrow();
		if (p.getThrow() == -1){
			continueGame(false);
			bigWinner(p);
			return;
		}
		while (p.getThrow() > 3 || p.getThrow() < 1){
			System.out.println("Invalid Input!");
			p.makeThrow();
		}
		if (continueGame()){
			System.out.println(p.getPlayerName() + " threw " + getType(p.getThrow()) + " and the computer threw " + getType(getCompThrow()) + ".");
			if (p.getThrow() == getCompThrow()){
				System.out.println("It's a tie!");
			} else if (playerWinner(p.getThrow(), getCompThrow())){
				playerWins++;
				System.out.println(p.getPlayerName() + " won!");
			} else {
				compWins++;
				System.out.println("The computer won!");
			}
		}	
	}
	
	public void bigWinner(Player p){
		if (playerWins > compWins){
			System.out.println(p.getPlayerName() + " beat the computer " + playerWins + " to " + compWins + ".");
		} else if (compWins > playerWins){
			System.out.println("The computer beat " + p.getPlayerName() + " " + compWins + " to " + playerWins + ".");
		} else {
			System.out.println(p.getPlayerName() + " and the computer tied " + playerWins + " to " + compWins + ".");
		}
	}
	
	public boolean playerWinner(int p, int comp){
		if (p == 1 && comp == 3){
			return true;
		}
		if (p == 2 && comp == 1){
			return true;
		}
		if (p == 3 && comp == 2){
			return true;
		}
		return false;
	}
	
	public String getType(int _throw){
		switch(_throw){
			case 1:
				return "Rock";
			case 2:
				return "Paper";
			case 3:
				return "Scissors";
			
		}
		return null;
	}
	
	public boolean continueGame(){
		return Continue;
	}
	
	public void continueGame(boolean t){
		Continue = t;
	}
}
