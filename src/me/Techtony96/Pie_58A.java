package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;
import Utilities.Circle;
import Utilities.Round;

public class Pie_58A {

	/* Program Name: Pie ala Mode
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/19/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find things about a circle and sphere
	 */


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input raidus");
		double r = in.nextDouble();
		Circle pie = new Circle(r);

		System.out.println("A circle with a radius of " + Round.thousandths(r) + " has:");
		System.out.println("An Area of " + Round.thousandths(pie.getArea()));
		System.out.println("Circumference of " + Round.thousandths(pie.getCircumference()));
		System.out.println("");
		System.out.println("A sphere with a radius of " + Round.thousandths(r) + " has:");
		System.out.println("Volume of " + Round.thousandths((4.0/3.0)*Math.PI*Math.pow(r, 3.0)));
		System.out.println("Surface Area of " + Round.thousandths(4.0*Math.PI*Math.pow(r, 2.0)));


		BlockLetters.TONY_PAPPAS.outputBlockName();		

	}



}
/*
What I Learned:
To use doubles instead of ints

Difficulties I had:
Using 4 and 3 instead of 4.0 and 3.0

Sample Output:

Input raidus
5
A circle with a radius of 5.0 has:
An Area of 78.54
Circumference of 31.416

A sphere with a radius of 5.0 has:
Volume of 523.599
Surface Area of 314.159
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
