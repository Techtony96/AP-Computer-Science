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

	//Define scanner for user input
	static Scanner in = new Scanner(System.in);
	//Define a new Highscore manager :P
	static HighscoreManager hm = new HighscoreManager();

	public static void main(String[] args) {
		//generate random number from 1 to 100
		int guess = RandomUtil.randInt(1, 100);
		int input = 0;
		int tries = 0;
		//Output instructions
		System.out.println("Guess the number I am thinking of! (1-100)");
		input = in.nextInt();
		//Repeat until user guesses it correctly
		while (true){
			//increment tries by 1
			tries++;
			//if user guessed it correctly
			if (input == guess){
				//say the player won!
				System.out.println("YOU GUESSED IT! It took you " + tries + " tries!");
				break;
				//too high
			} else if (input > guess){
				System.out.println("Too high, try again.");
				//too low
			} else {
				System.out.println("Too low, try again.");
			}
			//get the users next guess
			input = in.nextInt();

		}
		//Ask the user for their name for the high schore table
		System.out.println("Enter your name for the High Score Table!");
		//add score to table
		hm.addScore(in.next(),tries);
		//output the current high score table
		System.out.print(hm.getHighscoreString());

		//ask the user if they want to play again
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
File writing, looping, if statements, random, input, JAVA

Difficulties I had:
Having too much fun?

Sample Output:
Guess the number I am thinking of! (1-100)
50
Too low, try again.
60
Too high, try again.
55
Too high, try again.
53
Too low, try again.
54
YOU GUESSED IT! It took you 5 tries!
Enter your name for the High Score Table!
Tony
1.	TONY		4
2.	Tony2		5
3.	Tony3		5
4.	Tony		5
5.	Tony		6
6.	Tony		6
Do you want to play again? (Type Yes or No)
yes
Guess the number I am thinking of! (1-100)
54
Too high, try again.
50
Too high, try again.
40
Too high, try again.
30
Too high, try again.
20
Too high, try again.
10
Too high, try again.
5
Too low, try again.
7
Too low, try again.
8
YOU GUESSED IT! It took you 9 tries!
Enter your name for the High Score Table!
Tony2
1.	TONY		4
2.	Tony2		5
3.	Tony3		5
4.	Tony		5
5.	Tony		6
6.	Tony		6
7.	Tony2		9
Do you want to play again? (Type Yes or No)
no
Thanks for playing!
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */