package me.Techtony96.QuarterThree.Week22;

import me.Techtony96.Utilities.Circle;

public class Mathey {

	/**
	 * Find the hypotenuse of a triangle
	 * Requirement: Must be a right triangle
	 * @param a
	 * @param b
	 * @return length of C
	 */
	public static double PythagoreanTheoremC(double a, double b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	/**
	 * Find the area of a circle
	 * @param radius
	 * @return Area
	 */
	public static double AreaOfACircle(double r) {
		return Math.PI * Math.pow(r, 2);
	}
	/**
	 * Find the area of a circle
	 * @param circle
	 * @return Area
	 */
	public static double AreaOfACircle(Circle c) {
		return c.getArea();
	}

	/**
	 * Find the volume of a Sphere
	 * @param radius
	 * @return Volume
	 */
	public static double VolumeOfASphere(double r){
		return Math.PI * (4.0/3.0) * Math.pow(r, 3);
	}
	
	/**
	 * Find the Area of the square provided
	 * @param length
	 * @return Area
	 */
	public static double AreaOfASquare(double l){
		return Math.pow(l, 2);
	}
	
	/**
	 * Find the volume of a rectangular prism
	 * @param length
	 * @param width
	 * @param height
	 * @return Volume
	 */
	public static double VolumeOfAPrism(double l, double w, double h){
		return l*w*h;
	}
	
	/**
	 * Find the volume of a rectangular prism with a square base
	 * @param l
	 * @param h
	 * @return Volume
	 */
	public static double VolumeOfAPrism(double l, double h){
		return Math.pow(l, 2) * h;
	}
}
