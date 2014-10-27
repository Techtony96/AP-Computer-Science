package me.Techtony96.QuarterOne;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Round;

public class StraightLine_108B {

	/* Program Name: Straight Line
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/29/14
	 * Platform: Java 1.6
	 * 
	 * Description: Calculating Yearly Depreciation
	 */


	public static void main(String[] args) {
		//Define scanner
		Scanner in = new Scanner(System.in);
		double number = 0;

		//Loop
		for (int i = 1; i <= 4; i++){
			System.out.println("Run #" + i);
			System.out.println("Enter Price");
			double price = in.nextDouble();
			System.out.println("Enter Salvage Value");
			double value = in.nextDouble();
			System.out.println("Enter Estimated Life in Years");
			double years = in.nextDouble();
			number = (price-value)/years;
			System.out.println("Annual Depreciation = " + Round.hundredths(number));
			System.out.println("");
		}

		//Output signature
		BlockLetters.TONY_PAPPAS.outputBlockName();

	}



}
/*
What I Learned:
Loops

Difficulties I had:
None

Sample Output:
Run #1
Enter Price
1
Enter Salvage Value
1
Enter Estimated Life in Years
1
Annual Depreciation = 0.0

Run #2
Enter Price
1
Enter Salvage Value
1
Enter Estimated Life in Years
1
Annual Depreciation = 0.0

Run #3
Enter Price
1
Enter Salvage Value
1
Enter Estimated Life in Years
1
Annual Depreciation = 0.0

Run #4
Enter Price
1
Enter Salvage Value
1
Enter Estimated Life in Years
1
Annual Depreciation = 0.0


 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               



 */
