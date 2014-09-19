package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;
import Utilities.Round;

public class PouringDriveways_52G {
	
	/* Program Name: Pouring Driveways
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/19/14
	 * Platform: Java 1.6
	 * 
	 * Description: Finding the cost of a driveway
	 */
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Length in Feet:");
		double length = in.nextDouble();
		System.out.println("Enter Width in Feet:");
		double width = in.nextDouble();
		length = length/3.0;
		width = width/3.0;
		double cost = Round.hundredths((length*width*(0.25/3)) * 70.0);
		System.out.println("Total Cost: $" + cost);
		
		BlockLetters.TONY_PAPPAS.outputBlockName();		
		
	}
	
	

}
/*
What I Learned:
USE .0

Difficulties I had:
Converting between inches, feet, and yards

Sample Output:
Enter Length in Feet:
42
Enter Width in Feet:
26
Total Cost: $707.78
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
