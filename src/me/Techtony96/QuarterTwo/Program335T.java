package me.Techtony96.QuarterTwo;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class Program335T {

	/* Program Name: Prime Sandwich
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 12/18/14
	 * Platform: Java 1.6
	 * 
	 * Description: Write a program that inputs an integer  greater  than 2 and then finds the largest prime that is less than or equal to N and the smallest prime that is greater than or equal to N.
	 */

	static Scanner in = new Scanner(System.in);

	//main method
	public static void main(String[] args) {
		//direct user
		System.out.print("Enter an integer greater than or equal to 2: ");
		int num = in.nextInt();
		System.out.print("N is between the prime numbers ");
		//define lower number loop
		for (int i = num; true; i--) {
			if (isPrime(i)) {
				System.out.print(i + " and ");
				break;
			}
		}
		//define upper bound loop
		for (int i = num; true; i++) {
			if (isPrime(i)) {
				System.out.print(i);
				break;
			}
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

	//check if a number is prime
	static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
/*
What I Learned:
Prime Numbers

Difficulties I had:
None

Sample Output:
Enter an integer greater than or equal to 2: 24
N is between the prime numbers 23 and 29 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               



 */