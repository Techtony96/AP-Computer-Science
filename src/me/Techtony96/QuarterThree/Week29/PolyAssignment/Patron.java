package me.Techtony96.QuarterThree.Week29.PolyAssignment;
public class Patron {
	
	//Define variables
	private String firstName;
	private String lastName;
	private String libNumber;
	private Media media;

	//Main Constructor
	public Patron(String firstName, String lastName, String libNumber, Media media){
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastName = libNumber;
		this.media = media;
	}
	
	//Alternate Constructor
	public Patron(Patron p){
		this.lastName = p.getLastName();
		this.firstName = p.getFirstName();
	}
	
	//Null Constructor
	public Patron(){
		this.lastName = null;
		this.firstName = null;
		this.libNumber = null;
		this.media = null;
	}
	
	//Get the Patron's First name
	public String getFirstName(){
		return this.firstName;
	}
	
	//Get the Patron's Last name
	public String getLastName(){
		return this.lastName;
	}
	
	//Set the Patron's First name
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	//Set the Patron's Last name
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLibNumber(){
		return this.libNumber;
	}
	
	public void setLibNumber(String libNumber){
		this.libNumber = libNumber;
	}
	
	public Media getMedia(){
		return this.media;
	}
	
	public void setMedia(Media media){
		this.media = media;
	}
	
	//Get the Patron's full name
	public String toString(){
		return this.firstName + " " + this.lastName;
	}

}