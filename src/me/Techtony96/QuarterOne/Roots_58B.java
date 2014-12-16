package me.Techtony96.QuarterOne;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Round;

public class Roots_58B {

	/* Program Name: Roots
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/17/14
	 * Platform: Java 1.6
	 * 
	 * Description: Write a program that inputs three integers A, B, and C on a single line and then outputs the roots of an equation using the quadratic formula.  Your program needs to be concerned with real roots.
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input A B C");
		int a = Integer.valueOf(in.next());
		int b = Integer.valueOf(in.next());
		int c = Integer.valueOf(in.next());

		double Root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		double Root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;

		if (Double.isNaN(Root1) && !Double.isNaN(Root2)) {
			Root2 = Round.thousandths(Root2);
			System.out.println("Root1 is imaginary and Root2 is " + Root2);
		} else if (!Double.isNaN(Root1) && Double.isNaN(Root2)) {
			Root1 = Round.thousandths(Root1);
			System.out.println("Root2 is imaginary and Root1 is " + Root1);
		} else if (Double.isNaN(Root1) && Double.isNaN(Root2)) {
			System.out.println("Both roots are imaginary!");
		} else {
			Root1 = Round.thousandths(Root1);
			Root2 = Round.thousandths(Root2);
			System.out.println("The roots are " + Root1 + " and " + Root2);
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();

	}

}
/*
What I Learned:
How to work with imaginary numbers in java

Difficulties I had:
Figuring out how to check if a double was imaginary

Sample Output:

Input A B C
1 3 4
Both roots are imaginary!
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 

 */
