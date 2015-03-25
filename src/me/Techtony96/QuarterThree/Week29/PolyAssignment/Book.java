package me.Techtony96.QuarterThree.Week29.PolyAssignment;

import java.util.Calendar;

public class Book extends Media {
	
	//Define variables
	private String title;
	private String author;
	private Calendar today;

	//Main Constructor
	public Book(String title, String author, Calendar c){
		this.title = title;
		this.author = author;
		this.today = c;
	}
	
	//Null Constructor
	public Book(){
		this.author = null;
		this.title = null;
		today = Calendar.getInstance();
	}
	
	//Get the Book's First name
	public String gettitle(){
		return this.title;
	}
	
	//Get the Book's Last name
	public String getauthor(){
		return this.author;
	}
	
	public Calendar getToday(){
		return today;
	}
	
	public void setToday(Calendar c){
		today = c;
	}
	
	//Set the Book's First name
	public void settitle(String title){
		this.title = title;
	}
	
	//Set the Book's Last name
	public void setauthor(String author){
		this.author = author;
	}
	
	//Set the Book's full name
	public void setName(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	//Get book info
	public String toString(){
		String str = "The sections of the Book are";
		str += "\n\t Title: " + title;
		str += "\n\t Author: " + author;
		str += "\n\t Checkout Date: " + today;
		return str;
	}

	@Override
	public Calendar getReturnDate() {
		return today;
	}


}