package me.Techtony96.QuarterOne;

import me.Techtony96.Utilities.BlockLetters;

public class FamilyStats {

	public static void main(String[] args) {
		/*
		 * This program will find the variance between the ages of this family.
		 */

		//math equations obtained from: www.mathworld.wolfram.com/SampleVariance.html

		// define some ages
		int momsAge = 42;
		int dadsAge = 43;
		int myAge = 22, sistersAge = 16;
		int dogsAge = 6;

		// get the mean
		double ageSum = (momsAge + dadsAge + myAge + sistersAge + dogsAge);
		double average = ageSum / 5;

		// calculate the sample variance
		double variance = 0.0;
		variance += (momsAge - average) * (momsAge - average);
		variance += (dadsAge - average) * (dadsAge - average);
		variance += (myAge - average) * (myAge - average);
		variance += (sistersAge - average) * (sistersAge - average);
		variance += (dogsAge - average) * (dogsAge - average);
		variance = variance / 4;

		// get the standard deviation
		double standardDev = Math.sqrt(variance);

		// output the results
		System.out.println("The sample age mean is: " + average);
		System.out.println("The sample age variance is: " + variance);
		System.out.println("The sample age standard deviation is: " + standardDev);

		//Output my name
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}

/*
 Sample output:

The sample age mean is: 25.8
The sample age variance is: 265.2
The sample age standard deviation is: 16.284962388657824
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 

 */

/*

1. Missing class closing bracket
2. the first System.out.println needs " " around the text
3. // is the correct way to comment something out
4. dadsAge needs to be on a new line and have int in front of it.
5. DogsAge should be dogsAge
6. Semicolon should end every line.
7. Put a * for multiplication between variables.
 */