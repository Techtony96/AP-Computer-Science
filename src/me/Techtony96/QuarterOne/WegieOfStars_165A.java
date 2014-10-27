package me.Techtony96.QuarterOne;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class WegieOfStars_165A {
	
	/* Program Name: Wegie of Stars
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/15/14
	 * Platform: Java 1.6
	 * 
	 * Description: Output stars
	 */
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Number of Stars:");
		int stars = in.nextInt();
		for (int line = stars; line > 0; line--){
			for (int i = stars; i > 1; i--){
				System.out.print("*");
			}
			System.out.println("*");
			stars -= 1;
		}
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
System.out.print vs System.out.println

Difficulties I had:
None

Sample Output:
Enter Number of Stars:
5
*****
****
***
**
*
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
