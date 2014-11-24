package me.Techtony96.Utilities;

public class Output {
	
	public static void center(String line){
		int margin = (80-line.length())/2;
		for (int i = 1; i<=margin;i++){
			System.out.print(" ");
		}
		System.out.print(line);
	}

}
