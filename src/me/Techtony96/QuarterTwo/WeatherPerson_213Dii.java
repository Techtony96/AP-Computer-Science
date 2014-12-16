package me.Techtony96.QuarterTwo;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Order;
import me.Techtony96.Utilities.Round;
import me.Techtony96.Utilities.Temperature;

public class WeatherPerson_213Dii {

	/* Program Name: Weather Person
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/13/14
	 * Platform: Java 1.6
	 * 
	 * Description: Convert Celsius to F
	 */

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter Celsius Temperature: ");
		double C = in.nextDouble();
		double F = Temperature.convertCToF(C);
		System.out.println("Fahrenheit Temperature = " + Round.tenths(F));
		if (F >= 85) {
			System.out.println("Swimming Today!");
		} else if (Order.isBetween(F, 70, 84.999)) {
			System.out.println("Tennis Today!");
		} else if (Order.isBetween(F, 46, 69.999)) {
			System.out.println("Golf Today!");
		} else if (Order.isBetween(F, 10, 39.999)) {
			System.out.println("Skiing Today!");
		} else {
			System.out.println("Chess Today!");
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
More Java

Difficulties I had:
None

Sample Output:
Enter Celsius Temperature: 32
Fahrenheit Temperature = 89.6
Swimming Today!
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */