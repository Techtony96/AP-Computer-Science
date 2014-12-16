package me.Techtony96.QuarterOne;

import java.util.Calendar;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Round;

public class CompSciPower_93A {

	/* Program Name: Computer Science Power and Light
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/24/14
	 * Platform: Java 1.6
	 * 
	 * Description: Calculate a receipt
	 */

	static double cost = 0.0475;
	static double surcharge = 0.1;
	static double citytax = 0.03;
	static double latetax = 0.04;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter KWH used:");
		int hours = in.nextInt();
		System.out.println("");
		System.out.println("             C O M P S C I Electric             ");
		System.out.println("------------------------------------------------");
		System.out.println("Kilowatts Used       " + hours + " @ $" + cost);
		System.out.println("------------------------------------------------");
		double basechargePrice = hours * cost;
		double surchargePrice = hours * cost * surcharge;
		double citytaxPrice = hours * cost * citytax;
		System.out.println("Base Charge           $" + Round.hundredths(basechargePrice));
		System.out.println("Surcharge             $" + Round.hundredths(surchargePrice));
		System.out.println("City Tax              $" + Round.hundredths(citytaxPrice));
		System.out.println("------------------------------------------------");
		System.out.println("Pay this amount       $" + Round.hundredths(basechargePrice + surchargePrice + citytaxPrice));
		System.out.println("");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 7);
		System.out.println("After " + cal.getTime() + " pay $" + Round.hundredths((basechargePrice + surchargePrice + citytaxPrice) * 1.04));
		BlockLetters.TONY_PAPPAS.outputBlockName();

	}

}
/*
What I Learned:
Calendar maybe? I have used everything in this program before.

Difficulties I had:
None

Sample Output:
Enter KWH used:
993

             C O M P S C I Electric             
------------------------------------------------
Kilowatts Used       993 @ $0.0475
------------------------------------------------
Base Charge           $47.17
Surcharge             $4.72
City Tax              $1.42
------------------------------------------------
Pay this amount       $53.3

After Wed Oct 01 09:07:57 EDT 2014 pay $55.43
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
