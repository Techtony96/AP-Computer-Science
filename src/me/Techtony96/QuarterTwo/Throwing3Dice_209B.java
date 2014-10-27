package me.Techtony96.QuarterTwo;

import me.Techtony96.Utilities.BlockLetters;

public class Throwing3Dice_209B {
	
	/* Program Name: Throwing 3 Dice
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/27/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the number of possibilities of throwing 3 dice.
	 */
	

	public static void main(String[] args) {
		
		//Define variable to keep track of number of ways to get 9 and 10
		int totalNine = 0;
		int totalTen = 0;
		
		//define loops to get every possible way the dice could land.
		for (int Die1 = 1; Die1<=6; Die1++){
			for (int Die2 = 1; Die2<=6; Die2++){
				for (int Die3 = 1; Die3<=6; Die3++){
					//if the count = 9
					if (Die1+Die2+Die3 == 9){
						//Add one to totalNine
						totalNine++;
					//if the count = 10
					} else if (Die1+Die2+Die3 == 10){
						//Add one to totalTen
						totalTen++;
					}
				}
			}
		}
		
		//output results
		System.out.println("There are "+totalNine+" possible ways to get nine");
		System.out.println("There are "+totalTen+" possible ways to get ten");
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
Loops and If else if statements

Difficulties I had:
None

Sample Output:
There are 25 possible ways to get nine
There are 27 possible ways to get ten
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */