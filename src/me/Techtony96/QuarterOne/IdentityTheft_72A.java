package me.Techtony96.QuarterOne;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class IdentityTheft_72A {
	
	/* Program Name: Identity Theft
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/23/14
	 * Platform: Java 1.6
	 * 
	 * Description: Identity Theft
	 */
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your 8 digit number:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int number = num1 + num2 + num3 + num4;
		int remainder = number % 26;
		char[] c = Character.toChars(remainder);
		String s = new StringBuilder().append("").append(c[0]).toString();
		System.out.println("The correct number and code is " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + s);
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();		
		
	}
	
	

}
/*
What I Learned:
Chars

Difficulties I had:
None

Sample Output:
Enter your 8 digit number:
26 26 26 25
The correct number and code is 26 26 26 25 
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
