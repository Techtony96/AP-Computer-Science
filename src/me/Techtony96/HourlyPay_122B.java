package me.Techtony96;

import java.util.Scanner;

import Utilities.BlockLetters;

public class HourlyPay_122B {
	
	/* Program Name: Hourly Pay
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 9-30-14
	 * Platform: Java 1.6
	 * 
	 * Description: Print a chart of a person's hourly pay
	 */
	

	public static void main(String[] args) {
		//Define new scanner for user input
		Scanner in = new Scanner(System.in);
		//ask user for input
		System.out.println("Insert Hourly Pay");
		//define variable to store user input on hourly pay
		double hourlypay = in.nextDouble();
		System.out.println("Hours    Pay");
		//Loop for 1 to 40
		for (int i = 1; i<=40; i++){
			//Output hours worked and amount paid
			System.out.println(" " + i + "    $" + i*hourlypay);
		}
		
		BlockLetters.TONY_PAPPAS.outputBlockName();

		
	

		
	}
	
	

}
/*
What I Learned:
Loops

Difficulties I had:
Formatting

Sample Output:
Insert Hourly Pay
4
Hours    Pay
 1    $4.0
 2    $8.0
 3    $12.0
 4    $16.0
 5    $20.0
 6    $24.0
 7    $28.0
 8    $32.0
 9    $36.0
 10    $40.0
 11    $44.0
 12    $48.0
 13    $52.0
 14    $56.0
 15    $60.0
 16    $64.0
 17    $68.0
 18    $72.0
 19    $76.0
 20    $80.0
 21    $84.0
 22    $88.0
 23    $92.0
 24    $96.0
 25    $100.0
 26    $104.0
 27    $108.0
 28    $112.0
 29    $116.0
 30    $120.0
 31    $124.0
 32    $128.0
 33    $132.0
 34    $136.0
 35    $140.0
 36    $144.0
 37    $148.0
 38    $152.0
 39    $156.0
 40    $160.0
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 

 */
