package me.Techtony96.QuarterTwo;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Output;

public class Program673A {

	/* Program Name: Triangles
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 12/17/14
	 * Platform: Java 1.6
	 * 
	 * Description: Making Triangles
	 */


	static Scanner in = new Scanner(System.in);

	//Main method
	public static void main(String[] args) {
		//create the menu
		System.out.println("Types of Triangles");
		System.out.println("1. Left");
		System.out.println("2. Right");
		System.out.println("3. Center");
		//ask for input
		System.out.print("Enter a number (1-3): ");
		int type = in.nextInt();
		System.out.print("How many rows?");
		int rows = in.nextInt();
		
		//determine which kind of triangle to make
		if (type == 1)
			left(rows);
		else if (type == 2)
			right(rows);
		else if (type == 3)
			center(rows);
		else {
			System.out.println("Invalid Number.");
			return;
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

	//left triangle
	public static void left(int rows){
		for (int i = 1; i <= rows; i++){
			for (int a = 1; a <= i; a++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	//right triangle
	public static void right(int rows){
		for (int i = 1; i <= rows; i++){
			 for (int c = 1; c < i; c++){
				 System.out.print(" ");
			 }
			 for (int a = 1; a <= rows-(i-1); a++){
				 System.out.print("*");
			 }
			 System.out.println("");
		}
	}

	//center triangle
	public static void center(int rows){
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= rows; i++){
			for (double a = 1; a <= i; a+=.5){
				sb.append("*");
			}
			Output.center(sb.toString());
			System.out.println("");
			sb.setLength(0);
		}
	}

}
/*
What I Learned:
Formatting

Difficulties I had:
None

Sample Output:
Types of Triangles
1. Left
2. Right
3. Center
Enter a number (1-3): 1
How many rows?5
*
**
***
****
*****
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */