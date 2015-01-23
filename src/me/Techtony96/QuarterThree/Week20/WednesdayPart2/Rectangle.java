package me.Techtony96.QuarterThree.Week20.WednesdayPart2;

public class Rectangle {
	private double l;
	private double w;

	/**
	 * constructor pre: none post: A Circle object created. Radius initialized
	 * to 1.
	 */
	public Rectangle() {
		l = 1; //default length
		w = 1; //default width
	}
	
	public Rectangle(double length, double width) {
		l = length;
		w = width;
	}

	/**
	 * Calculates the area of the circle. pre: none post: The area of the circle
	 * has been returned.
	 */
	public double area() {
		return (l*w);
	}
	
	public void displayAreaFormula(){
		System.out.println("Rectangle Length: " + l + " Rectangle Width: " + w + " Rectangle Area: " + area());
		System.out.println("The formula for the area of a rectangle is a=l*w");
	}
	
	public boolean equals(Rectangle r){
		return l == r.l && w == r.w;
	}
	
	public String toString(){
		return "Rectangle has length " + l + " and width " + w;
	}
}