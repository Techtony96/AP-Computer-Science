package me.Techtony96.QuarterTwo;

import highscores.HighscoreManager;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.RandomUtil;

public class HigherLower_210C {

	/* Program Name: Higher Lower
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/6/14
	 * Platform: Java 1.6
	 * 
	 * Description: Lets Play a game!
	 */

	static Scanner in = new Scanner(System.in);
	static HighscoreManager hm = new HighscoreManager();

	public static void main(String[] args) {
		int guess = RandomUtil.randInt(1, 100);
		int input = 0;
		int tries = 0;
		System.out.println("Guess the number I am thinking of! (1-100)");
		input = in.nextInt();
		while (true){
			tries++;
			if (input == guess){
				System.out.println("YOU GUESSED IT! It took you " + tries + " tries!");
				break;
			} else if (input > guess){
				System.out.println("Too high, try again.");
			} else {
				System.out.println("Too low, try again.");
			}
			input = in.nextInt();

		}
		System.out.println("Enter your name for the High Score Table!");
		hm.addScore(in.next(),tries);
		System.out.print(hm.getHighscoreString());

		System.out.println("Do you want to play again? (Type Yes or No)");
		if (in.next().toLowerCase().trim().equals("yes")){
			main(args);
		} else {
			System.out.println("Thanks for playing!");
			BlockLetters.TONY_PAPPAS.outputBlockName();
		}
		
	}









}
/*
What I Learned:


Difficulties I had:


Sample Output:


 */