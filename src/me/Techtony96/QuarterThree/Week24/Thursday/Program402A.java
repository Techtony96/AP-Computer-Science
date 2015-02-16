package me.Techtony96.QuarterThree.Week24.Thursday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import me.Techtony96.Utilities.Round;

public class Program402A {
	
	/* Program Name: Scores and Differences
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 2/16/15
	 * Platform: Java 1.6
	 */
	
	public static void main(String args[]){
		String[] info = new String[21];
		
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prg402a.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}
		//define counting variable
		int i = 0;
		//loop through file
		while (inFile.hasNext()){
			//store file info
			info[i] = inFile.nextLine();
			i++;
		}
		//define total variable
		int total = 0;
		//find the total
		for (String s : info){
			total += Integer.valueOf(s.split(" ")[1]);
		}
		
		//calculate the average
		double average = (double) total/i;
		
		//output results
		System.out.println("Sum= \t" + total);
		System.out.println("Average=" + Round.hundredths(average));
		System.out.println("Count= \t" + i);
		
		//table
		System.out.println("ID\tScore\tDifference");
		for (String s : info){
			String[] sp = s.split(" ");
			System.out.println(sp[0] + "\t" + sp[1] + "\t" + (Round.hundredths(Integer.valueOf(sp[1])- average)));
		}
		
	}

}

/* Sample Output

Sum= 	5095
Average=242.62
Count= 	21
ID	Score	Difference
115	257	14.38
123	253	10.38
116	246	3.38
113	243	0.38
112	239	-3.61
104	239	-3.61
110	238	-4.61
218	243	0.38
208	242	-0.61
222	223	-19.61
223	230	-12.61
213	229	-13.61
207	228	-14.61
203	224	-18.61
305	265	22.38
306	262	19.38
311	256	13.38
325	246	3.38
321	245	2.38
323	245	2.38
302	242	-0.61

*/
