package me.Techtony96.QuarterTwo;

import me.Techtony96.Utilities.BlockLetters;

public class MultiplesOf3And7_230A {

	/* Program Name: Multiples of 3 and 7
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/27/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find multiples of 3 or 7 under 100
	 */

	public static void main(String[] args) {

		System.out.println("Integers less than 100 that are evenly divisible by 3 or 7");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 || i % 7 == 0)
				System.out.println(i);
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
|| statement (or)

Difficulties I had:
None

Sample Output:
Integers less than 100 that are evenly divisible by 3 or 7
3
6
7
9
12
14
15
18
21
24
27
28
30
33
35
36
39
42
45
48
49
51
54
56
57
60
63
66
69
70
72
75
77
78
81
84
87
90
91
93
96
98
99
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */