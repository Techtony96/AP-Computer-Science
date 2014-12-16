package me.Techtony96.Utilities;

import java.util.Random;

public class RandomUtil {

	static Random rand = new Random();

	/**
	 * 
	 * @param min
	 *            Minimum Value
	 * @param max
	 *            Maximum Value
	 * @return Random Integer between min and max, Inclusive
	 */
	public static int randInt(int min, int max) {
		return rand.nextInt((max - min) + 1) + min;
	}

	/**
	 * 
	 * @return Random Double between 0 and 1
	 */
	public static double randDouble() {
		return rand.nextDouble();
	}
}
