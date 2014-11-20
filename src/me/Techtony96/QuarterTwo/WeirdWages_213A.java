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
		BufferedReader  inFile = new BufferedReader (new FileReader(System.getProperty("user.dir") + "/src/Files/prog213a.dat"));
		String line;
		int week = 1;
		while((line = inFile.readLine()) != null) {
			System.out.println("Hours worked: " + line);
			System.out.print("Week #" + week + " ");
			String[] hours = line.split(" ");
			int[] hourResults = new int[hours.length];
			for (int i = 0; i < hours.length; i++) {
			    try {
			    	hourResults[i] = Integer.parseInt(hours[i]);
			    } catch (NumberFormatException nfe) {
			    	nfe.printStackTrace();
			    }
			}
			int amountPayed = 0;
			int totalHours = 0;
			for (int i = 0; i<=6;i++){
				int currentHours = hourResults[i];
				totalHours += currentHours;
				
				if (i == 6){
					amountPayed += currentHours*2.25*10.0; 
					if (totalHours > 40){
						amountPayed += (totalHours-40)*2.5;
					}
				} else if (i == 0){
					amountPayed += currentHours*1.5*10.0;
					
				} else {
					if (currentHours > 8){
						amountPayed += (currentHours - 8) * 11.5;
						amountPayed += 80;
					} else {
						amountPayed += currentHours * 10.0;
					}
				}
				
			}
			
			System.out.println(money.format(amountPayed));
		}

		inFile.close();
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}



}
/*
What I Learned:


Difficulties I had:


Sample Output:


 */