package me.Techtony96.QuarterThree.Week26.Wednesday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program412A {
	public static void main(String[] args) {
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/P412a.dat")).useDelimiter(" ");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}

		//Separate each into tokens 
		int[] ranges = new int[9];
		//output header
		System.out.println("Salary\t\tFrequency");
		while (inFile.hasNext()) {
			//get value
			int value = Integer.parseInt(inFile.next());
			int salary = (int) (200 + (value * .09));
			if (salary > 199 && salary < 300) {
				ranges[0]++;
			} else if (salary > 299 && salary < 400) {
				ranges[1]++;
			} else if (salary > 399 && salary < 500) {
				ranges[2]++;
			} else if (salary > 499 && salary < 600) {
				ranges[3]++;
			} else if (salary > 599 && salary < 700) {
				ranges[4]++;
			} else if (salary > 699 && salary < 800) {
				ranges[5]++;
			} else if (salary > 799 && salary < 900) {
				ranges[6]++;
			} else if (salary > 899 && salary < 1000) {
				ranges[7]++;
			} else {
				ranges[8]++;
			}
		}
		//print results
		System.out.print("$200-299\t" + ranges[0] + "\n" + "$300-399\t" + ranges[1] + "\n" + "$400-499\t" + ranges[2] + "\n" + "$500-599\t" + ranges[3] + "\n" + "$600-699\t" + ranges[4] + "\n" + "$700-799\t" + ranges[5] + "\n" + "$800-899\t" + ranges[6] + "\n" + "$900-999\t" + ranges[7] + "\n" + "$1000-1099\t" + ranges[8] + "\n");
	}
}
/* Sample Output

Salary		Frequency
$200-299	5
$300-399	2
$400-499	2
$500-599	1
$600-699	3
$700-799	1
$800-899	2
$900-999	1
$1000-1099	3

*/
