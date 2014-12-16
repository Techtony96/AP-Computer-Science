package me.Techtony96.QuarterTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class EC_Program213T {

	/* Program Name: National Parcel Services
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/24/14
	 * Platform: Java 1.6
	 * 
	 * Description: Calculate shipping cost
	 */

	static DecimalFormat money = new DecimalFormat("$0.00");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			//output header
			System.out.println("NATIONAL PARCEL SERVICES\nPACKAGE DATA\n\nLENGTH    WIDTH     DEPTH    WEIGHT");
			//store dimensions and weight
			double length = in.nextDouble();
			double width = in.nextDouble();
			double depth = in.nextDouble();
			double weight = in.nextDouble();

			//if package is too heavy
			if (weight > 50) {
				System.out.println("Package Refused--Package Weight Exceeds 50 Pounds");
				break;
			}

			//if dimensions exceed 3 feet
			if (length > 3 || width > 3 || depth > 3) {
				System.out.println("Package Refused--Package Dimensions Exceed 3 Feet");
				break;
			}

			//calculate weight cost
			double weightCost = 0.08;
			if (weight > 20 && weight <= 40) {
				weightCost = 0.10;
			} else if (weight > 40) {
				weightCost = 0.15;
			}

			//calculate volume surcharge
			double volumeSurcharge = 0;
			if (length * width * depth > 18) {
				volumeSurcharge = 1.00;
			}

			//output costs
			System.out.println("BASE RATE      $0.75");
			System.out.println("Weight @" + weightCost + "      " + money.format(weightCost * weight));
			System.out.println("Volume Surcharge $" + volumeSurcharge);
			System.out.println("      Total Due: " + money.format(0.75 + weightCost * weight + volumeSurcharge));

		}
		//	BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
Formatting

Difficulties I had:
None

Sample Output:
NATIONAL PARCEL SERVICES
PACKAGE DATA

LENGTH    WIDTH     DEPTH    WEIGHT
1.5 1.2 .8 6
BASE RATE      $0.75
Weight @0.08      $0.48
Volume Surcharge $0.0
      Total Due: $1.23


 */