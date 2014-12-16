package me.Techtony96.QuarterTwo;

import java.util.Random;
import me.Techtony96.Utilities.BlockLetters;
import me.Techtony96.Utilities.Round;

public class RandomWalk_214A {

	/* Program Name: Random Walk
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/5/14
	 * Platform: Java 1.6
	 * 
	 * Description: Step off a bridge!
	 */

	//Create a new Random object
	static Random r = new Random();

	//define bridge length
	static int bridgeLength = 7;

	public static void main(String[] args) {
		//initialize variables
		double currentPosition = 3.5;
		double maxTimes = 0;
		double totalTimes = 0;
		//output table header
		System.out.println("Run   Average    Greatest # of steps");
		//run test 20 times
		for (int z = 1; z <= 20; z++) {
			//reset variables
			maxTimes = 0;
			totalTimes = 0;
			//run simulation 1000 times
			for (int i = 1; i <= 1000; i++) {
				//reset more variables
				int times = 0;
				currentPosition = 3.5;
				//continue forever (until break)
				while (true) {
					//increment number of times ran
					times++;
					//if true, step forward, if false, step backward
					if (r.nextBoolean()) {
						currentPosition = currentPosition + 1;
					} else {
						currentPosition = currentPosition - 1;
					}
					if (currentPosition >= 7 || currentPosition <= 0) {
						//Off the bridge!
						break;
					}
				}
				//if times taken is more than the max times taken
				if (times > maxTimes) {
					//update max times taken
					maxTimes = times;
				}
				//increments the total times taken
				totalTimes = times + totalTimes;

			}
			//output result to table
			System.out.println("#" + z + "    " + Round.hundredths(totalTimes / 1000.0) + "    " + maxTimes);
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
Java nested cubed loops

Difficulties I had:
None

Sample Output:
Run   Average    Greatest # of steps
#1    15.88    80.0
#2    15.79    92.0
#3    16.28    86.0
#4    16.44    92.0
#5    15.76    76.0
#6    15.83    100.0
#7    15.72    106.0
#8    15.59    94.0
#9    16.41    94.0
#10    15.86    84.0
#11    16.33    104.0
#12    15.89    98.0
#13    16.17    102.0
#14    16.7    96.0
#15    15.91    78.0
#16    16.06    100.0
#17    16.95    84.0
#18    16.74    100.0
#19    16.46    120.0
#20    15.76    94.0
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */