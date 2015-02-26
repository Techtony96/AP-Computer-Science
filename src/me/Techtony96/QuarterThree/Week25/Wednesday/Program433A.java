package me.Techtony96.QuarterThree.Week25.Wednesday;

import java.util.ArrayList;
import java.util.Collections;

import me.Techtony96.Utilities.RandomUtil;

public class Program433A {
	
	public static void main(String args[]){
		//define list
		ArrayList<Integer> list = new ArrayList<Integer>();
		//loop for 20 numbers
		for (int i = 1; i<=20;i++){
			//Initiate current random number
			int cur = RandomUtil.randInt(1, 25);
			//Loop to keep generating random numbers
			while(list.contains(cur)){
				cur = RandomUtil.randInt(1, 25);
			}
			//add it to the list
			list.add(cur);
		}
		//sort the list
		Collections.sort(list);
		
		//output table
		int count = 0;
		for (int i : list){
			System.out.print(i + "\t");
			count++;
			if (count % 5 == 0){
				System.out.print("\n");
			}
		}
		
	}

}
/* Sample Output:

1	2	3	4	5	
6	7	8	9	10	
11	12	15	18	19	
21	22	23	24	25	


*/