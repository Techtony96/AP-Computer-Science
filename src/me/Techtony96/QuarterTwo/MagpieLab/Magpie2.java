package me.Techtony96.QuarterTwo.MagpieLab;

/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>
 * Uses indexOf to find strings</li>
 * <li>
 * Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		statement = statement.toLowerCase();
		if (findKeyword(statement, "no") >= 0) {
			response = "Why so negative?";
		} else if (findKeyword(statement, "mother") >= 0 || findKeyword(statement, "father") >= 0 || findKeyword(statement, "sister") >= 0 || findKeyword(statement, "brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (findKeyword(statement, "dog") >= 0 || findKeyword(statement, "cat") >= 0) {
			response = "Tell me more about your pets.";
		} else if (findKeyword(statement, "mr. ") >= 0 || findKeyword(statement, "ms. ") >= 0) {
			response = "He sounds like a good teacher.";
		} else if (findKeyword(statement, "summer") >= 0 || findKeyword(statement, "sun") >= 0) {
			response = "I like summer time too!";
		} else if (findKeyword(statement, "christmas") >= 0 || findKeyword(statement, "snow") >= 0) {
			response = "Winter is too cold for me!";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	//What happens when more than one keyword appears in a string? Consider the string “My mother has a dog but no cat.” Explain how to prioritize responses in 			the reply method.
	// It defaults to whatever comes first in the if else if else tree.

	//What happens when a keyword is included in another word?
	//It thinks the keyword is a word and not in another word so it outputs the statement.

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "Oh really?";
		} else if (whichResponse == 5) {
			response = "I don't understand";
		}

		return response;
	}

	private int findKeyword(String statement, String goal) {
		String phrase = statement.trim();
		//The only change to incorporate the startPso is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), 0);
		//Refinement – make sure the goal is not part of a word
		while (psn >= 0) {
			//Find the string of length 1 before and after the word
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}// If before and after are not letters, we have found the word
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
				return psn;
			}
			// The last position did not work so let’s find the next one if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
		}
		return -1;
	}
}