package me.Techtony96.QuarterTwo;

import java.io.File;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class Program505C {

	/* Program Name: Word Comparer
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 12/2/14
	 * Platform: Java 1.6
	 * 
	 * Description: Word Comparer
	 */

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog505c.dat"));
			while (scan.hasNextLine()) {
				String currentWord = scan.nextLine().toUpperCase();
				if (currentWord.compareTo("DINOSAUR") < 0) {
					System.out.println(currentWord + " not between");
					continue;
				}
				if (currentWord.compareTo("WALRUS") > 0) {
					System.out.println(currentWord + " not between");
					continue;
				}
				System.out.println(currentWord + " between");
			}
		} catch (Exception e) {

		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
.compareTo

Difficulties I had:
Remembering to use the .compareTo

Sample Output:
VAMPIRE between
MONKAY	 between
ELEPHANT between
APE not between
LION between
HIPPOPOTAMUS between
ANT not between
ZEBRA not between
YAK not between
ANTELOPE not between
DINGO not between
WHALE not between
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */