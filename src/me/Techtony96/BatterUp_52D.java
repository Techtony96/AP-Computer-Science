package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;
import Utilities.Round;

public class BatterUp_52D {
	
	/* Program Name: Batter Up
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/17/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the batting average of someone
	 */
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Number of Hits:");
		Double hits = in.nextDouble();
		System.out.println("Enter Number of times at Bat:");
		Double bat = in.nextDouble();
		System.out.println("Enter Number of Walks:");
		Double walks = in.nextDouble();
		
		
		System.out.println("Batting Average: " + Round.thousandths(hits/(bat - walks)));
		BlockLetters.TONY_PAPPAS.outputBlockName();		
		
	}
	
	

}
/*
What I Learned:
Outputting numbers

Difficulties I had:
none

Sample Output:
Enter Number of Hits:
10
Enter Number of times at Bat:
20
Enter Number of Walks:
2
Batting Average: 0.556
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
