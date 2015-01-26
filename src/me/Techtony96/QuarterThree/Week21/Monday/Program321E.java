package me.Techtony96.QuarterThree.Week21.Monday;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program321E {

	/* Program Name: Digit Extractor
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 1/16/14
	 * Platform: Java 1.6
	 * 
	 * Description: 
	 */

	static DecimalFormat money = new DecimalFormat("$0.00");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter a number (0 to 999) ");
		int input = in.nextInt();
		System.out.println("Options\n1)  Units\n2)  Tens\n3)  Hundreds\n4) Quit");
		int choice = in.nextInt();
		choice(input, choice);
	}

	public static void choice(int number, int choice) {
		if (choice > 4 || choice < 1) {
			System.out.println("Invalid Choice.");
			main(null);
			return;
		} else {
			Number n = new Number(number);
			switch (choice) {
			case 1:
				System.out.println("The units digit is " + n.getUnits());
				break;
			case 2:
				System.out.println("The tens digit is " + n.getTens());
				break;
			case 3:
				System.out.println("The hundreds digit is " + n.getHundreds());
				break;
			case 4:
				return;
			}
			main(null);
		}
	}

}
/*
Sample Output:

Enter a number (0 to 999) 123
Options
1)  Units
2)  Tens
3)  Hundreds
4) Quit
1
The units digit is 3
Enter a number (0 to 999) 123
Options
1)  Units
2)  Tens
3)  Hundreds
4) Quit
2
The tens digit is 2
Enter a number (0 to 999) 123
Options
1)  Units
2)  Tens
3)  Hundreds
4) Quit
3
The hundreds digit is 1
Enter a number (0 to 999) 123
Options
1)  Units
2)  Tens
3)  Hundreds
4) Quit
4


 */