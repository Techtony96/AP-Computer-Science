package me.Techtony96.QuarterThree.Week27.Wednesday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program460A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/sort.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}

		//get info from file
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (inFile.hasNext()) {
			list.add(inFile.nextInt());
		}

		//sort the list
		Collections.sort(list);

		//ask user for variable to search for
		System.out.print("Enter a number to search for: ");
		int lookingFor = in.nextInt();

		//Define variables
		int first = 0;
		int last = list.size() - 1;
		int middle = (first + last) / 2;

		//loop
		while (first <= last) {
			if (list.get(middle) < lookingFor)
				first = middle + 1;
			else if (list.get(middle) == lookingFor) {
				System.out.println("Your number occurs at: " + (middle + 1));
				break;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		//does not occur
		if (first > last)
			System.out.println("Your number does not occur in this list.");
		
		//restart program
		System.out.println("");
		main(null);
	}

}
/* Sample Output
Enter a number to search for: 101
Your number does not occur in this list.

Enter a number to search for: 50
Your number occurs at: 33

Enter a number to search for: 36
Your number does not occur in this list.

Enter a number to search for: 
*/
