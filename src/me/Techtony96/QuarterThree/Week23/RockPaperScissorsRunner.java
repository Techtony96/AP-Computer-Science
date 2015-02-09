package me.Techtony96.QuarterThree.Week23;

import java.util.Scanner;

public class RockPaperScissorsRunner {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String args[]){
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.print("Please enter your name: ");
		Player p = new Player(in.nextLine());
		Game rps = new Game();
		while (true){
			if (rps.continueGame() == false){
				break;
			}
			p.makeThrow();
			rps.announceWinner(p);
		}
		//Extra Credit - Start a new game?
		p = null;
		rps = null;
		System.out.print("Play again? (true/false): ");
		if (in.nextBoolean()){
			System.out.println("Starting new game...\n");
			in.nextLine();
			main(null);
		} else {
			System.out.println("Good bye!");
			System.exit(0);
		}
	}

}
/*
Sample Output

Welcome to Rock Paper Scissors!
Please enter your name: Tony
Choose either Rock(1), Paper(2), Scissors(3), or Quit(-1): 1
Tony threw Rock and the computer threw Paper.
The computer won!
Choose either Rock(1), Paper(2), Scissors(3), or Quit(-1): 2
Tony threw Paper and the computer threw Scissors.
The computer won!
Choose either Rock(1), Paper(2), Scissors(3), or Quit(-1): 3
Tony threw Scissors and the computer threw Paper.
Tony won!
Choose either Rock(1), Paper(2), Scissors(3), or Quit(-1): -1
The computer beat Tony 2 to 1.
Play again? (true/false): true
Starting new game...

Welcome to Rock Paper Scissors!
Please enter your name: Tony
Choose either Rock(1), Paper(2), Scissors(3), or Quit(-1): -1
Tony and the computer tied 0 to 0.
Play again? (true/false): false
Good bye!


*/