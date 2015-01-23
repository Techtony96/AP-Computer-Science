package me.Techtony96.QuarterThree.Week20.Tuesday;

public class TestBook {
	
	/* Program Name: TestBook
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 1/22/15
	 * Platform: Java 1.6
	 * 
	 * Description: Output book info
	 */
	
	public static void main(String args[]){
		Book b = new Book("Harry Potter", "JK Rowling");
		System.out.println(b.toString());
	}

}
/*
Sample Output:
The sections of the Book are
Title: Harry Potter
Author: JK Rowling
*/