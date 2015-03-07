package me.Techtony96.QuarterThree.Week26.Monday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import me.Techtony96.Utilities.Round;

public class Program435A {

	public static void main(String args[]) {
		Scanner inFile = null;
		try {
			// Create a scanner to read the file, file name is parameter
			inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog435a.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			// Stop program if no file found
			System.exit(0);
		}
		//header
		System.out.println("Car Type\tBase Toll\tFactor\tCost");
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		//loop file
		while (inFile.hasNext()) {
			String s = inFile.nextLine();
			Integer[] temp = new Integer[2];
			temp[0] = Integer.valueOf(s.split(" ")[0]);
			temp[1] = Integer.valueOf(s.split(" ")[1]);
			list.add(temp);
		}
		//go through array
		Iterator<Integer[]> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer[] cur = iterator.next();
			System.out.println(getCarType(cur[0]) + "\t" + getBaseToll(cur[1]) + "\t\t" + getType(cur[0]) + "\t$" + Round.hundredths(getType(cur[0]) * getBaseToll(cur[1])));
		}
	}

	//get car type
	private static String getCarType(int i) {
		switch (i) {
		case 1:
			return "Compact Car";
		case 2:
			return "Small Car";
		case 3:
			return "Mid Size Car";
		case 4:
			return "Full Size Car";
		case 5:
			return "Truck     ";
		case 6:
			return "16 Wheeler";
		default:
			return "Not Found";
		}
	}

	//get factor
	private static Double getType(int i) {
		switch (i) {
		case 1:
			return 1.0;
		case 2:
			return 1.3;
		case 3:
			return 1.6;
		case 4:
			return 2.0;
		case 5:
			return 2.4;
		case 6:
			return 2.7;
		default:
			return 0.0;
		}
	}

	//get toll
	private static Double getBaseToll(int i) {
		switch (i) {
		case 1:
			return 1.35;
		case 2:
			return 2.0;
		case 3:
			return 2.5;
		case 4:
			return 3.25;
		case 5:
			return 4.1;
		case 6:
			return 4.8;
		case 7:
			return 5.5;
		case 8:
			return 6.0;
		default:
			return -1.0;
		}
	}
}
/* Sample Output

Car Type	Base Toll	Factor	Cost
Compact Car	1.35		1.0	$1.35
Small Car	2.5		1.3	$3.25
Mid Size Car	4.1		1.6	$6.56
Full Size Car	5.5		2.0	$11.0
Truck     	2.0		2.4	$4.8
16 Wheeler	3.25		2.7	$8.78
Compact Car	4.8		1.0	$4.8
Small Car	6.0		1.3	$7.8
Mid Size Car	1.35		1.6	$2.16
Full Size Car	2.5		2.0	$5.0
Truck     	4.1		2.4	$9.84
16 Wheeler	5.5		2.7	$14.85
Compact Car	6.0		1.0	$6.0
Small Car	1.35		1.3	$1.76
Mid Size Car	2.0		1.6	$3.2
Full Size Car	2.5		2.0	$5.0
Truck     	3.25		2.4	$7.8
16 Wheeler	4.1		2.7	$11.07

*/
