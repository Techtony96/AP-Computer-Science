package me.Techtony96.QuarterOne;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class SmallFactorials_162A {
	
	/* Program Name:
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 
	 * Platform: Java 1.6
	 * 
	 * Description: 
	 */
	

	public static void main(String[] args) {
		//Define scanner for user input
		Scanner in = new Scanner(System.in);
		//define boolean to control program flow
		boolean programContinue = true;
		//while statement to repeat program
		while(programContinue){
			//ask for user input
			System.out.println("Enter a Number [zero to quit]");
			//define a variable for user input
			int userInput = in.nextInt();
			//if statement to end program
			if (userInput == 0){
				//tell program not to loop again
				programContinue = false;
				//Stop the current while statement
				break;
			} else {
				//define variable to store result
				double factorialResult = 1;
				//loop to go from 1 to userInput
				for (int i = 1; i <= userInput; i++){
					factorialResult *= i;
				}
				//ouput result
				System.out.printf("The value of " + userInput + "! is " + "%.0f", factorialResult);
				System.out.println("");
			}
		}
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
printf

Difficulties I had:
Notciing that 14! went over the max value an int can be and then formatting the double correctly

Sample Output:
Enter a Number [zero to quit]
6
The value of 6! is 720
Enter a Number [zero to quit]
9
The value of 9! is 362880
Enter a Number [zero to quit]
12
The value of 12! is 479001600
Enter a Number [zero to quit]
14
The value of 14! is 87178291200
Enter a Number [zero to quit]
0
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
