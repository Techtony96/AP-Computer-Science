package me.Techtony96.QuarterOne;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Circle;
import me.Techtony96.Utilities.Round;

public class DonutIsland_54H {
	
	/* Program Name: Donut Island
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/16/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the area of an island with a lake in the middle of it.
	 */
	

	public static void main(String[] args) {
		Circle island = new Circle(2.08);
		Circle lake = new Circle(0.95);
		
		System.out.println("The total area of Donut Island is: " + Round.hundredths(island.getArea() - lake.getArea()));
		
		BlockLetters.TONY_PAPPAS.outputBlockName();		
		
	}
	
	

}
/*
What I Learned: (or Already knew)
How to create objects in java! YAY!

Difficulties I had:
None

Sample Output:
The total area of Donut Island is: 10.76
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
