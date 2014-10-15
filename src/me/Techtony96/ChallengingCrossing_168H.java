package me.Techtony96;

import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class ChallengingCrossing_168H {

	/* Program Name: Challenging Crossing
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/15/14
	 * Platform: Java 1.6
	 * 
	 * Description: Make a giant X
	 */

	static Scanner in = new Scanner(System.in);
	static DecimalFormat format = new DecimalFormat("00");

	public static void main(String[] args) {
		//Define spaceing
		int space = 21;
		int leftSpace = 0;
		
		//define starting numbers
		int left = 1;
		int right = 1;
		
		//first loop for top of the x
		while(space >= 0){
			//Printing out the correct amount of leftspace
			for (int i = 1; i <= leftSpace; i++){
				System.out.print(" ");
			}
			//outputting the number for the line on the left
			System.out.print(format.format(left));
			//incrementing the left number for the next line
			left++;
			//printing out the correct amount of space inbetween numbers
			for (int i = 1; i <= space; i++){
				System.out.print(" ");
			}
			//output the nuber for the line on the right
			System.out.println(format.format(right));
			//incrementing the right number for the next line
			right++;
			//changing spacing for next line
			space-=2;
			leftSpace++;
		}
		//loop for spacing for center number
		for (int i = 1; i <= leftSpace; i++){
			System.out.print(" ");
		}
		//output center number
		System.out.println(format.format(left));
		left++;
		right++;
		//redefine spacing
		leftSpace = 10;
		space = 1;
		//loop for bottom
		while (leftSpace >= 0){
			//loop for left space
			for (int i = 1; i <= leftSpace; i++){
				System.out.print(" ");
			}
			//number output
			System.out.print(format.format(right));
			//incrementing
			right++;
			//outputting space
			for (int i = 1; i <= space; i++){
				System.out.print(" ");
			}
			//outputting line number
			System.out.println(format.format(left));
			//incrementing
			left++;
			space +=2;
			leftSpace--;
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}



}
/*
What I Learned:
LOOPS >:(

Difficulties I had:
Everything. From formatting to correct loop. Nothing syntax based, but everything else possible.
Also getting the 12 to line up is impossible. That made me mad too.

Sample Output:
01                     01
 02                   02
  03                 03
   04               04
    05             05
     06           06
      07         07
       08       08
        09     09
         10   10
          11 11
           12
          13 13
         14   14
        15     15
       16       16
      17         17
     18           18
    19             19
   20               20
  21                 21
 22                   22
23                     23
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
