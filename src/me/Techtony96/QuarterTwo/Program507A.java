package me.Techtony96.QuarterTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Output;

public class Program507A {
	
	/* Program Name: Thinking inside the box
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 12/3/14
	 * Platform: Java 1.6
	 * 
	 * Description: Think in a box
	 */
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//Ask for a string
		System.out.print("Enter a String: ");
		//store string
		String s = in.nextLine();
		//output full line of stars
		for (int i = 0; i < s.length() + 4; i++){
			System.out.print("*");
		}
		System.out.println();
		//output spacer
		System.out.print("*");
		for (int i = 0; i < s.length() + 2; i++){
			System.out.print(" ");
		}
		System.out.println("*");
		//output actual text
		System.out.println("* " + s + " *");
		//output spacer
		System.out.print("*");
		for (int i = 0; i < s.length() + 2; i++){
			System.out.print(" ");
		}
		System.out.println("*");
		//output full line of stars
		for (int i = 0; i < s.length() + 4; i++){
			System.out.print("*");
		}
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
Strings

Difficulties I had:
Formatting

Sample Output:
Enter a String: Hello, this is Tony!
************************
*                      *
* Hello, this is Tony! *
*                      *
************************ 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */