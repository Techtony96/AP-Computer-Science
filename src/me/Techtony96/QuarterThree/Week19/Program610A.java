package me.Techtony96.QuarterThree.Week19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class Program610A {

	/* Program Name: Heron's Formula
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 1/16/15
	 * Platform: Java 1.6
	 * 
	 * Description: Find areas of a triangle
	 */



	public static void main(String[] args) throws FileNotFoundException {
		//output header
		System.out.println("A\tB\tC\tAREA");
		//find file
		Scanner inFile = new Scanner(new File(System.getProperty("user.dir") + "/src/Files/prog206a.dat"));
		//loop through file
		while (inFile.hasNext()) {
			//get the line
			String line = inFile.nextLine();
			//split it into an array
			String[] array = line.split(" ");
			//find the area of the triangle
			calculateArea(Integer.valueOf(array[0]), Integer.valueOf(array[1]), Integer.valueOf(array[2]));
		}
		//close the file
		inFile.close();
		
		//output my name
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}

	public static void calculateArea(int a, int b, int c) {
		double s;
		double temp;
		double area = 0.0;
		//output points
		System.out.print(a + "\t" + b + "\t" + c + "\t");
		//calcualte s
		s = (a + b + c) / 2.0;
		//calculate temp
		temp = s * (s - a) * (s - b) * (s - c);
		//if temp <0, its not a triangle
		if (temp < 0) {
			System.out.println("This is not a triangle");
			return;
		} 
		//calculate area
		area = Math.sqrt(temp);
		//if area = 0, its not a triangle
		if (area == 0) {
			System.out.println("This is not a triangle");
			return;
		} 
		//output area.
		System.out.printf("%2.4f%n", area);
	} 

}
/*
What I Learned:
Calculations

Difficulties I had:
None

Sample Output:
A	B	C	AREA
7	8	9	26.8328
9	9	12	40.2492
6	5	21	This is not a triangle
24	7	25	84.0000
13	12	5	30.0000
50	40	30	600.0000
10	10	10	43.3013
82	34	48	This is not a triangle
4	5	6	9.9216
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */
