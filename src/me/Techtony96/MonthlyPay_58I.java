package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;
import Utilities.Round;

public class MonthlyPay_58I {
	
	/* Program Name: Monthly Pay
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/22/14
	 * Platform: Java 1.6
	 * 
	 * Description: Figure out information about a loan
	 */
	
	static double borrow = 0.0;
	static double rate = 0.0;
	static int months = 0;
	
	static double monthlypayment = 0.0;

	public static void main(String[] args) {
		//Initialize Scanner
		Scanner in = new Scanner(System.in);
		
		//Gather information
		System.out.println("The amount I wish to borrow is?");
		borrow = in.nextDouble();
		System.out.println("The load rate I can get is?");
		rate = in.nextDouble();
		System.out.println("The number of months it will take me to pay off the load is?");
		months = in.nextInt();
		
		System.out.println("");
		
		//Calculations and outputting results
		monthlypayment = getMonthlyPayment(borrow, rate, months);
		System.out.println("My monthly payments will be $" + Round.hundredths(monthlypayment));
		System.out.println("Total Interest Paid is $" + Round.hundredths((monthlypayment*months)-borrow));
		System.out.println("Total Amont paid is $" + Round.hundredths(monthlypayment*months));
		
		BlockLetters.TONY_PAPPAS.outputBlockName();		
		
	}
	
	//Get the monthly payment
	public static double getMonthlyPayment(double P, double r, double m){
		return (P * (r/1200.0) * ((Math.pow(1+(r/1200.0), m))/((Math.pow(1+(r/1200.0), m)-1))));
	}
	

}
/*
What I Learned:
more doubles.

Difficulties I had:
Reading direction, put the percent into decimal form.

Sample Output:

The amount I wish to borrow is?
7500
The load rate I can get is?
14.5
The number of months it will take me to pay off the load is?
36

My monthly payments will be $258.16
Total Interest Paid is $1793.66
Total Amont paid is $9293.66
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
