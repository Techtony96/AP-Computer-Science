package me.Techtony96.QuarterTwo;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class PassingTrains_212A {

	/*
	 * Program Name: Passing Trains 
	 * Version: 1.0
	 * Author: Tony Pappas 
	 * Date: 11/7/14 
	 * Platform: Java 1.6
	 * Description: Find when a train passes another train
	 */

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		//define basic variables
		double freightTrainSpeed_mph = 40;
		double freightTrainTime = 9;
		double passengerTrainSpeed_mph = 80;
		double passengerTrainTime = 11;
		double freightTrainDistance;
		double passengerTrainDistance;
		//loop program 3 times
		for (int i = 1; i <= 3; i++){
			//ask for speed of passenger train
			System.out.println("Enter the speed of the passenger train");
			passengerTrainSpeed_mph = in.nextDouble();
			
			//calculate distance of freight train when passenger train started
			freightTrainDistance = (passengerTrainTime-freightTrainTime) * freightTrainSpeed_mph;
			passengerTrainDistance = 0;
			int hoursPassed = 0;

			//calculate how long it takes to catch up
			do {
				freightTrainDistance += freightTrainSpeed_mph;
				passengerTrainDistance += passengerTrainSpeed_mph;
				hoursPassed++;
			} while (freightTrainDistance > passengerTrainDistance);

			//output results
			System.out.println("The passenger train will catch the freight train at time " + ((int) passengerTrainTime + hoursPassed) + ":00");

			System.out.println("The freight train was traveling "+freightTrainSpeed_mph+" mph");
			System.out.println("The passenger train was traveling "+passengerTrainSpeed_mph+" mph");


			BlockLetters.TONY_PAPPAS.outputBlockName();
		}
	}

}
/*
 * What I Learned:
 * Loops and basic math calculations
 * 
 * Difficulties I had:
 * None
 * 
 * Sample Output:
 * Enter the speed of the passenger train
80
The passenger train will catch the freight train at time 13:00
The freight train was traveling 40.0 mph
The passenger train was traveling 80.0 mph
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 
Enter the speed of the passenger train
75
The passenger train will catch the freight train at time 14:00
The freight train was traveling 40.0 mph
The passenger train was traveling 75.0 mph
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 
Enter the speed of the passenger train
85
The passenger train will catch the freight train at time 13:00
The freight train was traveling 40.0 mph
The passenger train was traveling 85.0 mph
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 

 */