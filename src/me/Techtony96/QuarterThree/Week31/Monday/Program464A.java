package me.Techtony96.QuarterThree.Week31.Monday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Program464A {

	public static void main(String[] args) {
		// new file that we are getting data from
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
		//define array
		int array[][] = new int[5][5];
		//loop
		for (int i = 0; i < 5; i++) {
			String[] current = inFile.nextLine().split(" ");
			for (int j = 0; j < 5; j++) {
				array[i][j] = Integer.valueOf(current[j]);
			}
		}
		//Print out array
		for (int[] row : array) {
			System.out.println(Arrays.toString(row).replace("[", "").replace("]", "").replace(",", "\t") + "\t" + findHighest(row));
		}
	}

	//find highest number
	private static int findHighest(int[] array){
		int returnValue = Integer.MIN_VALUE;
		for (int i : array){
			if (i>returnValue)
				returnValue = i;
		}
		return returnValue;
	}
}

/* Sample output

45	 67	 89	 12	 -3	89
-3	 -6	 -7	 -4	 -9	-3
96	 81	 -8	 52	 12	96
14	 -7	 72	 29	 -1	72
19	 43	 28	 63	 87	87


*/