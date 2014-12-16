package me.Techtony96.QuarterTwo;

import java.text.DecimalFormat;

import me.Techtony96.Utilities.BlockLetters;

public class FasterThanASpeedingBullet_215B {

	/* Program Name: Faster Than A Speeding Bullet
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/27/14
	 * Platform: Java 1.6
	 * 
	 * Description: Calculate the max height of a bullet shot upwards
	 */

	static DecimalFormat dec = new DecimalFormat("0");

	public static void main(String[] args) {
		//define a variable for time in seconds
		int t = 1;
		//define a variable for height at time t and a variable for the maximum height reached
		double height = 0;
		double maxHeight = 0;
		//define a loop to calculate each value of t
		while (t < 60) {
			//calculate current height
			height = 960 * t - 16 * Math.pow(t, 2);
			//compare current height to max height
			if (height > maxHeight)
				//set max height to current height
				maxHeight = height;
			//increase time by 1
			t++;
		}

		//outut results
		System.out.println("The maximum height reached by the bullet is " + dec.format(maxHeight) + " feet.");

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
if statements

Difficulties I had:
None

Sample Output:
The maximum height reached by the bullet is 14400 feet.
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */