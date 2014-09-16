package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;
import Utilities.Round;

public class Circles_54C {
	
	/* Program Name: Circles
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/16/14
	 * Platform: Java 1.6
	 * 
	 * Description: Write a program to print out the radius, area, and circumference of a circle.  The radius of the circle is to be stored in a variable called Radius.  Use a constant definition to store the value of  (3.14159).  The circumference of a circle is calculated by the formula:  Circumference = 2piR.  Format the output to three decimal places.
	 */
	
	//define variables
	static double Radius;
	static double pi = Math.PI;
	static double circumference;
	static double area;
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Calculate/get values
		System.out.println("Insert Circle Radius:");
		Radius = in.nextDouble();
		circumference = 2*pi*Radius;
		area = pi*Radius*Radius;
		
		//Round numbers
		area = Round.hundredths(area);
		Radius = Round.hundredths(Radius);
		circumference = Round.hundredths(circumference);
		
		//Output results
		System.out.println("The Radius of the circle = " + Radius);
		System.out.println("The Area of the circle = " + area);
		System.out.println("The Circumference of the circle = " + circumference);
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();		
		
	}
	
	

}
/*
What I Learned:
How to define variables and use them in calculations.

Difficulties I had:
None.

Sample Output:

Insert Circle Radius:
5
The Radius of the circle = 5.0
The Area of the circle = 78.54
The Circumference of the circle = 31.42
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
