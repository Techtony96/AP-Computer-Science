package me.Techtony96.QuarterThree.Week31.Wednesday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import me.Techtony96.Utilities.UtilArray;

public class Program465A {

	public static void main(String[] args) {
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir")
					+ "/src/Files/prog465a.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}
		// define array
		int matrix1[][] = new int[4][4];
		int matrix2[][] = new int[4][4];

		// loop for matrix 1
		for (int i = 0; i < 4; i++) {
			String[] line = inFile.nextLine().split(" ");
			for (int j = 0; j < 4; j++) {
				matrix1[i][j] = Integer.valueOf(Integer.valueOf(line[j]));
			}
		}

		//loop for matrix 2
		for (int i = 0; i < 4; i++) {
			String[] line = inFile.nextLine().split(" ");
			for (int j = 0; j < 4; j++) {
				matrix2[i][j] = Integer.valueOf(Integer.valueOf(line[j]));
			}
		}
		//output matrix 1
		System.out.println("Matrix One");
		UtilArray.printArray(matrix1);
		//output matrix 2
		System.out.println("Matrix Two");
		UtilArray.printArray(matrix2);
		
		//output the largest elements
		System.out.println("Largest Elements");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(Math.max(matrix1[i][j], matrix2[i][j]) + "\t");
			}
			System.out.println();
		}

	}

}
/* Sample Output

Matrix One
2	 7	 6	 4
6	 1	 2	 4
9	 7	 2	 6
8	 3	 2	 1
Matrix Two
4	 1	 3	 7
6	 2	 3	 8
7	 2	 2	 4
4	 2	 3	 1
Largest Elements
4	7	6	7	
6	2	3	8	
9	7	2	6	
8	3	3	1	

*/
