package me.Techtony96.QuarterThree.Week19;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Round;

public class Program310A2 {

	/* Program Name: Histogram Function
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 1/16/15
	 * Platform: Java 1.6
	 * 
	 * Description: Make a histogram function
	 */

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//Ask user for input
		System.out.print("Enter value to chart: ");
		//store input
		double value = in.nextDouble();
		//round input
		int valueInt = (int) Round.round(value, 1);
		//Change character?
		System.out.print("Do you wish to supply the graphing character? (Y/N)");
		//Default char
		char Char = '*';
		//if yes,
		if (in.next().toLowerCase().trim().equals("y")) {
			//ask for new character
			System.out.print("Enter the character: ");
			//update char
			Char = in.next().charAt(0);
		}
		//loop for output
		for (int i = 0; i < valueInt; i++) {
			//output char
			System.out.print(Char);
		}
		//output Actual value
		System.out.print(" " + value);

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
Using chars

Difficulties I had:
None

Sample Output:
Enter value to chart: 100.5
Do you wish to supply the graphing character? (Y/N)N
***************************************************************************************************** 100.5 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
