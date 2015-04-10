package me.Techtony96.QuarterThree.Week31.Thursday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import me.Techtony96.Utilities.UtilArray;

public class Program465H {

	public static void main(String[] args) {
		// new file that we are getting data from
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog465h.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}
		// define array
		while (inFile.hasNextLine()) {
			int array[][] = new int[Integer.valueOf(inFile.nextLine())][Integer.valueOf(inFile.nextLine())];
			for (int i = 0; i < array.length; i++) {
				String[] current = inFile.nextLine().split(" ");
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = Integer.valueOf(current[j]);
				}
			}

			//Store compressed array
			int compressed[][] = compress(array);
			//print original
			System.out.println("Original Matrix: ");
			UtilArray.printArray(array);
			System.out.print("\n");
			//find the amount of numbers stored
			int countOriginal = array.length * array[0].length;
			int countCompressed = compressed.length * compressed[0].length;
			//Find out if the compressed matrix is more efficient
			if (countOriginal > countCompressed) {
				UtilArray.printArray(compressed);
				System.out.println("The original Matrix is Sparse.");
			} else if (countOriginal == countCompressed) {
				UtilArray.printArray(compressed);
				System.out.println("The original Matrix and the Sparse Matrix are Equally Efficient.");
			} else {
				System.out.println("The original matrix is abundant.");
			}
			System.out.println("\n");
		}

	}

	//Compress the given array
	private static int[][] compress(int[][] array) {
		//Define variable to store compressed numbers
		ArrayList<int[]> tempList = new ArrayList<>();
		//loop through array
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[0].length; column++) {
				//get value at given point
				int value = array[row][column];
				//if the value is 0, ignore it
				if (value == 0)
					continue;
				//else, define a temp array to add to the arraylist
				int[] temp = { row + 1, column + 1, value };
				tempList.add(temp);
			}
		}

		//convert the arraylist to a 2d array
		int[][] returnValue = new int[tempList.size()][3];
		returnValue = tempList.toArray(returnValue);

		return returnValue;
	}
}
/*
Original Matrix: 
0	 0	 7	 0	 0	 0
0	 0	 0	 0	 -8	 0
0	 0	 0	 0	 0	 0
2	 0	 0	 0	 0	 0
0	 0	 0	 0	 0	 0

1	 3	 7
2	 5	 -8
4	 1	 2
The original Matrix is Sparse.


Original Matrix: 
0	 2	 0	 3	 0	 1
8	 0	 4	 0	 1	 0
0	 3	 0	 1	 0	 -7
5	 0	 9	 0	 6	 0
0	 2	 0	 -1	 0	 7

The original matrix is abundant.


Original Matrix: 
0	 0	 1	 0	 0	 2
3	 0	 0	 4	 0	 0
0	 0	 5	 0	 0	 6
7	 0	 0	 8	 0	 0
0	 0	 9	 0	 0	 1

1	 3	 1
1	 6	 2
2	 1	 3
2	 4	 4
3	 3	 5
3	 6	 6
4	 1	 7
4	 4	 8
5	 3	 9
5	 6	 1
The original Matrix and the Sparse Matrix are Equally Efficient.


*/