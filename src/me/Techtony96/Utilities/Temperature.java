package me.Techtony96.Utilities;

public class Temperature {

	public static double convertFToC(double F) {
		return ((F - 32.0) * 5.0) / 9.0;
	}

	public static double convertCToF(double C) {
		return (C * 9.0) / 5.0 + 32.0;
	}

}
