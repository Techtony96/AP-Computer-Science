package me.Techtony96.QuarterTwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class WeirdWages_213A {

	/* Program Name: Tony Pappas
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/20/14
	 * Platform: Java 1.6
	 * 
	 * Description: Calculate wages from a file
	 */

	static DecimalFormat money = new DecimalFormat("$0.00");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//Get the file
		BufferedReader inFile = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/Files/prog213a.dat"));
		//Define a variable to store the current line
		String line;
		//define week calculating pay for curent week
		int week = 1;
		//repeat for each line in the file
		while ((line = inFile.readLine()) != null) {
			//output the hours worked from the file
			System.out.println("Hours worked: " + line);
			//output the week #
			System.out.print("Week #" + week + " ");
			//split up the hours from the file
			String[] hours = line.split(" ");
			//define a variable to store the int hours
			int[] hourResults = new int[hours.length];
			//parse the strings to ints
			for (int i = 0; i < hours.length; i++) {
				try {
					hourResults[i] = Integer.parseInt(hours[i]);
				} catch (NumberFormatException nfe) {
					nfe.printStackTrace();
				}
			}
			//define a variable for amountPayed and totalhours
			double amountPayed = 0;
			int totalWeekdayHours = 0;
			//calcualte amount payed for each day
			for (int i = 0; i <= 6; i++) {
				//define variable to hold hours for today
				int currentHours = hourResults[i];

				//if saturday
				if (i == 6) {
					//get paid extra
					amountPayed += currentHours * 2.25 * 10.0;
					//end of week calculation for more than 40 hours
					if (totalWeekdayHours > 40) {
						//get paid extra
						amountPayed += (totalWeekdayHours - 40) * 2.5;
					}
					//if sunday
				} else if (i == 0) {
					//get paid extra
					amountPayed += currentHours * 1.5 * 10.0;
					//if weekday
				} else {
					//add weekday hours to total hours
					totalWeekdayHours += currentHours;
					//if worked more than 8 hours
					if (currentHours > 8) {
						//get paid extra
						amountPayed += (currentHours - 8) * 11.5;
						amountPayed += 80;
						//otherwise...
					} else {
						//get paid $10 an hour :(
						amountPayed += currentHours * 10.0;
					}
				}

			}

			//output weekly pay
			System.out.println(money.format(amountPayed));
		}

		//end of file
		System.out.println("");
		System.out.println("End of File");
		inFile.close();
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
if statements. Lots of if statements.

Difficulties I had:
interpreting the problem and reading it correctly.

Sample Output:
Hours worked: 9 8 10 8 9 9 5
Week #1 $703.50
Hours worked: 7 8 8 8 0 8 9
Week #1 $627.50
Hours worked: 6 10 5 0 0 0 0
Week #1 $243.00

End of File
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */