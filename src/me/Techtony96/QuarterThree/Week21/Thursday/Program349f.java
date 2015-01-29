package me.Techtony96.QuarterThree.Week21.Thursday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program349f {
	
	/* Program Name: Final Grades
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 1/29/14
	 * Platform: Java 1.6
	 * 
	 * Description: Output and calculate user grades
	 */

	public static void main(String[] args) {
		//new file that we are getting data from
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog349f.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}
		//output table header
		System.out.println("Student\tQuiz1\tQuiz2\tMidTerm\tFinal\tFinal%\tGrade");
		//define student number
		int student = 1;
		//loop through file
		while (inFile.hasNext()) {
			//get current line and convert it to a string array
			String[] grades = inFile.nextLine().split(" ");
			//Define individual variables for each number
			int quiz1 = Integer.valueOf(grades[0]);
			int quiz2 = Integer.valueOf(grades[1]);
			int midterm = Integer.valueOf(grades[2]);
			int Final = Integer.valueOf(grades[3]);
			//calculate final grade
			double finalPercent = ((quiz1*10 + quiz2*10) / 2.0) * .25 + midterm * .25 + Final * .5;
			//output results to table ->																							 //Output letter grade
			System.out.println(student + "\t" + quiz1 + "\t" + quiz2 + "\t" + midterm + "\t" + Final + "\t" + finalPercent + "\t" + (finalPercent >= 90 ? "A" : finalPercent >= 80 ? "B" : finalPercent >= 70 ? "C" : finalPercent >= 60 ? "D" : "F"));
			//increment student number
			student++;
		}
	}

}
/*
Sample output: (ouput is correctly lined up in console)

Student	Quiz1	Quiz2	MidTerm	Final	Final%	Grade
1	8	7	89	94	88.0	B
2	9	6	77	90	83.0	B
3	10	10	65	88	85.25	B
4	7	5	80	81	75.5	C

*/