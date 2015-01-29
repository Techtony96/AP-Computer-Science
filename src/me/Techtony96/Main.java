package me.Techtony96;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class Main {

	/* Program Name:
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 
	 * Platform: Java 1.6
	 * 
	 * Description: 
	 */

	static DecimalFormat money = new DecimalFormat("$0.00");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		//new file that we are getting data from
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/FILE_NAME.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}
		while (inFile.hasNext()){
			
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:


Difficulties I had:


Sample Output:


 */