package me.Techtony96.QuarterThree.Week31.Tuesday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Program464D {

	public static void main(String[] args) {

		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog464a.dat"));
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
			System.out.println(Arrays.toString(row).replace("[", "")
					.replace("]", "").replace(",", "\t"));
		}

		System.out.println("Transpose");
		//Print out transposed array
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.print("\n");
		}
	}

}
/* Sample Output

Original
45	 67	 89	 12	 -3
-3	 -6	 -7	 -4	 -9
96	 81	 -8	 52	 12
14	 -7	 72	 29	 -1
19	 43	 28	 63	 87
Transpose
45	-3	96	14	19	
67	-6	81	-7	43	
89	-7	-8	72	28	
12	-4	52	29	63	
-3	-9	12	-1	87	


*/