package me.Techtony96.QuarterThree.Week20.WednesdayPart2;

public class TestCircle {

	public static void main(String[] args) {
		Circle spot = new Circle();
		Rectangle r = new Rectangle(5, 3);
		spot.setRadius(3);
		System.out.println("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + spot.circumference());
		System.out.println(spot);
		System.out.println(r);
	}

}
