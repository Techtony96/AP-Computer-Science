package me.Techtony96;

import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Round;

public class MilesPerGallon {
	/*
	 * This program is designed to find the miles per gallon of each car and
	 * round each number to the tenths place.
	 */

	public static void main(String[] args) {

		System.out.println("Miles Per Gallon:");
		System.out.println("1970 VW Bug: " + Round.tenths((double) 286 / 9));
		System.out.println("1979 Firebird: " + Round.tenths((double) 412 / 40));
		System.out.println("1980 Subaru: " + Round.tenths((double) 361 / 18));
		System.out.println("1975 Cutlass: " + Round.tenths((double) 161 / 11));

		BlockLetters.TONY_PAPPAS.outputBlockName();

	}

}
/* Sample Output

Miles Per Gallon:
1970 VW Bug: 31.8
1979 Firebird: 10.3
1980 Subaru: 20.1
1975 Cutlass: 14.6
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 

*/