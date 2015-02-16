package me.Techtony96.QuarterThree.Week24.Friday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Program404A {

	/* Program Name: Separating positive and negative numbers
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 2/16/15
	 * Platform: Java 1.6
	 */

	public static void main(String args[]) {
		Scanner file1 = null, file2 = null;
		try {
			// Create a scanner to read the file, file name is parameter
			file1 = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prg404a1.dat"));
			file2 = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prg404a2.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}

		//define new vector list
		Vector<Integer> pos = new Vector<Integer>();
		Vector<Integer> neg = new Vector<Integer>();

		//loop through file 1
		while (file1.hasNext()) {
			int value = Integer.valueOf(file1.nextLine());
			if (value >= 0) {
				pos.add(value);
			} else {
				neg.add(value);
			}
		}

		//output header
		System.out.println("Pos(+)\tNeg(-)");
		//ouput table with both columns
		for (int i = 0; i < Math.min(pos.size(), neg.size()); i++) {
			System.out.println(pos.get(i) + "\t" + neg.get(i));
		}
		//ouput table with one column
		for (int i = Math.min(pos.size(), neg.size()); i < Math.max(pos.size(), neg.size()); i++){
			System.out.println(pos.get(i));
		}

		//reset lists
		pos.clear();
		neg.clear();
		
		//loop through file 2
		while (file2.hasNext()) {
			int value = Integer.valueOf(file2.nextLine());
			if (value >= 0) {
				pos.add(value);
			} else {
				neg.add(value);
			}
		}
		//extra space
		System.out.println ("\n\n\n");
		//output header
		System.out.println("Pos(+)\tNeg(-)");
		//ouput table with both columns
		for (int i = 0; i < Math.min(pos.size(), neg.size()); i++) {
			System.out.println(pos.get(i) + "\t" + neg.get(i));
		}
		//ouput table with one column
		for (int i = Math.min(pos.size(), neg.size()); i < Math.max(pos.size(), neg.size()); i++){
			System.out.println("\t" + neg.get(i));
		}

	}

}

/* Sample Output

Pos(+)	Neg(-)
3	-8
66	-16
54	-56
22	-34
19	-22
21	-55
34	-3
64	-55
55	-76
9	-45
39
54
33




Pos(+)	Neg(-)
8	-3
10	-66
56	-54
34	-22
22	-19
55	-21
3	-34
55	-64
76	-55
45	-9
	-89
	-54
	-33


*/
