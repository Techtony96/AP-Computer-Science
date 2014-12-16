package me.Techtony96.QuarterTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class SequenceWithIntervalChange_202A {

	/* Program Name: Sequence With Interval Change
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/27/14
	 * Platform: Java 1.6
	 * 
	 * Description: Write a program that will reproduce the following sequence of numbers.
	 */

	static DecimalFormat money = new DecimalFormat("$0.00");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//Define loop to go through each number
		for (int i = 2; i <= 69; i++) {
			//if i is less than 20 and divisible by 2
			if (i <= 20 && i % 2 == 0) {
				//output number
				System.out.println(i);
				//if i is between 21 and 41, and has been incremented by 3
			} else if (i > 20 && i <= 41 && i % 3 == 2) {
				//output number
				System.out.println(i);
				//if i is between 32 and 69 and has been incremented by 4
			} else if (i > 41 && i <= 69 && i % 4 == 1) {
				//output number
				System.out.println(i);
			}
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
Loops and if statements

Difficulties I had:
Figuring out how to get the list of numbers

Sample Output:
2
4
6
8
10
12
14
16
18
20
23
26
29
32
35
38
41
45
49
53
57
61
65
69
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */