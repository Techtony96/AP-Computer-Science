package me.Techtony96.QuarterTwo;

import me.Techtony96.Utilities.BlockLetters;

public class Program520A {

	/* Program Name: mRNA
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 12/4/14
	 * Platform: Java 1.6
	 * 
	 * Description: Output all mRNA
	 */

	public static void main(String[] args) {
		//List of the bases
		String bases[] = new String[] { "A", "U", "C", "G" };
		//loop to output the bases
		for (int i = 0; i < bases.length; ++i) {
			for (int j = 0; j < bases.length; ++j) {
				for (int k = 0; k < bases.length; ++k) {
					//output current result
					System.out.print(bases[i] + bases[j] + bases[k] + "        ");
				}
				//new row
				System.out.println();
			}
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

}
/*
What I Learned:
Looping

Difficulties I had:
None

Sample Output:
AAA        AAU        AAC        AAG        
AUA        AUU        AUC        AUG        
ACA        ACU        ACC        ACG        
AGA        AGU        AGC        AGG        
UAA        UAU        UAC        UAG        
UUA        UUU        UUC        UUG        
UCA        UCU        UCC        UCG        
UGA        UGU        UGC        UGG        
CAA        CAU        CAC        CAG        
CUA        CUU        CUC        CUG        
CCA        CCU        CCC        CCG        
CGA        CGU        CGC        CGG        
GAA        GAU        GAC        GAG        
GUA        GUU        GUC        GUG        
GCA        GCU        GCC        GCG        
GGA        GGU        GGC        GGG        
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */