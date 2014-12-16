package me.Techtony96.QuarterTwo;

import java.util.Scanner;

public class Program671A {

	/* Program Name: Converting Times
	* Version: 1.0
	*
	* Author: Tony Pappas
	* Date: 12/16/14
	* Platform: Java 1.6
	*
	* Description: Convert Times
	*/

	static Scanner in = new Scanner(System.in);

	//Convert Time
	public static void hoursToMinutes() {
		System.out.print("Enter hour(s): ");
		int hours = in.nextInt();
		System.out.println(hours + " * 60 = " + (hours * 60) + " minutes.");
		System.out.println("");
	}

	//Convert Time
	public static void daysToHours() {
		System.out.print("Enter day(s): ");
		int days = in.nextInt();
		System.out.println(days + " * 24 = " + (days * 24) + " hours.");
		System.out.println("");
	}

	//Convert Time
	public static void minutesToHours() {
		System.out.print("Enter minute(s): ");
		int minutes = in.nextInt();
		System.out.println(minutes + " / 60 = " + ((double) minutes / 60) + " hours.");
		System.out.println("");
	}

	//Convert Time
	public static void hoursToDays() {
		System.out.print("Enter hour(s): ");
		int hours = in.nextInt();
		System.out.println(hours + " / 24 = " + ((double) hours / 24) + " days.");
		System.out.println("");
	}

	//find time inbetween
	public static void elapsedTime() {
		System.out.print("Enter the beginning hour: ");
		int startingHour = in.nextInt();
		System.out.print("Enter the beginning minute(s): ");
		int startingMinutes = in.nextInt();
		System.out.print("Enter AM/PM: ");
		String startingAmOrPm = in.nextLine();
		in.nextLine();
		if (startingAmOrPm.toLowerCase().contains("p"))
			startingHour += 12;
		System.out.print("Enter the ending hour: ");
		int endingHour = in.nextInt();
		System.out.print("Enter the ending minute(s): ");
		int endingMinutes = in.nextInt();
		System.out.print("Enter AM/PM: ");
		in.nextLine();
		String endingAmOrPm = in.nextLine();
		if (endingAmOrPm.toLowerCase().contains("p"))
			endingHour += 12;
		
		int differenceInMinutes = (endingHour*60+endingMinutes) - (startingHour*60+startingMinutes);
		
		int differenceHours = differenceInMinutes/60;
		int differenceMinutes = differenceInMinutes%60;
		
		System.out.println("");
		System.out.println("The elapsed time is: " + differenceHours + "hrs and " + differenceMinutes + " mins.");
	}

	//main method
	public static void main(String args[]) {
		while (true) {
			System.out.println("Conversion Tasks");
			System.out.println("1. Hours -> Minutes");
			System.out.println("2. Days -> Hours");
			System.out.println("3. Minutes -> Hours");
			System.out.println("4. Hours -> Days");
			System.out.println("5. Elapsed time between two times");
			System.out.print("Enter a number: ");
			int menu = in.nextInt();
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
		}
	}
}
/*
What I Learned:
Calculations

Difficulties I had:
in.nextLine() after an in.nextInt() returns \n

Sample Output:
Conversion Tasks
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Elapsed time between two times
Enter a number: 1

Enter hour(s): 2
2 * 60 = 120 minutes.

Conversion Tasks
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Elapsed time between two times
Enter a number: 

*/