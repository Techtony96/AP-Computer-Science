package me.Techtony96.QuarterThree.Week20.OOD;

import java.util.Scanner;

public class Player {
	int number;
	String name;

	public Player(){
		System.out.print("Player, enter your name: ");
		setName(new Scanner(System.in).nextLine());
		
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	
	public void guess(){
		System.out.println(name + ", enter your guess: ");
		number = new Scanner(System.in).nextInt();
	}

}
