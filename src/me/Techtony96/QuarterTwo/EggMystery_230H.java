package me.Techtony96.QuarterTwo;

import me.Techtony96.Utilities.BlockLetters;

public class EggMystery_230H {
	
	/* Program Name: Egg Mystery
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/27/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the number of eggs in a basket
	 */

	public static void main(String[] args) {
		//Define loop for number of eggs in the basket
		for (int eggs = 0; eggs > -1; eggs++) {
			//Check if the number of eggs in the basket has the correct remainder when removing eggs
			if (eggs % 2 == 1 && eggs % 3 == 2 && eggs % 4 == 3	&& eggs % 5 == 4 && eggs % 6 == 5 && eggs % 7 == 0) {
				//if so, output result and break.
				System.out.print("The basket contains " + eggs + " eggs.");
				break;
			}

		}
		BlockLetters.TONY_PAPPAS.outputBlockName();

	}
}
/*
What I Learned:
Loops and if statements

Difficulties I had:
Figuring out what the prompt was telling me

Sample Output:
The basket contains 119 eggs. 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */