package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;

public class NumberManipulation_76A {
	
	/* Program Name: Number Manipulation
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/22/14
	 * Platform: Java 1.6
	 * 
	 * Description: we are manipulating numbers
	 */
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number you dislike: ");
		double number = in.nextDouble();
		System.out.println(number);
		System.out.println("X9");
		number *=9;
		System.out.println("-------------");
		System.out.println(number);
		System.out.println("X 12345679");
		number *= 12345679;
		System.out.println(number + "       Surprise");
		System.out.println("X 1000");
		number *= 1000;
		System.out.println(number +  "    \"No Surprise\"?");
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();		
		
	}
	
	

}
/*
What I Learned:


Difficulties I had:


Sample Output:


 */
