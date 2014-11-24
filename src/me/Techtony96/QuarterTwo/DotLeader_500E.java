package me.Techtony96.QuarterTwo;

import java.util.Scanner;

import me.Techtony96.Utilities.BlockLetters;

public class DotLeader_500E {
	
	/* Program Name: Dot Leader
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/24/14
	 * Platform: Java 1.6
	 * 
	 * Description: Format a table of contents
	 */
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//ask the user for what leader they want to use
		String leader = chooseLeader();
		//get the title of the chapter
		System.out.print("Enter the Title: ");
		String title = in.nextLine();
		//get the page number of the chapter
		System.out.print("Enter the page number: ");
		String page = in.nextLine();
		//define new stringbuilder
		StringBuilder sb = new StringBuilder();
		//add the title to the sb
		sb.append(title);
		//loop to add leader to string builder
		for (int i = 1; i<=(50 - (title.length()+page.length())); i++){
			sb.append(leader);
		}
		//add page number at the end
		sb.append(page);
		//output result
		System.out.println("");
		System.out.println(sb.toString());
		
		
		BlockLetters.TONY_PAPPAS.outputBlockName();
	}
	
	private static String chooseLeader(){
		System.out.print("Enter character you want to use as your leader: ");
		return in.nextLine();
	}

}
/*
What I Learned:
StringBuilder

Difficulties I had:
None

Sample Output:
Enter character you want to use as your leader: .
Enter the Title: An Introduction to Java
Enter the page number: 5

An Introduction to Java..........................5
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */