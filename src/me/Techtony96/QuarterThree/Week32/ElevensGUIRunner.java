package me.Techtony96.QuarterThree.Week32;
/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}

/*

1. Because the size method does the same thing, returns the variable BOARD_SIZE.

2. It is done the same way no matter what the game is

3. Yes and no, because in interfaces you can not have methods, so in this case it wont work but in other instances it might.


*/