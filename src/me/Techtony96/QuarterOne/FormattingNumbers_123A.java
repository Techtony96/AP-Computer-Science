package me.Techtony96.QuarterOne;

import me.Techtony96.Utilities.BlockLetters;

public class FormattingNumbers_123A {

	/* Program Name: Formatting Numbers
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/7/14
	 * Platform: Java 1.6
	 * 
	 * Description: Format numbers in a correct output
	 */

	public static void main(String[] args) {
		//Define New stringBuilder
		StringBuilder sb = new StringBuilder();
		//Loop from 1 to 25
		for (int i = 1; i <= 25; i++) {
			//Find the length of the current int
			int currentLength = String.valueOf(i).length();
			//Find the space needed to make the numbers in neat columns
			int space = 5 - currentLength;
			//Add the number to the current working string
			sb.append(i);
			//Add the correct number of spaces
			for (int a = 1; a <= space; a++) {
				sb.append(" ");
			}
			//If I have done 5 numbers output the line and clear the current working string.
			if (i % 5 == 0) {
				System.out.println(sb.toString());
				sb.delete(0, sb.length());
			}
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
I am not sure how we are supposed to do this without the string builder, I would actually be really interested to see how you wanted us to solve this.
Getting the length of each int, ie 1 is 1, 10 is 2, 500 is 3, etc. and String Builder are the two things im 99% sure we have not learned yet.

Difficulties I had:
None.

Sample Output:
1    2    3    4    5    
6    7    8    9    10   
11   12   13   14   15   
16   17   18   19   20   
21   22   23   24   25   
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
