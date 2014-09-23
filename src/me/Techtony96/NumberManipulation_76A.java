package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;

public class NumberManipulation_76A {
	
	/* Program Name: Number Manipulation
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/22/14
	 * Platform: Java 1.6
	 * 
	 * Description: we are manipulating numbers
	 */
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number you dislike: ");
		double number = in.nextDouble();
		System.out.println(number);
		System.out.println("X9");
		number *=9;
		System.out.println("-------------");
		System.out.println(number);
		System.out.println("X 12345679");
		number *= 12345679;
		System.out.printf("%.0f     Surprise\n", number);
		System.out.println("X 1000");
		number *= 1000;
		System.out.printf("%.0f     \"No Surprise\"?\n", number);
		//System.out.println(String.valueOf(number) +  "    \"No Surprise\"?");
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();		
		
	}
	
	

}
/*
What I Learned:
System.out.printf

Difficulties I had:
Getting java to not use scientific notation

Sample Output:
Enter a number you dislike: 
5
5.0
X9
-------------
45.0
X 12345679
555555555     Surprise
X 1000
555555555000     "No Surprise"?
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
