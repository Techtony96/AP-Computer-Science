package me.Techtony96.QuarterTwo;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Order;
import me.Techtony96.Utilities.Round;

public class WeatherForecasting_213D {

	/* Program Name: Weather Forecasting
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/13/14
	 * Platform: Java 1.6
	 * 
	 * Description: get the temperature based on the crickets
	 */

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//Prompt user for input
		p("Enter Cricket Chirps/Min: ");
		//assign input to variable
		double chirps = in.nextDouble();
		//calculate farenheit and celcius
		double F = (chirps + 40) / 4.0;
		double C = ((F - 32) * 5.0) / 9.0;
		//define variable for the condition of the weather
		String condition;
		//determine what the condition is
		if (F < 45) {
			condition = "Bur-rrr";
		} else if (Order.isBetween(F, 45, 64)) {
			condition = "Take a jacket";
		} else if (Order.isBetween(F, 65, 80)) {
			condition = "Ah-hh";
		} else if (Order.isBetween(F, 81, 108)) {
			condition = "Whew";
		} else {
			condition = "Dead Cricket";
		}

		//output result
		l("Fahrenheit = " + Round.tenths(F));
		l("Centigrade = " + Round.tenths(C));
		l("Condition = " + condition);

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

	//methods to make outputting stuff easier
	private static void l(String s) {
		System.out.println(s);
	}

	private static void p(String s) {
		System.out.print(s);
	}

}
/*
What I Learned:
First time I have used special methods

Difficulties I had:
None

Sample Output:
Enter Cricket Chirps/Min: 20
Fahrenheit = 15.0
Centigrade = -9.3
Condition = Bur-rrr
 
 Enter Cricket Chirps/Min: 180
Fahrenheit = 55.0
Centigrade = 12.8
Condition = Take a jacket
 
 Enter Cricket Chirps/Min: 240
Fahrenheit = 70.0
Centigrade = 21.1
Condition = Ah-hh

Enter Cricket Chirps/Min: 480
Fahrenheit = 130.0
Centigrade = 54.4
Condition = Dead Cricket
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
