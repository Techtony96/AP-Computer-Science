package me.Techtony96.QuarterThree.Week34.Prog480u;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

import me.Techtony96.Utilities.UtilArray;

public class SumSumSum {

	static DecimalFormat dm = new DecimalFormat("0.00");

	public static void main(String[] args) throws FileNotFoundException {
		//define array
		String[][] array = new String[6][7];

		//Fill array with no sales
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = "0.00";
			}
		}

		//Add column/row headers
		for (int i = 0; i < array.length; i++) {
			String row[] = array[i];
			if (i == 0) {
				for (int j = 0; j < row.length; j++) {
					row[j] = Integer.toString(j);
				}
			} else {
				row[0] = Integer.toString(i);
			}
		}

		//Add Lables
		array[0][0] = "Person";
		array[5][0] = "Total";
		array[0][6] = "Total";

		//get the file
		Scanner inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog480u.dat"));
		//loop through file
		while (inFile.hasNext()) {
			//get the line
			String line = inFile.nextLine();
			//split it into an array
			String[] curLine = line.split(" ");
			array[Integer.valueOf(curLine[0])][Integer.valueOf(curLine[1])] = curLine[2];
		}

		//close the file
		inFile.close();

		//Calculate Row Totals
		double sum = 0;
		for (int i = 1; i < array.length - 1; i++) {
			String[] row = array[i];
			for (int j = 1; j < row.length - 1; j++) {
				sum += Double.valueOf(array[i][j]);
			}
			array[i][6] = dm.format(sum);
			sum = 0;
		}

		//Calculate Column Totals
		for (int i = 1; i < array.length; i++) {
			String[] row = array[i];
			for (int j = 1; j < row.length - 1; j++) {
				sum += Double.valueOf(array[j][i]);
			}
			array[5][i] = dm.format(sum);
			sum = 0;
		}

		//Calculate Final Total
		for (int i = 1; i < array.length; i++) {
			sum += Double.valueOf(array[5][i]);
		}
		//Set Final total
		array[5][6] = dm.format(sum);

		//print the array
		UtilArray.printArray(array);

	}

}
/* Sample Output

Person	 1	 2	 3	 4	 5	 Total
1	 97.55	 121.77	 0.00	 253.66	 184.22	 657.20
2	 152.44	 104.53	 0.00	 189.97	 247.88	 694.82
3	 97.55	 301.00	 122.15	 301.33	 235.87	 1057.90
4	 125.66	 315.88	 231.45	 200.10	 0.00	 873.09
Total	 473.20	 843.18	 353.60	 945.06	 667.97	 3283.01

*/