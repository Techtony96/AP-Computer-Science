package me.Techtony96.QuarterOne;

import me.Techtony96.Utilities.BlockLetters;

public class SumAndAverage {
	
	/*
	 * This program will find the sum and average of 4 previosuly defined numbers.
	 */

	public static void main(String[] args) {
		
		//Define all variables/calculate values
		int a = 475, b = 821, c = 369, d = 562;
		int sum = a+b+c+d;
		double average = sum/4.0;
		
		//Output results
		System.out.println("The sum of the four numbers is " + sum);
		System.out.println("");
		System.out.println("The average of the four numbers is " + average);
		

		BlockLetters.TONY_PAPPAS.outputBlockName();

	}

}
/* sample output

The sum of the four numbers is 2227

The average of the four numbers is 556.75
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 
*/
