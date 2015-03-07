package me.Techtony96.QuarterThree.Week26.Thursday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Program415H {

	public static void main(String args[]) {
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog415h.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}

		//define list to store values
		Integer[] list = new Integer[20];
		int count = 0;
		while (inFile.hasNext()) {
			//add values to list
			int value = Integer.valueOf(inFile.nextLine());
			list[count] = value;
			count++;
		}

		//output original
		System.out.print("The original set of numbers are: ");
		for (int i : list) {
			System.out.print(i + " ");
		}
		//new list
		System.out.print("\nThe different numbers from the set of integers are: ");

		for (int i : removeDuplicates(list)) {
			System.out.print(i + " ");
		}
	}

	//method to remove duplicates
	public static Integer[] removeDuplicates(Integer[] a) {
		return new HashSet<Integer>(Arrays.asList(a)).toArray(new Integer[0]);
	}
}
/* Sample Output

The original set of numbers are: 12 12 30 12 45 66 78 30 82 19 99 11 11 15 31 18 51 17 12 17 
The different numbers from the set of integers are: 66 99 11 12 45 78 15 17 82 18 19 51 30 31 

*/
