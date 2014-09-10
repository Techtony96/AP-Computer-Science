package me.Techtony96;

import java.util.Scanner;

public class Change {
	/*
	 * This program will ask for the total of the bill and the amount of cash
	 * given and will calculate the change and the number of bills and coins
	 * required to get the change.
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//Get input from user
		System.out.println("Insert total:");
		double total = in.nextDouble();
		System.out.println("Insert Cash:");
		double cash = in.nextDouble();

		//calculate change
		double money = cash - total;
		
		//define variables
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;

		int change = 0;

		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		//calculate number of bills/coins
		twenties = (int) (money / 20);
		money = money % 20;
		tens = (int) (money / 10);
		money = money % 10;
		fives = (int) (money / 5);
		money = money % 5;
		ones = (int) money;
		money = money % 1;

		change = (int) (money * 100);

		quarters = change / 25;
		change = change % 25;
		dimes = change / 10;
		change = change % 10;
		nickels = change / 5;
		change = change % 5;
		pennies = change;

		//output results
		System.out.println("$20's: " + twenties);
		System.out.println("$10's: " + tens);
		System.out.println("$5's: " + fives);
		System.out.println("$1's: " + ones);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);

		BlockLetters.TONY_PAPPAS.outputBlockName();

	}

}

/* Sample Output:
 

Insert total:
15.76
Insert Cash:
20
$20's: 0
$10's: 0
$5's: 0
$1's: 4
Quarters: 0
Dimes: 2
Nickels: 0
Pennies: 4
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 */
