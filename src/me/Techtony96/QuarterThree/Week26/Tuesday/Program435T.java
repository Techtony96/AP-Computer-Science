package me.Techtony96.QuarterThree.Week26.Tuesday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import me.Techtony96.Utilities.Round;

public class Program435T {

	public static String findHeight(char sex, char bone, int age, double length) {
		double height = 0;
		//if male
		if (sex == 'M') {
			//get bone info
			switch (bone) {
			case 'F':
				height = 69.089 + (2.238 * length);
				break;
			case 'T':
				height = 81.688 + (2.392 * length);
				break;
			case 'H':
				height = 73.570 + (2.970 * length);
				break;
			case 'R':
				height = 80.405 + (3.650 * length);
				break;
			}
			//female
		} else if (sex == 'F') {
			//bone info
			switch (bone) {
			case 'F':
				height = 61.412 + (2.317 * length);
				break;
			case 'T':
				height = 72.572 + (2.533 * length);
				break;
			case 'H':
				height = 64.977 + (3.144 * length);
				break;
			case 'R':
				height = 73.502 + (3.876 * length);
				break;
			}
		}
		//older than 30
		if (age > 30) {
			int years = age - 30;
			height = height - (years * .06);
		}
		String heightOutput;
		//get height output
		if ((sex != 'M') && (sex != 'F')) {
			heightOutput = "Bad Sex Code";
		} else if ((bone != 'F') && (bone != 'T') && (bone != 'H') && (bone != 'R')) {
			heightOutput = "Bad Bone Code";
		} else {
			heightOutput = Double.toString(Round.hundredths(height));
		}
		//return answer
		return sex + "\t" + bone + "\t" + age + "\t" + Round.hundredths(length) + "\t" + heightOutput;
	}

	public static void main(String[] args) {
		System.out.println("sex\tbone\tage\tlength\theight");
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog435t.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}

		while (inFile.hasNext()) {
			String s = inFile.nextLine();
			System.out.println(findHeight(s.charAt(0), s.charAt(1), Integer.valueOf(s.substring(2, 4)), Double.valueOf(s.substring(5))));
		}

	}
}

/* Sample Output

sex	bone	age	length	height
F	H	45	36.27	178.1
M	F	18	46.97	174.2
M	H	29	33.31	172.5
M	T	95	36.98	166.25
M	R	30	23.18	165.0
F	F	31	42.55	159.94
F	F	65	39.96	151.9
F	T	50	30.96	149.8
F	R	80	19.38	145.6
M	H	36	24.02	144.54
Q	F	40	30.0	Bad Sex Code
M	Q	40	30.0	Bad Bone Code

*/
