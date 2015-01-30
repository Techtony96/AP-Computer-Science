package me.Techtony96.QuarterThree.Week21.Friday.Assignment1;

public class Customer {
	private String firstName, lastName, street, city, state, zip;

	/**
	 * constructor pre: none post: A Customer object has been created. Customer
	 * data has been initialized with parameters
	 */
	public Customer(String fName, String lName, String str, String c, String s, String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		state = s;
		zip = z;
	}

	/**
	 * Returns a String that represents the Customer Object pre: none post: A
	 * string representing the Account object has been returned.
	 */
	public String toString() {
		String custString;
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + " " + zip + "\n";
		return (custString);
	}
	
	public void changeStreet(String str){
		street = str;
	}
	
	public void changeCity(String c){
		city = c;
	}
	
	public void changeState(String s){
		state = s;
	}
	
	public void changeZip(String z){

		zip = z;
	}
}