package me.Techtony96.QuarterThree.Week29.PolyAssignment;

import java.util.Calendar;

public class AudioBook extends Media {
	
	private String narratorName;
	private int yearRecorded;
	
	public AudioBook(){
		super();
		setNarratorName(null);
		setYearRecorded(0);
	}
	
	public AudioBook(String title, String narratorName, int yearRecorded, Calendar c){
		super(title, c);
		setNarratorName(narratorName);
		setYearRecorded(yearRecorded);
	}
	
	
	
	@Override
	public Calendar getReturnDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.setTimeInMillis(getCheckOutDate().getTimeInMillis());
		dueDate.add(Calendar.DAY_OF_YEAR, 14);
		return dueDate;
	}

	public String getNarratorName() {
		return narratorName;
	}

	public void setNarratorName(String narratorName) {
		this.narratorName = narratorName;
	}

	public int getYearRecorded() {
		return yearRecorded;
	}

	public void setYearRecorded(int yearRecorded) {
		this.yearRecorded = yearRecorded;
	}
	
	public String toString() {
		String str = "The sections of the Audio Book are";
		str += "\n\t Title: " + getTitle();
		str += "\n\t Narrator: " + getNarratorName();
		str += "\n\t Year: " + getYearRecorded();
		str += "\n\t Checkout Date: " + (getCheckOutDate().get(Calendar.MONTH) + 1) + "/" + getCheckOutDate().get(Calendar.DAY_OF_MONTH);
		str += "\n\t Due Date: " + (getReturnDate().get(Calendar.MONTH) + 1) + "/" + getReturnDate().get(Calendar.DAY_OF_MONTH);
		return str;
	}

}
