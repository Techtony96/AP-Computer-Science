package me.Techtony96.QuarterTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class CountingNumbers_209A {

	/* Program Name: Counting Numbers
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/13/14
	 * Platform: Java 1.6
	 * 
	 * Description: Count the numbers in a file
	 */

	static Scanner in = new Scanner(System.in);

	//define variables to count numbers in the data file
	static int less500 = 0;
	static int more500 = 0;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//get File that we are working with
		Scanner inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/p209a.dat"));
		//while the file has another valule
		while(inFile.hasNext()){
			//define working next int
			int nextInt = inFile.nextInt();
			//determine if number is less than or more than 500
			if (nextInt < 500 ){
				less500++;
			} else {
				more500++;
			}
		}

		//Output results
		System.out.println("The number of numbers less than 500 is " + less500);
		System.out.println("The number of numbers greater than or equal to 500 is " + more500);
		System.out.println("The total number of numbers is " + (less500+more500));



		BlockLetters.TONY_PAPPAS.outputBlockName();
	}



}
/*
What I Learned:


Difficulties I had:


Sample Output:


 */