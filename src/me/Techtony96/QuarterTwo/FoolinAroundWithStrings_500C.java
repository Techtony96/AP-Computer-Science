package me.Techtony96.QuarterTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class FoolinAroundWithStrings_500C {
	
	/* Program Name: Foolin Around With Strings
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/24/14
	 * Platform: Java 1.6
	 * 
	 * Description: String madness!
	 */
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//ask user for the word
		System.out.print("Enter the word: ");
		//store the word with a variable, and trim it
		String word = in.nextLine().trim();
		//output the length of the word
		System.out.println("The length of your word is " + word.length() + " characters.");
		//say it so many times
		for (int i = 1; i <= word.length(); i++){
			System.out.println(word);
		}
		
		//say i printed it X times
		System.out.println("So I printed it " + word.length() + " times.");
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
Java

Difficulties I had:
None

Sample Output:
Enter the word: Howdy
The length of your word is 5 characters.
Howdy
Howdy
Howdy
Howdy
Howdy
So I printed it 5 times.
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */