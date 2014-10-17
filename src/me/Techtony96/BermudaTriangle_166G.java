package me.Techtony96;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class BermudaTriangle_166G {

	/* Program Name: Bermuda Triangle
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/17/14
	 * Platform: Java 1.6
	 * 
	 * Description: Make a multiplication chart
	 */

	static DecimalFormat decFormat = new DecimalFormat("00");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter # of Rows");
		int rows = in.nextInt();
		for (int column = 1; column <= rows; column++){
			for (int row = 1; row <= column; row++){
				if (row == 1 && column == 1){
					for (int i = 1; i<= rows; i++){
						System.out.print(decFormat.format(i) + "    ");
					}
				} else {
					if (column == 1){
						System.out.print(decFormat.format(row) + "    ");
					} else {
						System.out.print(decFormat.format(column*row) + "    ");
					}
				}
			}
			System.out.println("");
		}
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}



}
/*
What I Learned:
How to use loops to make a table and fill it with information

Difficulties I had:
None

Sample Output:
Enter # of Rows
9
01    02    03    04    05    06    07    08    09    
02    04    
03    06    09    
04    08    12    16    
05    10    15    20    25    
06    12    18    24    30    36    
07    14    21    28    35    42    49    
08    16    24    32    40    48    56    64    
09    18    27    36    45    54    63    72    81    
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
