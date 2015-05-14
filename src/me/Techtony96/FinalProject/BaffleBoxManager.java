package me.Techtony96.FinalProject;

import java.util.Scanner;

public class BaffleBoxManager {
	
	static Scanner in = new Scanner(System.in); 
	
	static BaffleBoxGame curGame;
	
	
	public static void main(String[] args){
		//prompt the user for a difficulty
		System.out.println("Please choose a difficulty (1-5)");
		//store user input to a variable
		int difficulty = in.nextInt();
		//verify user input
		if (difficulty < 1 || difficulty > 5){
			//prompt user that value input was incorect
			System.out.println("Incorrect difficulty.");
			//restart program
			main(null);
			return;
		}
		//Give the user instruction on how to guess
		System.out.println("===   Directions   ===");
		System.out.println("Right click for a \\ Baffle");
		System.out.println("Left click for a / Baffle");
		//start the game
		curGame = new BaffleBoxGame(difficulty);
		
		
	}
	
	//from other classes, get the current game
	public static BaffleBoxGame getGame(){
		return curGame;
	}
	
	
}

/* Sample Output:

Please choose a difficulty (1-5)
5
===   Directions   ===
Right click for a \ Baffle
Left click for a / Baffle
Entered at 9 and exited at 36
Entered at 8 and exited at 1
Entered at 1 and exited at 8
Entered at 37 and exited at 12
Entered at 35 and exited at 14
Entered at 34 and exited at 15
Entered at 33 and exited at 16
Entered at 32 and exited at 2
Entered at 31 and exited at 27
===================
=     YOU WIN!    =
= Final Score: -4 =
===================


### History Example ###
Please choose a difficulty (1-5)
2
===   Directions   ===
Right click for a \ Baffle
Left click for a / Baffle
Entered at 7 and exited at 22
Entered at 5 and exited at 10
========   HISTORY   ========
Entered at 7 and exited at 22
Entered at 5 and exited at 10
======== END HISTORY ========

*/

