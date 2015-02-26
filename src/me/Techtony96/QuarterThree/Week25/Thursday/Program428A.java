package me.Techtony96.QuarterThree.Week25.Thursday;

public class Program428A {

	public static void main(String args[]) {

		//Define array to hold all cells
		boolean cell[] = new boolean[1000];
		//Loop for all cells
		for (int h = 0; h < 1000; h++) {
			//set them all to locked
			cell[h] = true;
		}
		
		//Code to set which ones are locked and which are not locked
		for (int i = 0; i < 1000; i++) {
			for (int j = i; j < 1000; j = j + (i + 1)) {
				cell[j] = !cell[j];
			}
		}
		//output results
		int count = 0;
		boolean changed = false;
		//Loop through all cells
		for (int l = 0; l < 1000; l++) {
			//if it is unlocked
			if (cell[l] == false){
				System.out.print(l + 1 + "\t");
				count++;
				changed = true;
			}
			//new row of table if
			if (count%5==0 && changed == true){
				System.out.println("");
				changed = false;
			}
		}
	}
}

/* Sample Output:
1	4	9	16	25	
36	49	64	81	100	
121	144	169	196	225	
256	289	324	361	400	
441	484	529	576	625	
676	729	784	841	900	
961	
*/