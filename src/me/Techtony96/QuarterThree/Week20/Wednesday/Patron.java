package me.Techtony96.QuarterThree.Week20.Wednesday;

public class Patron {
	
	//Define variables
	private String firstName;
	private String lastName;

	//Main Constructor
	public Patron(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	//Set the Patron's full name
	public void setName(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Get the Patron's full name
	public String toString(){
		return this.firstName + " " + this.lastName;
	}

}
