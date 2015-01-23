package me.Techtony96.QuarterThree.Week20.Wednesday;

import me.Techtony96.QuarterThree.Week20.Tuesday.Book;

public class TestPatron {
	
	/* Program Name: TestPatron
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 1/22/15
	 * Platform: Java 1.6
	 * 
	 * Description: Test Patron
	 */
	
	public static void main(String args[]){
		//Define new Patron and book
		Patron p = new Patron("Lucy", "Smith");
		Book b = new Book("Then and now", "Joe Dupont");
		//Output info about both
		System.out.println(p.toString() + " has taken out the book, " + b.gettitle() + " by " + b.getauthor());
	}

}
/*
Sample Output:
Lucy Smith has taken out the book, Then and now by Joe Dupont

*/