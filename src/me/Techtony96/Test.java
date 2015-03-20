package me.Techtony96;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3 };
		int k = 0;
		int key = 10;
		while ((k < A.length ) && (A[k] != key))
			k++;
		if (A[k] == key) {
			System.out.println("T");
		}

		System.out.println("F");
	}

}
