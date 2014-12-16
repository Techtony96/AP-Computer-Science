package me.Techtony96.QuarterTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Round;

public class Program512H {

	/* Program Name: Three Letter Words
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 12/10/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find 3 letter words
	 */

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		//counting variables
		double totalCount = 0, threeWordCount = 0;
		//define file
		Scanner inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog512h.dat"));
		//loop through file
		while (inFile.hasNext()) {
			//if word is 3 letters
			if (inFile.next().length() == 3) {
				threeWordCount++;
			}
			totalCount++;
		}
		//output results
		System.out.println("Total Words = " + totalCount);
		System.out.println("Three Letter Words = " + threeWordCount);
		System.out.println("Percentage of Occurrence: " + Round.hundredths(threeWordCount / totalCount) * 100.0 + "%");

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
Scanners

Difficulties I had:
None

Sample Output:
Total Words = 93.0
Three Letter Words = 20.0
Percentage of Occurrence: 22.0%
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */