package me.Techtony96.FinalProject;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import me.Techtony96.FinalProject.Buttons.types.BaffleButton;
import me.Techtony96.FinalProject.Buttons.types.GuessButton;
import me.Techtony96.FinalProject.Buttons.types.LaserButton;
import me.Techtony96.FinalProject.Buttons.types.TextButton;
import me.Techtony96.FinalProject.Enums.Baffle;
import me.Techtony96.FinalProject.Enums.Direction;
import me.Techtony96.FinalProject.Resources.StdDraw;

public class BaffleBoxGame implements MouseListener {

	//instance variables
	BaffleBoard board;
	ArrayList<String> history = new ArrayList<>();
	private static Object mouseLock = new Object();
	int guessedCorrectly = 0;
	int totalNumber = 0;

	//constructor
	public BaffleBoxGame(int numberOfBaffles) {
		totalNumber = numberOfBaffles;
		board = new BaffleBoard(numberOfBaffles);
		StdDraw.draw.addMouseListener(this);
	}


	//shot the laser from a given spot
	public void shootLaser(int spot) {
		//update player's score
		board.updateScore(-1);
		//get the direction the laser is going
		Direction dir = board.getDirection(spot);
		//get the index
		int[] index = board.getIndex(spot);
		//repeat until it exits the board
		while (true) {
			//check the first baffle if it should bounce
			Baffle curBaffle = board.getBaffle(index[0], index[1]);
			//if baffle is POS or NEG
			if (curBaffle != Baffle.EMPTY) {
				//get new laser direction
				if (curBaffle == Baffle.POS) {
					switch (dir) {
					case NORTH:
						dir = Direction.EAST;
						break;
					case SOUTH:
						dir = Direction.WEST;
						break;
					case EAST:
						dir = Direction.NORTH;
						break;
					case WEST:
						dir = Direction.SOUTH;
						break;
					}
				} else {
					switch (dir) {
					case NORTH:
						dir = Direction.WEST;
						break;
					case SOUTH:
						dir = Direction.EAST;
						break;
					case EAST:
						dir = Direction.SOUTH;
						break;
					case WEST:
						dir = Direction.NORTH;
						break;
					}
				}
			}
			//break if we are at the edge
			if (!board.hasNext(index[0], index[1], dir))
				break;
			//otherwise, get the new index
			index = board.getNext(index[0], index[1], dir);
		}
		//output and store result
		String result = "Entered at " + spot + " and exited at " + board.getSpot(index[0], index[1], dir);
		System.out.println(result);
		history.add(result);
	}

	//print history to the console
	public void displayHistory() {
		if (history.size() == 0) {
			System.out.println("No History");
			return;
		}
		System.out.println("========   HISTORY   ========");
		for (String s : history) {
			System.out.println(s);
		}
		System.out.println("======== END HISTORY ========");
	}

	//Mouse click event in the window
	@Override
	public void mouseClicked(MouseEvent e) {
		synchronized (mouseLock) {
			//Loop through all the buttons
			for (BaffleButton bb : board.getButtons()) {
				if (bb instanceof LaserButton) {
					LaserButton lb = (LaserButton) bb;
					if (Math.abs(StdDraw.mouseX() - lb.getX()) < 5 && Math.abs(StdDraw.mouseY() - lb.getY()) < 5) {
						shootLaser(lb.getSpot());
					}
				} else if (bb instanceof TextButton) {
					TextButton tb = (TextButton) bb;
					if (tb.inside(StdDraw.mouseX(), StdDraw.mouseY())) {
						tb.action();
						
					}
				} else if (bb instanceof GuessButton){
					GuessButton gb = (GuessButton) bb;
					if (gb.isInside(StdDraw.mouseX(), StdDraw.mouseY())){
						if (gb.isGuessed())
							continue;
						if (e.getButton() == 1){
							if (gb.getBaffle() == Baffle.POS){
								board.updateScore(7);
								gb.drawBaffle();
								gb.setGuessed();
								guessedCorrectly++;
								checkWin();
							}else {
								board.updateScore(-3);
							}
						} else if (e.getButton() == 3){
							if (gb.getBaffle() == Baffle.NEG){
								board.updateScore(7);
								gb.drawBaffle();
								gb.setGuessed();
								guessedCorrectly++;
								checkWin();
								
							} else {
								board.updateScore(-3);
							}
						}
					}
				}
			}
        }
	}
	
	//check if the player found all the baffles
	public void checkWin(){
		if (guessedCorrectly >= totalNumber){
			System.out.println("===================");
			System.out.println("=     YOU WIN!    =");
			System.out.println("= Final Score: " + board.getScore() + " =");
			System.out.println("===================");
			System.exit(0);
		}
	}

	//Ignore
	@Override public void mouseEntered(MouseEvent e) {}
	@Override public void mouseExited(MouseEvent e) {}
	@Override public void mousePressed(MouseEvent e) {}
	@Override public void mouseReleased(MouseEvent e) {}

}
