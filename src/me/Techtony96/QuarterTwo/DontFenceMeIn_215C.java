package me.Techtony96.QuarterTwo;

import me.Techtony96.Utilities.BlockLetters;

public class DontFenceMeIn_215C {
	
	/* Program Name: Don't Fence Me In
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/27/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the maximum area inclosed with 100 yards of fence and 3 sides.
	 */

	public static void main(String[] args) {
		//define starting variables
		int x = 1;
		int currentArea = 0;
		int maxArea = 0;
		int MaxX = 0;
		
		//define loop to check each value of X
		while (x<100){
			//calculate the area with side x
			currentArea = x*(100-2*x);
			//if current area is larger than maxArea
			if (currentArea > maxArea){
				//update MaxArea and MaxX
				maxArea = currentArea;
				MaxX = x;
			}
			//increment x
			x++;
		}
		
		//output results
		System.out.println("With 100 yards of fencing material:");
		System.out.println("A rectangle " + MaxX + " X " + (100-2*MaxX) + " yards produces the maximum area of " + maxArea + " square yards");
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
}
/*
What I Learned:
Loops and if statements

Difficulties I had:
None

Sample Output:
With 100 yards of fencing material:
A rectangle 25 X 50 yards produces the maximum area of 1250 square yards
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */