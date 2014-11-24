package me.Techtony96.QuarterTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class EC_Program516A {
	
	/* Program Name: Alphabet 2 Numbers
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/24/14
	 * Platform: Java 1.6
	 * 
	 * Description: Convert letter phone numbers to numbers
	 */
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//prompt for user input
		System.out.print("Enter the number: ");
		//store user input
		String number = in.nextLine();
		//to lower case for easier letter to number
		number = number.toLowerCase();
		//Replace all letters to respective numbers
		number = number.replace('a', '2');
		number = number.replace('b', '2');
		number = number.replace('c', '2');
		number = number.replace('d', '3');
		number = number.replace('e', '3');
		number = number.replace('f', '3');
		number = number.replace('g', '4');
		number = number.replace('h', '4');
		number = number.replace('i', '4');
		number = number.replace('j', '5');
		number = number.replace('k', '5');
		number = number.replace('l', '5');
		number = number.replace('m', '6');
		number = number.replace('n', '6');
		number = number.replace('o', '6');
		number = number.replace('p', '7');
		number = number.replace('r', '7');
		number = number.replace('s', '7');
		number = number.replace('t', '8');
		number = number.replace('u', '8');
		number = number.replace('v', '8');
		number = number.replace('w', '9');
		number = number.replace('x', '9');
		number = number.replace('y', '9');
		number = number.replaceAll(" ", "");
		number = number.replaceAll("-", "");
		
		//new stringbuilder for formatting
		StringBuilder sb = new StringBuilder();
		//add the number to it
		sb.append(number);
		//if it has a country code
		if (number.length() == 11){
			sb.insert(1, "-");
			sb.insert(5, "-");
			sb.insert(9, "-");
		//if it does not have a country code
		} else if (number.length() == 10){
			sb.insert(3, "-");
			sb.insert(7, "-");
		}
		//output result
		System.out.println("The number to dial is: " + sb.toString());
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
String Builder

Difficulties I had:
Formatting the end result

Sample Output:
Enter the number: 816 We Teach
The number to dial is: 816-938-3224
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */