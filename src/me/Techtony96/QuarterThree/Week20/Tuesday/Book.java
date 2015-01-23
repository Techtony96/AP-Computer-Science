package me.Techtony96.QuarterThree.Week20.Tuesday;

public class Book {
	
	//Define variables
	private String title;
	private String author;

	//Main Constructor
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	//Alternate Constructor
	public Book(Book p){
		this.author = p.getauthor();
		this.title = p.gettitle();
	}
	
	//Null Constructor
	public Book(){
		this.author = null;
		this.title = null;
	}
	
	//Get the Book's First name
	public String gettitle(){
		return this.title;
	}
	
	//Get the Book's Last name
	public String getauthor(){
		return this.author;
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
		return str;
	}


}
