package me.Techtony96.QuarterTwo;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class SolvingLinearEquations_213G {
	
	/* Program Name: Solving Linear Equations
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/3/14
	 * Platform: Java 1.6
	 * 
	 * Description:  Solve linear equations in the form Ax+b=0
	 */
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//Prompt user to input 999 to end program
		System.out.println("Enter 999 to end program, anything else to continue.");
		//Create loop to loop program
		while (in.nextDouble() != 999){
			//prompt user for A
			System.out.println("Enter A:");
			double A = in.nextDouble();
			
			//prompt user for B
			System.out.println("Enter B:");
			double B = in.nextDouble();
			
			//If A is 0, there are infinite solutions
			if (A == 0){
				System.out.println(A + "x + " + B + " = 0 --> There are Infinite Solutions");
			} else {
				//otherwise, solve and output an answer
				System.out.println(A + "x + " + B + " = 0 --> X = " + -B/A);
			}
			
			//Prompt user to input 999 to end program
			System.out.println("Enter 999 to end program, anything else to continue.");
		}
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
		
	}
	
	

}
/*
What I Learned:
Loops and if statements

Difficulties I had:
None

Sample Output:
Enter 999 to end program, anything else to continue.
0
Enter A:
5
Enter B:
-4
5.0x + -4.0 = 0 --> X = 0.8
Enter 999 to end program, anything else to continue.
999
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */