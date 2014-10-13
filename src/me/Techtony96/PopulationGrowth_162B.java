package me.Techtony96;

import me.Techtony96.Utilities.BlockLetters;

public class PopulationGrowth_162B {

	/* Program Name: Population Growth
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 10/6/14
	 * Platform: Java 1.6
	 * 
	 * Description: Find the amount of time it takes to double the population
	 */


	public static void main(String[] args) {
		double Population = 236000000;
		double percent = 1.029;

		System.out.println("________Growth Rate 2.9% annually________");
		System.out.println("     Year   Population (in millions)     ");
		int i = 1991;
		while(true){
			Population =  (Population*percent);
			System.out.println("     "+i+"    "+(int)Population/1000000);
			if (Population >= 239000000*2){
				System.out.println("The population will double by the year " + i);
				break;
			}
			i++;
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}



}
/*
What I Learned:
while loops

Difficulties I had:
Calculating the interest

Sample Output:
________Growth Rate 2.9% annually________
     Year   Population (in millions)     
     1991    242
     1992    249
     1993    257
     1994    264
     1995    272
     1996    280
     1997    288
     1998    296
     1999    305
     2000    314
     2001    323
     2002    332
     2003    342
     2004    352
     2005    362
     2006    372
     2007    383
     2008    394
     2009    406
     2010    418
     2011    430
     2012    442
     2013    455
     2014    468
     2015    482
The population will double by the year 2015
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
