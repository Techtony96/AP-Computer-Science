package me.Techtony96.QuarterOne;

import me.Techtony96.Utilities.BlockLetters;

public class FunctionChart_122C {
	
	/* Program Name: Function Chart
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9-30-14
	 * Platform: Java 1.6
	 * 
	 * Description: Make a function chart
	 */
	

	public static void main(String[] args) {
		//Define variables for each column and the number that they started in.
		int column1 = 2;
		int column2 = 3;
		int column3 = 4;
		int column4 = 4;
		//Loop through each row
		for (int i=1; i<=5;i++){
			//Output the row
			System.out.println(column1 + "  " + column2 + "  " + column3 + "  " + column4 );
			//Find the next number in the row.
			column1 += 2;
			column2 += 2;
			column3 += 4;
			column4 = column1*column1;
		}
		
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
Looping

Difficulties I had:
Finding the pattern between column4

Sample Output:
2  3  4  4
4  5  8  16
6  7  12  36
8  9  16  64
10  11  20  100
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
