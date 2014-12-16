package me.Techtony96.QuarterOne;

import me.Techtony96.Utilities.BlockLetters;

public class ClassElection_52H {
	/*
	 * This program will find the number of votes for each person taking part in the election.
	 */

	public static void main(String[] args) {

		//Define initial variables
		int totalVotes = 9485;
		int Mary = 0, Peter = 0, Paul = 0, Joan = 0;

		//Calcualte number of votes for each person
		Mary = (totalVotes + 86 + 23 + 74) / 4;
		Joan = Mary - 86;
		Paul = Mary - 23;
		Peter = Mary - 74;

		//Output results
		System.out.println("Mary won the election which gives her " + Mary + " votes.");
		System.out.println("Peter has 74 less than Mary giving him " + Peter + " votes.");
		System.out.println("Paul has 23 less than Mary giving him " + Paul + " votes.");
		System.out.println("Joan has 86 less than Mary giving her " + Joan + " votes");

		BlockLetters.TONY_PAPPAS.outputBlockName();

	}
}

/* Sample Output

Mary won the election which gives her 2417 votes.
Peter has 74 less than Mary giving him 2343 votes.
Paul has 23 less than Mary giving him 2394 votes.
Joan has 86 less than Mary giving her 2331 votes
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 

*/
