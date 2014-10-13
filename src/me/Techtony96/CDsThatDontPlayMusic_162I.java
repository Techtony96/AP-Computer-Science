package me.Techtony96;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Round;

public class CDsThatDontPlayMusic_162I {
	
	/* Program Name: CD's That Don't Play Music
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/7/14
	 * Platform: Java 1.6
	 * 
	 * Description: Finding the value of a CD after 5 years
	 */
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter initial investment");
		double initialInvestment = in.nextDouble();
		double currentCDValue = initialInvestment;
		for (int i = 1; i<=5;i++){
			System.out.println("Enter Rate for Year " + i);
			double rate = in.nextDouble();
			rate = rate/100.00;
			System.out.println("You earned $" + Round.hundredths(((currentCDValue * (rate+1)) - currentCDValue)) + " interest.");
			currentCDValue += (currentCDValue * rate);
			
		}
		System.out.println("Your CD is now worth $" + Round.hundredths(currentCDValue));

		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
Looping

Difficulties I had:
Doing Math correctly

Sample Output:
Enter initial investment
3000
Enter Rate for Year 1
10
You earned $300.0 interest.
Enter Rate for Year 2
5
You earned $165.0 interest.
Enter Rate for Year 3
7
You earned $242.55 interest.
Enter Rate for Year 4
9
You earned $333.68 interest.
Enter Rate for Year 5
11
You earned $444.54 interest.
Your CD is now worth $4485.77
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
