package me.Techtony96.QuarterThree.Week29.PolyAssignment;

import java.util.Calendar;

public class Movie extends Media {
	
	private int year;
	
	
	
	public Movie(){
		super();
		year = 0;
	}
	
	public Movie(String title, int year, Calendar c){
		super(title, c);
		this.year = year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return year;
	}

	@Override
	public Calendar getReturnDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.setTimeInMillis(getCheckOutDate().getTimeInMillis());
		dueDate.add(Calendar.DAY_OF_YEAR, 7);
		return dueDate;
	}
	
	public String toString() {
		String str = "The sections of the Movie are";
		str += "\n\t Title: " + getTitle();
		str += "\n\t Year: " + getYear();
		str += "\n\t Checkout Date: " + (getCheckOutDate().get(Calendar.MONTH) + 1) + "/" + getCheckOutDate().get(Calendar.DAY_OF_MONTH);
		str += "\n\t Due Date: " + (getReturnDate().get(Calendar.MONTH) + 1) + "/" + getReturnDate().get(Calendar.DAY_OF_MONTH);
		return str;
	}

}
