package me.Techtony96.QuarterThree.Week27.Tuesday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program482J {

	public static void main(String args[]) {
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/numsort.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}

		//get info from file
		ArrayList<Integer> unsorted = new ArrayList<Integer>();
		while (inFile.hasNext()) {
			unsorted.add(inFile.nextInt());
		}

		//ouput original list
		System.out.println("Original List:");
		for (int i = 0; i < unsorted.size(); i++) {
			System.out.print(unsorted.get(i) + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.print("\n");
			}
		}

		//output sorted list
		System.out.println("Sorted List:");
		ArrayList<Integer> sorted = sort(unsorted);
		for (int i = 0; i < sorted.size(); i++) {
			System.out.print(sorted.get(i) + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.print("\n");
			}
		}

		System.out.println();
	}

	//sort method
	public static ArrayList<Integer> sort(ArrayList<Integer> unsorted) {
		for (int i = 1; i < unsorted.size(); i++) {
			int value = unsorted.get(i);
			int hole = i;
			while (hole > 0 && value < unsorted.get(hole - 1)) {
				unsorted.set(hole, unsorted.get(hole - 1));
				hole--;
			}
			unsorted.set(hole, value);
		}
		return unsorted;
	}
}
