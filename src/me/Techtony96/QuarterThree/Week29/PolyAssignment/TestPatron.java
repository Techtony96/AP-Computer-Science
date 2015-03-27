package me.Techtony96.QuarterThree.Week29.PolyAssignment;

public class TestPatron {

	public static void main(String[] args) {
		Patron Emily = new Patron();
		Media myBook = new Book();
		Media myMovie = new Movie();
		Media myAudioBook = new AudioBook();
		myBook.setTitle("ABC");
		((Book) myBook).setAuthor("Lucy Lu");
		myMovie.setTitle("Garden State");
		((Movie)myMovie).setYear(2008);
		myAudioBook.setTitle("AP Comp Sci");
		((AudioBook) myAudioBook).setNarratorName("Tony Pappas");
		((AudioBook) myAudioBook).setYearRecorded(2015);
		
		Media myBook2 = new Book();
		Media myMovie2 = new Movie();
		Media myAudioBook2 = new AudioBook();
		myBook2.setTitle("CBA");
		((Book) myBook2).setAuthor("Steve Paterson");
		myMovie2.setTitle("Contagion");
		((Movie)myMovie2).setYear(2007);
		myAudioBook2.setTitle("Frankenstein");
		((AudioBook) myAudioBook2).setNarratorName("Ms. Henry");
		((AudioBook) myAudioBook2).setYearRecorded(2014);
		
		
		System.out.println(myBook);
		System.out.println(myMovie);
		System.out.println(myAudioBook);
		System.out.println(myBook2);
		System.out.println(myMovie2);
		System.out.println(myAudioBook2);
	}

}
/* Sample Output

The sections of the Book are
	 Title: ABC
	 Author: Lucy Lu
	 Checkout Date: 3/27
	 Due Date: 4/17
The sections of the Movie are
	 Title: Garden State
	 Year: 2008
	 Checkout Date: 3/27
	 Due Date: 4/3
The sections of the Audio Book are
	 Title: AP Comp Sci
	 Narrator: Tony Pappas
	 Year: 2015
	 Checkout Date: 3/27
	 Due Date: 4/10
The sections of the Book are
	 Title: CBA
	 Author: Steve Paterson
	 Checkout Date: 3/27
	 Due Date: 4/17
The sections of the Movie are
	 Title: Contagion
	 Year: 2007
	 Checkout Date: 3/27
	 Due Date: 4/3
The sections of the Audio Book are
	 Title: Frankenstein
	 Narrator: Ms. Henry
	 Year: 2014
	 Checkout Date: 3/27
	 Due Date: 4/10

*/
