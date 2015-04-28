package me.Techtony96.Utilities;

import java.util.Arrays;

public class UtilArray {
	
	public static void printArray(int[][] array){
		for (int[] row : array) {
			System.out.println(Arrays.toString(row).replace("[", "").replace("]", "").replace(",", "\t"));
		}
	}
	
	public static void printArray(String[][] array){
		for (String[] row : array) {
			System.out.println(Arrays.toString(row).replace("[", "").replace("]", "").replace(",", "\t"));
		}
	}

}
