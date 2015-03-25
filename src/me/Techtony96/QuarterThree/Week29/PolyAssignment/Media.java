package me.Techtony96.QuarterThree.Week29.PolyAssignment;

import java.util.Calendar;

public abstract class Media {

	private String title;
	private Calendar checkOut;

	public Media() {
		title = null;
		checkOut = Calendar.getInstance();
	}

	public Media(String t, Calendar c) {
		title = t;
		checkOut = c;
	}

	public abstract Calendar getReturnDate();

}
