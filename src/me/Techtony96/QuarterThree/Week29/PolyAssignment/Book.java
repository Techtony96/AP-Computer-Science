package me.Techtony96.QuarterThree.Week29.PolyAssignment;

import java.util.Calendar;

public class Book extends Media {

	//Define variables
	private String author;

	//Main Constructor
	public Book(String title, String author, Calendar c) {
		super(title, c);
		this.author = author;
	}

	//Null Constructor
	public Book() {
		super();
		author = null;
	}

	//Get the Book's Last name
	public String getAuthor() {
		return this.author;
	}

	//Set the Book's Last name
	public void setAuthor(String author) {
		this.author = author;
	}

	//Get book info
	public String toString() {
		String str = "The sections of the Book are";
		str += "\n\t Title: " + getTitle();
		str += "\n\t Author: " + getAuthor();
		str += "\n\t Checkout Date: " + (getCheckOutDate().get(Calendar.MONTH) + 1) + "/" + getCheckOutDate().get(Calendar.DAY_OF_MONTH);
		str += "\n\t Due Date: " + (getReturnDate().get(Calendar.MONTH) + 1) + "/" + getReturnDate().get(Calendar.DAY_OF_MONTH);
		return str;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Calendar getReturnDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.setTimeInMillis(getCheckOutDate().getTimeInMillis());
		dueDate.add(Calendar.DAY_OF_YEAR, 21);
		return dueDate;
	}

}