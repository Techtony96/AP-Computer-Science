package me.Techtony96.QuarterTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class Program671A {

	/* Program Name:
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 
	 * Platform: Java 1.6
	 * 
	 * Description: 
	 */

	static Scanner in = new Scanner(System.in);

	public static void hoursToMinutes()
	
	
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter hour(s): ");
		int hours = input.nextInt();
		System.out.println(hours + " * 60 = " + (hours * 60) + " minutes.");
		System.out.println("");
	}

	public static void daysToHours()
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter day(s): ");
		int days = input.nextInt();
		System.out.println(days + " * 24 = " + (days * 24) + " hours.");
		System.out.println("");
	}
	public static void minutesToHours()
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter minute(s): ");
		int minutes = input.nextInt();
		System.out.println(minutes + " / 60 = " + ((double)minutes / 60) + " hours.");
		System.out.println("");
	}
	public static void hoursToDays()
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter hour(s): ");
		int hours = input.nextInt();
		System.out.println(hours + " / 24 = " + ((double)hours / 24) + " days.");
		System.out.println("");
	}
	public static void elapsedTime()
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the beginning hour: ");
		int startingHour = input.nextInt();
		System.out.print("Enter the beginning minute(s): ");
		int startingMinutes = input.nextInt();
		System.out.print("Enter AM/PM: ");
		String startingAmOrPm = input.nextLine();
		System.out.print("Enter the ending hour: ");
		int endingHour = input.nextInt();
		System.out.print("Enter the ending minute(s): ");
		int endingMinutes = input.nextInt();
		System.out.print("Enter AM/PM: ");
		String endingAmOrPm = input.nextLine();
		System.out.println("");
		System.out.println("The elapsed time is: " + );
	}
	public static void main (String args [])
	{
		int x = 1;
		while (x == 1) {
			Scanner input = new Scanner (System.in);
			System.out.println("Conversion Tasks");
			System.out.println("\t1. Hours -> Minutes");
			System.out.println("\t2. Days -> Hours");
			System.out.println("\t3. Minutes -> Hours");
			System.out.println("\t4. Hours -> Days");
			System.out.println("\t5. Elapsed time between two times");
			System.out.println("\t6. Exit");
			System.out.print("Enter a number: ");
			int menu = input.nextInt();
			System.out.println("");
			if (menu == 1)
				hoursToMinutes();
			if (menu == 2)
				daysToHours();
			if (menu == 3)
				minutesToHours();
			if (menu == 4)
				hoursToDays();
			if (menu == 5)
				elapsedTime();
			if (menu == 6)
				x = 0;
		}
	}
}



}
/*
What I Learned:


Difficulties I had:


Sample Output:


 */