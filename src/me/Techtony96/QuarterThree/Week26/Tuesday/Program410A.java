package me.Techtony96.QuarterThree.Week26.Tuesday;

public class Program410A {

	public static void main(String args[]) {
		System.out.println("Number\tPossible Combinations");
		for (int x = 1; x <= 18; x++) {
			int count = 0;
			for (int k = 1; k <= 6; k++) {
				for (int i = 1; i <= 6; i++) {
					for (int j = 1; j <= 6; j++) {
						if (k + i + j == x)
							count++;
					}
				}
			}
			System.out.println(x + "\t\t\t" + count);
		}

	}

}
/* Sasmple Output
Number	Possible Combinations
1			0
2			0
3			1
4			3
5			6
6			10
7			15
8			21
9			25
10			27
11			27
12			25
13			21
14			15
15			10
16			6
17			3
18			1

*/
