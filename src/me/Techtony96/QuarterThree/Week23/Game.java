package me.Techtony96.QuarterThree.Week23;

import me.Techtony96.Utilities.RandomUtil;

public class Game {
	
	//define private variables
	private int compThrow, playerWins, compWins;
	private boolean Continue = true;
	
	//generate a random play
	public void makeComputerThrow(){
		compThrow = RandomUtil.randInt(1, 3);
	}
	
	//get the computers throw
	public int getCompThrow(){
		//if the throw is not valid, try again
		while (compThrow > 3 || compThrow < 1){
			makeComputerThrow();
		}
		return compThrow;
	}
	
	//announce the winner of the current hand
	public void announceWinner(Player p){
		//make a new throw for the computer
		makeComputerThrow();
		//if player wants to stop the game
		if (p.getThrow() == -1){
			//set continue to false
			continueGame(false);
			bigWinner(p);
			return;
		}
		//if the input is not valid
		while (p.getThrow() > 3 || p.getThrow() < 1){
			System.out.println("Invalid Input!");
			p.makeThrow();
		}
		//if the game should still continue, announce results
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
	
	//output overall winner
	public void bigWinner(Player p){
		if (playerWins > compWins){
			System.out.println(p.getPlayerName() + " beat the computer " + playerWins + " to " + compWins + ".");
		} else if (compWins > playerWins){
			System.out.println("The computer beat " + p.getPlayerName() + " " + compWins + " to " + playerWins + ".");
		} else {
			System.out.println(p.getPlayerName() + " and the computer tied " + playerWins + " to " + compWins + ".");
		}
	}
	
	//determine if the player won
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
	
	//get the name of the throw
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
	
	//Check if the game should continue
	public boolean continueGame(){
		return Continue;
	}
	
	//set the game to continue
	public void continueGame(boolean t){
		Continue = t;
	}
}
