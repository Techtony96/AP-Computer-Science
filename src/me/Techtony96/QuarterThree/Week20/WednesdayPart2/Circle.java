package me.Techtony96.QuarterThree.Week20.WednesdayPart2;

public class Circle {
	private static final double PI = 3.14;
	private double radius;

	/**
	 * constructor pre: none post: A Circle object created. Radius initialized
	 * to 1.
	 */
	public Circle() {
		radius = 1; //default radius
	}
	
	public Circle(double r) {
		radius = r;
	}

	/**
	 * Changes the radius of the circle. pre: none post: Radius has been
	 * changed.
	 */
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	/**
	 * Calculates the area of the circle. pre: none post: The area of the circle
	 * has been returned.
	 */
	public double area() {
		double circleArea;
		circleArea = PI * radius * radius;
		return (circleArea);
	}
	
	public void displayAreaFormula(){
		System.out.println("Circle radius: " + radius + " Circle area: " + area());
		System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}

	/**
	 * Returns the radius of the circle. pre: none post: The radius of the
	 * circle has been returned.
	 */
	public double getRadius() {
		return (radius);
	}
	
	public double circumference() {
		return 2 * PI * radius;
	}
	
	public boolean equals(Circle c){
		return getRadius() == c.getRadius();
	}
	
	public String toString(){
		return "Circle has radius " + radius;
	}
}