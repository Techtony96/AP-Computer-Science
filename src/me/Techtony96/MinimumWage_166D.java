package me.Techtony96;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class MinimumWage_166D {
	
	/* Program Name: Minimum Wage
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/13/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the minimum wage of employees at $4/hour
	 */
	
	static DecimalFormat money = new DecimalFormat("$0.00");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//Define loop for employee count
		for (int employeeCount = 3; employeeCount <= 6; employeeCount++){
			//output current number of employees
			System.out.println("Wages for " + employeeCount + " employees");
			System.out.println("");
			//define loop for number of hours worked
			for (int hoursWorked = 10; hoursWorked <= 40; hoursWorked += 10){
				//output results
				System.out.println("For " + hoursWorked + " hours worked, the wages total " + money.format(4*employeeCount*hoursWorked));
			}
			System.out.println("");
		}
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
Nested loops

Difficulties I had:
None

Sample Output:
Wages for 3 employees

For 10 hours worked, the wages total $120.00
For 20 hours worked, the wages total $240.00
For 30 hours worked, the wages total $360.00
For 40 hours worked, the wages total $480.00

Wages for 4 employees

For 10 hours worked, the wages total $160.00
For 20 hours worked, the wages total $320.00
For 30 hours worked, the wages total $480.00
For 40 hours worked, the wages total $640.00

Wages for 5 employees

For 10 hours worked, the wages total $200.00
For 20 hours worked, the wages total $400.00
For 30 hours worked, the wages total $600.00
For 40 hours worked, the wages total $800.00

Wages for 6 employees

For 10 hours worked, the wages total $240.00
For 20 hours worked, the wages total $480.00
For 30 hours worked, the wages total $720.00
For 40 hours worked, the wages total $960.00

 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
