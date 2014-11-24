package me.Techtony96.QuarterTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Output;

public class VowelStars_510A {
	
	/* Program Name:
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 
	 * Platform: Java 1.6
	 * 
	 * Description: 
	 */
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter your full name: ");
		String name = in.nextLine();
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		for (char vowel: vowels){
			name = name.replace(vowel, '*');
		}
		
		if (name.length() % 2 == 0){
			name = name.replaceAll(" ", "  ");
		}
		
		Output.center(name);
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
How to center text

Difficulties I had:
Centering

Sample Output:
Enter your full name: Tony Pappas
                                  T*ny P*pp*s 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 

 */