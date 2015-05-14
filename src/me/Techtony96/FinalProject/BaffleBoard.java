package me.Techtony96.FinalProject;

import java.util.ArrayList;

import me.Techtony96.FinalProject.Buttons.HistoryButton;
import me.Techtony96.FinalProject.Buttons.types.BaffleButton;
import me.Techtony96.FinalProject.Buttons.types.GuessButton;
import me.Techtony96.FinalProject.Buttons.types.LaserButton;
import me.Techtony96.FinalProject.Buttons.types.TextButton;
import me.Techtony96.FinalProject.Enums.Baffle;
import me.Techtony96.FinalProject.Enums.Direction;
import me.Techtony96.FinalProject.Resources.StdDraw;
import me.Techtony96.Utilities.RandomUtil;

public class BaffleBoard {

	private Baffle[][] board = new Baffle[10][10];
	private ArrayList<BaffleButton> buttons = new ArrayList<>();
	private int score;

	public BaffleBoard(int numberOfBaffles) {
		/*
		 * Initialize the board with empty values
		 */
		for (int row = 0; row < board.length; row++)
			for (int column = 0; column < board[0].length; column++)
				board[row][column] = Baffle.EMPTY;

		intGUI();

		/*
		 * Put in random baffles at random locations
		 */
		int count = 0;
		while (count < numberOfBaffles) {
			int row = RandomUtil.randInt(0, 9);
			int column = RandomUtil.randInt(0, 9);
			if (board[row][column] == Baffle.EMPTY) {
				board[row][column] = getRandomBaffle();
				count++;
			}

		}
		/*
		 * Fill the board with the guessable buttons
		 */
		for (int row = 0; row < board.length; row++)
			for (int column = 0; column < board[0].length; column++){
				buttons.add(new GuessButton(column * 10, row * 10, board[row][column]));
			}
				
		
		//Uncomment to enable cheats.
		//(Ability to see baffles)
		//drawBaffles();

	}

	/*
	 * Make the default GUI
	 */
	private void intGUI() {
		//set window size/scale
		StdDraw.setScale(-25.0, 125.0);
		//draw the grid
		for (int x = 0; x <= 10; x++) {
			StdDraw.line(0.0, 10 * x, 100.0, 10 * x);
		}
		for (int y = 0; y <= 10; y++) {
			StdDraw.line(10 * y, 0.0, 10 * y, 100.0);
		}
		//add all the text (numbers) around the grid
		for (int x = 0; x < 10; ++x) {
			StdDraw.text(-5.0, 10 * x + 5, "" + x);
			buttons.add(new LaserButton(x, -5.0, 10 * x + 5));
		}
		for (int x = 0; x < 10; ++x) {
			StdDraw.text(10 * x + 5, 105.0, "" + (x + 10));
			buttons.add(new LaserButton(x + 10, 10 * x + 5, 105.0));
		}
		for (int x = 0; x < 10; ++x) {
			StdDraw.text(105.0, 10 * (10 - x) - 5, "" + (x + 20));
			buttons.add(new LaserButton(x + 20, 105.0, 10 * (10 - x) - 5));
		}
		for (int x = 0; x < 10; ++x) {
			StdDraw.text(10 * (10 - x) - 5, -5.0, "" + (x + 30));
			buttons.add(new LaserButton(x + 30, 10 * (10 - x) - 5, -5.0 ));
		}
		//Draw the buttons/score
		StdDraw.text(0, 115, "View History");
		buttons.add(new HistoryButton());
		StdDraw.text(40, 115, "Score: ");
		//init score to 0
		setScore(0);
	}

	//method to get random baffle
	private Baffle getRandomBaffle() {
		return (RandomUtil.randInt(0, 1) == 0) ? Baffle.NEG : Baffle.POS;
	}

	
	//Get the next of the given X,Y cord
	public int[] getIndex(int x, int y, Direction m) {
		switch (m) {
		case NORTH:
			return new int[] { x + 1, y };
		case SOUTH:
			return new int[] { x - 1, y };
		case EAST:
			return new int[] { x, y + 1 };
		case WEST:
			return new int[] { x, y - 1 };

		}
		return new int[] { x, y };
	}

	//Cheat method to show where all baffles are
	public void drawBaffles() {
		for (int row = 0; row < 10; row++) {
			for (int column = 0; column < 10; column++) {
				if (board[row][column] != Baffle.EMPTY) {
					Baffle baf = board[row][column];
					if (baf == Baffle.POS) {
						StdDraw.line(column * 10, 90 - row * 10, column * 10 + 10, 90 - row * 10 + 10);
					} else {
						StdDraw.line(column * 10, 90-  row * 10 + 10, column * 10 + 10, 90 - row * 10);
					}
				}
				continue;
			}
		}
	}

	//get starting direction from a given starting spot
	public Direction getDirection(int spot) {
		if (spot >= 0 && spot <= 9) {
			return Direction.EAST;
		}
		if (spot >= 10 && spot <= 19) {
			return Direction.SOUTH;
		}
		if (spot >= 20 && spot <= 29) {
			return Direction.WEST;
		}
		if (spot >= 30 && spot <= 39) {
			return Direction.NORTH;
		}
		return null;
	}

	/**
	 * 
	 * @param spot
	 * @return an array of 2 integers in the format column, row
	 */
	public int[] getIndex(int spot) {
		switch (spot) {
		case 0:
		case 39:
			return new int[] { 0, 9 };
		case 9:
		case 10:
			return new int[] { 0, 0 };
		case 19:
		case 20:
			return new int[] { 9, 0 };
		case 29:
		case 30:
			return new int[] { 9, 9 };

		case 1:
			return new int[] { 0, 8 };
		case 2:
			return new int[] { 0, 7 };
		case 3:
			return new int[] { 0, 6 };
		case 4:
			return new int[] { 0, 5 };
		case 5:
			return new int[] { 0, 4 };
		case 6:
			return new int[] { 0, 3 };
		case 7:
			return new int[] { 0, 2 };
		case 8:
			return new int[] { 0, 1 };

		case 11:
			return new int[] { 1, 0 };
		case 12:
			return new int[] { 2, 0 };
		case 13:
			return new int[] { 3, 0 };
		case 14:
			return new int[] { 4, 0 };
		case 15:
			return new int[] { 5, 0 };
		case 16:
			return new int[] { 6, 0 };
		case 17:
			return new int[] { 7, 0 };
		case 18:
			return new int[] { 8, 0 };

		case 21:
			return new int[] { 9, 1 };
		case 22:
			return new int[] { 9, 2 };
		case 23:
			return new int[] { 9, 3 };
		case 24:
			return new int[] { 9, 4 };
		case 25:
			return new int[] { 9, 5 };
		case 26:
			return new int[] { 9, 6 };
		case 27:
			return new int[] { 9, 7 };
		case 28:
			return new int[] { 9, 8 };

		case 31:
			return new int[] { 8, 9 };
		case 32:
			return new int[] { 7, 9 };
		case 33:
			return new int[] { 6, 9 };
		case 34:
			return new int[] { 5, 9 };
		case 35:
			return new int[] { 4, 9 };
		case 36:
			return new int[] { 3, 9 };
		case 37:
			return new int[] { 2, 9 };
		case 38:
			return new int[] { 1, 9 };
		}
		return null;
	}
	
	//get a spot when right next to the edge
	public int getSpot(int column, int row, Direction dir){
		for (int i = 0; i<=40;i++){
			int[] index = getIndex(i);
			if (index[0] == column && index[1] == row){
				if (i == 0 || i == 39){
					if (dir == Direction.WEST){
						return 0;
					}
					return 39;
				}
				if (i == 9 || i == 10){
					if (dir == Direction.NORTH){
						return 10;
					}
					return 9;
				}
				if (i == 19 || i == 20){
					if (dir == Direction.EAST){
						return 20;
					}
					return 19;
				}
				if (i == 29 || i == 30){
					if (dir == Direction.SOUTH){
						return 30;
					}
					return 29;
				}
				return i;
			}
		}
		return 0;
	}

	//Get the next index in a given direction
	public int[] getNext(int column, int row, Direction dir) {
		switch (dir) {
		case NORTH:
			return new int[] { column, row - 1 };
		case SOUTH:
			return new int[] { column, row + 1 };
		case EAST:
			return new int[] { column + 1, row };
		case WEST:
			return new int[] { column - 1, row };
		}
		return null;
	}
	
	//Check if there is another index or if we are at the edge
	public boolean hasNext(int column, int row, Direction dir){
		switch (dir) {
		case NORTH:
			return row == 0 ? false : true;
		case SOUTH:
			return row == 9 ? false : true;
		case WEST:
			return column == 0 ? false : true;
		case EAST:
			return column == 9 ? false : true;
		}
		return false;
	} 
	
	//get the baffle at the given location
	public Baffle getBaffle(int column, int row){
		return board[row][column];
	}
	
	//get all the buttons
	public ArrayList<BaffleButton> getButtons(){
		return buttons;
	}
	
	//get the player's score
	public int getScore(){
		return score;
	}
	
	//set the players score and update it on the GUI
	public void setScore(int score){
		this.score = score;
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledRectangle(55, 115, 5, 5);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(55, 115, "" + getScore());
	}
	
	//method to change the players score by a given amount
	public void updateScore(int amount){
		setScore(getScore() + amount);
	}

}
