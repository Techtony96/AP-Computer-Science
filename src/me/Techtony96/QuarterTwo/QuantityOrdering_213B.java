package me.Techtony96.QuarterTwo;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class QuantityOrdering_213B {

	/* Program Name: Quantity Ordering
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/12/14
	 * Platform: Java 1.6
	 * 
	 * Description: Calculate the price based on the quantity ordered
	 */

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//Define variables
		double cost;
		int quantity;
		//create loop to loop program 4 times
		for (int i = 1; i <= 4; i++) {
			//prompt the user for input
			System.out.print("Enter the Quantity you want to Order: ");
			//assign input to a variable
			quantity = in.nextInt();
			//determine what the cost is inbetween
			if (isBetween(quantity, 0, 99)) {
				cost = 5.95;
			} else if (isBetween(quantity, 100, 199)) {
				cost = 5.75;
			} else if (isBetween(quantity, 200, 299)) {
				cost = 5.4;
			} else {
				cost = 5.15;
			}

			//output price and amount due
			System.out.println("Price = $" + cost);
			System.out.println("Amount due = $" + cost * quantity);
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

	//method to determine if a value x in inbetween lower and upper, inclusive
	public static boolean isBetween(int x, int lower, int upper) {
		return lower <= x && x <= upper;
	}

}
/*
What I Learned:
Java if statements

Difficulties I had:
None

Sample Output:
Enter the Quantity you want to Order: 50
Price = $5.95
Amount due = $297.5
Enter the Quantity you want to Order: 199
Price = $5.75
Amount due = $1144.25
Enter the Quantity you want to Order: 200
Price = $5.4
Amount due = $1080.0
Enter the Quantity you want to Order: 475
Price = $5.15
Amount due = $2446.25
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
