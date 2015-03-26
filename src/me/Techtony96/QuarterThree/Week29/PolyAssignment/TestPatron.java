package me.Techtony96.QuarterThree.Week29.PolyAssignment;

public class TestPatron {

	public static void main(String[] args) {
		Patron Emily = new Patron();
		Media myBook = new Book();
		Media myMovie = new Movie();
		myBook.setTitle("ABC");
		
		((Book) myBook).setAuthor("Lucy Lu");
		myMovie.setTitle("Garden State");
		((Movie)myMovie).setYear(2008);
		System.out.println(myBook);
		System.out.println(myMovie);
		//At 11:30 in Poly4
	}

}
