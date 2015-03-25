package me.Techtony96.QuarterThree.Week29.PolyAssignment;

import java.util.Calendar;

public abstract class Media {

	protected String title;
	protected Calendar checkOutDate;

	public Media() {
		title = null;
		checkOutDate = Calendar.getInstance();
	}

	public Media(String t, Calendar c) {
		title = t;
		checkOutDate = c;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Calendar getCheckOutDate(){
		return checkOutDate;
	}
	
	public void setCheckOutDate(Calendar checkOutDate){
		this.checkOutDate = checkOutDate;
	}

	/**
	 * Get the due date of the media checked out
	 * @return Calendar due date
	 */
	public abstract Calendar getReturnDate();

}
