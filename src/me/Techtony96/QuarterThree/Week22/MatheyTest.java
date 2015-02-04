package me.Techtony96.QuarterThree.Week22;

import me.Techtony96.Utilities.Circle;
import me.Techtony96.Utilities.Round;

public class MatheyTest {
	
	public static void main(String args[]){
		//Test Hypotenuse method
		System.out.println("Find the hypotenuse of a triangle with sides 10 and 19");
		System.out.println(Round.hundredths(Mathey.PythagoreanTheoremC(10, 19)));
		//Test area of a circle method
		System.out.println("Find the area of a circle with radius 7");
		System.out.println(Round.hundredths(Mathey.AreaOfACircle(7)));
		System.out.println(Round.hundredths(Mathey.AreaOfACircle(new Circle(7))));
		//test the volume of a sphere method
		System.out.println("Find the volume of a sphere with radius 26");
		System.out.println(Round.hundredths(Mathey.VolumeOfASphere(26)));
		//test the area of a square method
		System.out.println("Find the area of a square with length 10");
		System.out.println(Round.hundredths(Mathey.AreaOfASquare(10)));
		//test the volume of a prism method
		System.out.println("Find the volume of a prism with base 10x10 and height 13");
		System.out.println(Round.hundredths(Mathey.VolumeOfAPrism(10, 13)));
		System.out.println(Round.hundredths(Mathey.VolumeOfAPrism(10, 10, 13)));
	}
}
/*
Sample Output:

Find the hypotenuse of a triangle with sides 10 and 19
21.47
Find the area of a circle with radius 7
153.94
153.94
Find the volume of a sphere with radius 26
73622.18
Find the area of a square with length 10
100.0
Find the volume of a prism with base 10x10 and height 13
1300.0
1300.0


*/