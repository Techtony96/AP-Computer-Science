package me.Techtony96.Utilities;

public class Order {
	
	public static boolean isBetween(int x, int lower, int upper) {
		return lower <= x && x <= upper;
	}

	public static boolean isBetween(double x, int lower, int upper) {
		return lower <= x && x <= upper;
	}

}
