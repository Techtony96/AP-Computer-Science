package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;
import Utilities.Circle;
import Utilities.Round;

public class RacingCars_54J {
	
	/* Program Name: Racing Cars
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/19/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the time between two cars racing around the world.
	 */
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double diameter_red = 8000;
		double diameter_blue = 8000.00284091;
		
		Circle red = new Circle(diameter_red);
		Circle blue = new Circle(diameter_blue);
		double seconds_red = (red.getCircumference()/70.0)*60.0*60.0;
		double seconds_blue = (blue.getCircumference()/70.0)*60.0*60.0;
		
		double result = seconds_blue - seconds_red;
		
		System.out.println("The Blue Car will cross the finish line " + Round.thousandths(result) + " seconds after the red car.");
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();		
		
	}
	
	

}
/*
What I Learned:
Calculating times and speeds

Difficulties I had:
None

Sample Output:

The Blue Car will cross the finish line 0.918 seconds after the red car.
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
