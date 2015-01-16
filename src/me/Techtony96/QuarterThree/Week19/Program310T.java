package me.Techtony96.QuarterThree.Week19;

import java.util.Random;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class Program310T {

	/* Program Name: Charting Sales
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 1/16/15
	 * Platform: Java 1.6
	 * 
	 * Description: Create Graphs
	 */


	static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {
		//output header
		System.out.println("Day \tDaily \tSales Graph");
		//intialize days
		int days = 0;
		//create week loop
		for (int week = 0; week < 5; week++) {
			//create day loop
			for (int day = 1; day < 8 && days < 31; day++) {
				//increment days
				days++;
				//amount in sales
				int sales = 0;
				//if any sunday other than first one
				if (day == 1 && week != 0) {
					//output a return
					System.out.println();
					continue;
				} else if (day == 1){
					//skip if first sunday
					continue;
				} else if (day == 2) {
					sales = getRandomNumber(30000, 40000);
				} else if (day == 3) {
					sales = getRandomNumber(20000, 40000);
				} else if (day == 7) {
					sales = getRandomNumber(10000, 15000);
				} else {
					sales = getRandomNumber(10000, 40000);
				}
				//output results
				System.out.println(days + "\t" + sales + "\t" + makeGraph(sales / 1000));
			}
		}
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	//get a random number
	public static Integer getRandomNumber(int min, int max) {
		Random rand = new Random();
		return (rand.nextInt(max - min + 1) + min);
	}

	//make the * graph
	public static String makeGraph(int amount) {
		String stars = "";
		for (int i = 0; i < amount; i++){
			stars = stars + "*";
		}
		return stars;
	}

}
/*
What I Learned:
Making graphs

Difficulties I had:
None

Sample Output:
Day 	Daily 	Sales Graph
2	38487	**************************************
3	37544	*************************************
4	24854	************************
5	21431	*********************
6	20769	********************
7	10791	**********

9	37208	*************************************
10	26641	**************************
11	38313	**************************************
12	18012	******************
13	29505	*****************************
14	14954	**************

16	37117	*************************************
17	33909	*********************************
18	23870	***********************
19	34162	**********************************
20	38063	**************************************
21	14487	**************

23	34487	**********************************
24	25510	*************************
25	31705	*******************************
26	34059	**********************************
27	30063	******************************
28	11449	***********

30	34202	**********************************
31	21274	*********************
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
