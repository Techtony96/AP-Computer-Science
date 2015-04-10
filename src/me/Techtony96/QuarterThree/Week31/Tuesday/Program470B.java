package me.Techtony96.QuarterThree.Week31.Tuesday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Program470B {

	public static void main(String[] args) {
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir")
					+ "/src/Files/prog464a.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}
		// define array
		int array[][] = new int[5][5];
		// loop
		for (int i = 0; i < 5; i++) {
			String[] current = inFile.nextLine().split(" ");
			for (int j = 0; j < 5; j++) {
				array[i][j] = Integer.valueOf(current[j]);
			}
		}
		// Print out array
		System.out.println("Original");
		for (int[] row : array) {
			System.out.println(Arrays.toString(row).replace("[", "").replace("]", "").replace(",", "\t"));
		}

		int total = 0;
		for (int row = 0; row < array.length; row++) {

			total += array[row][row];
		}
		System.out.println("Main Diagonal Sum:" + total);

		total = 0;
		for (int row = 0; row < array.length; row++) {
			total += array[array.length - row - 1][row];
		}
		System.out.println("Other Diagonal Sum: " + total);

	}

}
/* Sample Output

Original
45	 67	 89	 12	 -3
-3	 -6	 -7	 -4	 -9
96	 81	 -8	 52	 12
14	 -7	 72	 29	 -1
19	 43	 28	 63	 87
Main Diagonal Sum:147
Other Diagonal Sum: -3

*/