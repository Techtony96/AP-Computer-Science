package me.Techtony96.QuarterTwo;

import me.Techtony96.Utilities.BlockLetters;

public class UlamHypothesis_230B {
	 
	/* Program Name: Ulam Hypothesis
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/5/14
	 * Platform: Java 1.6
	 * 
	 * Description: Test Ulam Hupothesis
	 */
	

	public static void main(String[] args) {
		//define variable to manipulate
		int currentNumber;
		//define loop to test numbers 1 - 25
		for (int i = 1; i <= 25; i++){
			//set currentNumber to i
			currentNumber = i;
			//output beginning of table
			System.out.print(currentNumber + ": ");
			//while the number is more than 1
			while (currentNumber > 1){
				//test if the number is even
				if (currentNumber % 2 == 0){
					//number is even
					currentNumber /= 2;
					System.out.print(currentNumber + " ");
				} else {
					//number is odd
					currentNumber *= 3;
					currentNumber += 1;
					System.out.print(currentNumber + " ");
				}
			}
			//output line break
			System.out.print("\n");
		}	
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	

}
/*
What I Learned:
1 is already at 1, so no work should need to be done.

Difficulties I had:
None

Sample Output:
1: 
2: 1 
3: 10 5 16 8 4 2 1 
4: 2 1 
5: 16 8 4 2 1 
6: 3 10 5 16 8 4 2 1 
7: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
8: 4 2 1 
9: 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
10: 5 16 8 4 2 1 
11: 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
12: 6 3 10 5 16 8 4 2 1 
13: 40 20 10 5 16 8 4 2 1 
14: 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
15: 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
16: 8 4 2 1 
17: 52 26 13 40 20 10 5 16 8 4 2 1 
18: 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
19: 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
20: 10 5 16 8 4 2 1 
21: 64 32 16 8 4 2 1 
22: 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
23: 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
24: 12 6 3 10 5 16 8 4 2 1 
25: 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */