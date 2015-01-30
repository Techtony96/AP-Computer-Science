package me.Techtony96.QuarterThree.Week21.Friday.Assignment2;

public class GameBoothTester {

	public static void main(String[] args) {
		GameBooth balloonDartToss = new GameBooth(2, "tiger plush", "sticker");
		GameBooth ringToss = new GameBooth(2, "bear keychain", "pencil");
		GameBooth breakAPlate = new GameBooth(1.5, "pig plush", "plastic dinosaur");
		Player shonda = new Player(5); //$5 spending money..1
		Player luis = new Player(3); //$3 spending money
		System.out.print("Shonda goes to Balloon Dart Toss. ");
		System.out.println(shonda.play(balloonDartToss));
		System.out.print("Luis goes to Ring Toss. ");
		System.out.println(luis.play(ringToss));
		System.out.print("Shonda goes to Ring Toss. ");
		System.out.println(shonda.play(ringToss));
		System.out.print("Luis goes to Break A Plate. ");
		System.out.println(luis.play(breakAPlate));
		System.out.println("Shonda " + shonda);
		System.out.println("Luis" + luis);
		balloonDartToss.prizesAwarded();
		ringToss.prizesAwarded();
		breakAPlate.prizesAwarded();
	}

}

/* Sample output

Shonda goes to Balloon Dart Toss. prize won: sticker
Luis goes to Ring Toss. prize won: pencil
Shonda goes to Ring Toss. prize won: pencil
Luis goes to Break A Plate. Sorry, not enough money to play.
Shonda has $1.0 left and has won pencil sticker null prizes.
Luishas $1.0 left and has won pencil null prizes.
First Place Prizes Awarded: 0
Consolation Prizes Awarded: 1
First Place Prizes Awarded: 0
Consolation Prizes Awarded: 2
First Place Prizes Awarded: 0
Consolation Prizes Awarded: 0

*/
