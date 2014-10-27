package me.Techtony96.QuarterOne;

import me.Techtony96.Utilities.BlockLetters;

public class From3to9669_152A {
	
	/* Program Name: From 3 to 1969
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/30/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the sum of this series
	 */
	

	public static void main(String[] args) {
		//Define variable to keep track of the sum.
		int number = 0;
		//Define loop to count from 3 to 9669
		for (int i = 3; i<=9669; i++){
			//Check if the current number (i) is divisible by 3
			if (i % 3 == 0){
				//If it is divisible, add it to number
				number += i;
			}
		}
		//Output the result
		System.out.println("The sum of the multiples of 3 from 3 to 9669 is " + number);
		
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
Java

Difficulties I had:
None

Sample Output:
The sum of the multiples of 3 from 3 to 9669 is 15586428
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
