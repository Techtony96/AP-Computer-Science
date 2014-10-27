package me.Techtony96.QuarterTwo;

import me.Techtony96.Utilities.BlockLetters;

public class CoinJar_275G {
	
	/* Program Name: Coin Jar
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/27/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the possible ways $1.05 can add up
	 */
	

	public static void main(String[] args) {
		//Define loops to loop through each possible way the coins can add up
		for (int quarters = 0; quarters <= 5; quarters++){
			for (int dimes = 0; dimes <= 12; dimes ++){
				for (int nickles = 0; nickles <= 25; nickles ++){
					for (int pennies = 0; pennies <= 106; pennies++){
						//check if the money adds up to $1.05 and if the count of coins = 14
						if (quarters*25+dimes*10+nickles*5+pennies == 105 && quarters+dimes+nickles+pennies == 14){
							//if true, output result
							System.out.println(quarters + " quarters "+dimes+" dimes "+nickles+" nickles "+pennies+" pennies");
						}
					}
				}
			}
		}
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
Looping and if statements

Difficulties I had:
None

Sample Output:
0 quarters 7 dimes 7 nickles 0 pennies
1 quarters 3 dimes 10 nickles 0 pennies
1 quarters 7 dimes 1 nickles 5 pennies
2 quarters 3 dimes 4 nickles 5 pennies
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */