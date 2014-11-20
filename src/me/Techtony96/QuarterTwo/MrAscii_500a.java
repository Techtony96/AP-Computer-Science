package me.Techtony96.QuarterTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class MrAscii_500a {

	/* Program Name:
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 
	 * Platform: Java 1.6
	 * 
	 * Description: 
	 */

	static DecimalFormat money = new DecimalFormat("$0.00");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {


		for (char c = ' ' ; c <= 'Z' ; ++c) 
		{ 
			System.out.print(c); 
			System.out.print(" "); 
			System.out.print((int)c); 
			System.out.print(" "); 
			System.out.print((char)(c+32)); 
			System.out.print(" "); 
			System.out.println(c+32); 
		} 


		BlockLetters.TONY_PAPPAS.outputBlockName();
	}



}
/*
What I Learned:


Difficulties I had:


Sample Output:


 */