package me.Techtony96.QuarterThree.Week32;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("rank", "diamond", 5);
		Card two = new Card("rank", "heart", 7);
		Card three = new Card("rank", "diamond", 5);
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println("Does one match three?");
		System.out.println(one.matches(three) ? "yes" : "no");
		
	}
}