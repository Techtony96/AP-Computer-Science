package me.Techtony96.QuarterOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class SumAndAverage_155T {

	/* Program Name: Sum And Average 2.0!
	 * Version: 2.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/6/14
	 * Platform: Java 1.6
	 * 
	 * Description: Read data from a file and find the sum, count, and average
	 */


	public static void main(String[] args) {
		//new file that we are getting data from
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/ints.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}
		//output header
		System.out.println("Scores:");
		//while the file has data...
		double sum = 0;
		double count = 0;
		double average = 0;
		while(inFile.hasNext()){
			//define working next int
			int nextInt = inFile.nextInt();
			//break if next number is 0
			if (nextInt == 0){
				break;
			}
			//output the next int
			System.out.println(nextInt);
			//calculate sum and count of numbers
			sum += nextInt;
			count++;
		}
		//output results
		System.out.println("The sum of the numbers = " + sum);
		System.out.println("The number of scores = " + count);
		System.out.println("The average of the numbers = " + (sum/count));
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}



}
/*
What I Learned:
How to read values from a file

Difficulties I had:
Getting the filepath correct because I like sorting stuff and making it neat

Sample Output:
Scores:
3
8
1
13
18
15
7
17
1
14
The sum of the numbers = 97.0
The number of scores = 10.0
The average of the numbers = 9.7
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
