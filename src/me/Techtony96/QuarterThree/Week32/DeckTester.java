package me.Techtony96.QuarterThree.Week32;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = { "ace", "king", "queen", "jack", "10", "9", "8", "7", "6", "5", "4", "3", "2" };
		String[] suits = { "spades", "hearts", "diamonds", "clubs" };
		int[] pointValues = { 11, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2 };
		Deck d = new Deck(ranks, suits, pointValues);
	}
}

//Question 4: No, the deck is shufffled