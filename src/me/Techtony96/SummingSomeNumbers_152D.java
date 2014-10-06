package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;

public class SummingSomeNumbers_152D {
	
	/* Program Name: Summing Some Numbers
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/6/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the sum and average of some numbers
	 */
	

	public static void main(String[] args) {
		//Define scanner to get user input
		Scanner in = new Scanner(System.in);
		//Ask for starting information
		System.out.println("Enter Starting Number:");
		int startingNumber = in.nextInt();
		System.out.println("Enter Ending Number:");
		int endingNumber = in.nextInt();
		//define variable to store calculated information
		int sum = 0;
		double average;
		//define loop to loop from startingNumber to endingNumber
		for (int i = startingNumber; i <= endingNumber; i++){
			sum += i;
			System.out.println(i);
		}
		//Calculate the difference between the numbers
		double difference = endingNumber-startingNumber + 1;
		//Calculate the average
		average = sum/difference;
		//Output the results
		System.out.println("The sum from " + startingNumber + " to " + endingNumber + " is " + sum);
		System.out.println("The Average from " + startingNumber + " to " + endingNumber + " is " + average);
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
Calculations during loops

Difficulties I had:
None

Sample Output:
Enter Starting Number:
5
Enter Ending Number:
8
5
6
7
8
The sum from 5 to 8 is 26
The Average from 5 to 8 is 6.5
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
