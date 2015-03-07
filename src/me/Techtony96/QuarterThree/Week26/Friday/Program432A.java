package me.Techtony96.QuarterThree.Week26.Friday;

import java.util.Scanner;

import me.Techtony96.Utilities.Round;

public class Program432A {

	static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {
		//prompt
		System.out.println("Convert your weight on earth to:");
		//output list
		for (Destination d : Destination.values()) {
			System.out.print(d.getChoice() + ". " + d.name() + "\n");
		}
		//prompt for user input
		System.out.print("Select a destination by number: ");
		//define destination answer
		int destination = in.nextInt();
		//loop through values
		for (Destination d : Destination.values()) {
			//if it is the current dest and is not quit
			if (d.getChoice() == destination && d != Destination.Quit) {
				//ask user for their weight
				System.out.print("Enter your weight: ");
				//define weight
				int weight = in.nextInt();
				//give answer
				System.out.println("Your weight on " + d.name() + " would be " + Round.tenths(weight * d.getValue()) + " pounds.\n");
				break;
			} else if (d == Destination.Quit) {
				//quit program
				System.out.println("Bye!");
				System.exit(0);
			}
		}
		//restart program
		main(null);
	}

	//Destination ENUM
	private enum Destination {
		Mercury(1, 0.27),
		Venus(2, 0.85),
		Moon(3, 0.16),
		Mars(4, 0.38),
		Jupiter(5, 2.64),
		Saturn(6, 1.17),
		Neptune(7, 1.12),
		Pluto(8, .25),
		Quit(9, 0);

		double i;
		int choice;

		Destination(int choice, double i) {
			this.choice = choice;
			this.i = i;
		}

		public int getChoice() {
			return choice;
		}

		public double getValue() {
			return i;
		}

	}

}
/* Sample Output

Convert your weight on earth to:
1. Mercury
2. Venus
3. Moon
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Quit
Select a destination by number: 5
Enter your weight: 100
Your weight on Jupiter would be 264.0 pounds.

Convert your weight on earth to:
1. Mercury
2. Venus
3. Moon
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Quit
Select a destination by number: 9
Bye!

*/
