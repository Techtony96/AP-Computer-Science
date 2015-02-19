package me.Techtony96.QuarterThree.Week25.Monday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program408A {

	/* Program Name: Ranking Test Scores
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 2/19/15
	 * Platform: Java 1.6
	 * 
	 * Description: Sort scores
	 */

	public static void main(String[] args) {
		List<Integer> IDs = new ArrayList<Integer>();
		List<Integer> scores = new ArrayList<Integer>();

		Scanner file = null;
		try {
			// Create a scanner to read the file, file name is parameter
			file = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prg408a.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}

		//loop through file
		while (file.hasNext()) {
			//define variable of current working line
			String workingLine = file.nextLine();
			//store info of line
			IDs.add(Integer.valueOf(workingLine.split(" ")[0]));
			scores.add(Integer.valueOf(workingLine.split(" ")[1]));
		}

		//output table header
		System.out.println("ID\tScore");

		//loop through array
		while (scores.size() > 0) {
			//define variables
			int highest = 0, spot = 0;
			//loop through array
			for (int i = 0; i < scores.size(); i++) {
				//get scores
				int num = scores.get(i);
				//if higher
				if (num > highest) {
					//store result
					highest = num;
					spot = i;
				}
			}
			//output next highest
			System.out.println(IDs.get(spot) + "\t" + scores.get(spot));
			//remove score just printed
			scores.remove(spot);
			IDs.remove(spot);
		}

	}

}

/* Sample Output

ID	Score
365	265
306	262
115	257
311	256
123	253
325	246
116	246
323	245
321	245
113	243
218	243
208	242
302	242
104	239
112	239
110	238
223	230
213	229
207	228
203	224
222	223

*/
