package me.Techtony96.QuarterOne;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Round;

public class SquareVsSquared_122A {
	
	/* Program Name: Squares vs Squared
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9/30/14
	 * Platform: Java 1.6
	 * 
	 * Description: Comparing squares and square roots
	 */
	

	public static void main(String[] args) {
		//Define new scanner for user input
		Scanner in = new Scanner(System.in);
		System.out.println("Number  Square  Squareroot");
		//Loop from 1 to 40
		for (int i = 1; i <= 40; i++){
			//Help with formatting, if the current number is less than 10, add an extra space.
			if (i < 10){
				//Output the current number, squared, and square root
				System.out.println(i + "       " + Math.pow(i, 2) + "       " + Round.thousandths(Math.pow(i, .5)));
			} else {
				System.out.println(i + "      " + Math.pow(i, 2) + "      " + Round.thousandths(Math.pow(i, .5)));
			}
			
		}
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();	
	}
	
	

}
/*
What I Learned:
if statements :D

Difficulties I had:
Formatting output

Sample Output:
Number  Square  Squareroot
1       1.0       1.0
2       4.0       1.414
3       9.0       1.732
4       16.0       2.0
5       25.0       2.236
6       36.0       2.449
7       49.0       2.646
8       64.0       2.828
9       81.0       3.0
10      100.0      3.162
11      121.0      3.317
12      144.0      3.464
13      169.0      3.606
14      196.0      3.742
15      225.0      3.873
16      256.0      4.0
17      289.0      4.123
18      324.0      4.243
19      361.0      4.359
20      400.0      4.472
21      441.0      4.583
22      484.0      4.69
23      529.0      4.796
24      576.0      4.899
25      625.0      5.0
26      676.0      5.099
27      729.0      5.196
28      784.0      5.292
29      841.0      5.385
30      900.0      5.477
31      961.0      5.568
32      1024.0      5.657
33      1089.0      5.745
34      1156.0      5.831
35      1225.0      5.916
36      1296.0      6.0
37      1369.0      6.083
38      1444.0      6.164
39      1521.0      6.245
40      1600.0      6.325
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
