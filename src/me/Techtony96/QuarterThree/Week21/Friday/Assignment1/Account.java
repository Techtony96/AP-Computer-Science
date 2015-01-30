package me.Techtony96.QuarterThree.Week21.Friday.Assignment1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
	private double balance;
	private Customer cust;

	/**
	 * constructor pre: none post: An account cree * customer data initia:
	 */
	public Account(double bal, String fName, String lName, String str, String city, String st, String zip) {
		balance = bal;
		cust = new Customer(fName, lName, str, city, st, zip);
	}

	/**
	 * Returns the current balance pre: none post: The account balance has been
	 * returned
	 */
	public double getBalance() {
		return (balance);
	}

	/**
	 * A deposit is made to the account pre: none post: The balance has been
	 * increased by the amount of the deposit.
	 */
	public void deposit(double amt) {
		balance += amt;
	}

	/**
	 * A withdrawal is made from the account if there is enough money pre: none
	 * post: The balance has been decreased by the amount withdrawn.
	 */
	public void withdrawal(double amt) {
		if (amt <= balance)
			balance -= amt;
		System.out.println("Not enough money in account.");
	}

	/**
	 * Returns a String that represents the Account object. pre: none post: A
	 * string representing the Account object has been returned.
	 */
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		accountString = cust.toString();
		accountString += "Current balance is " + money.format(balance);
		return (accountString);
	}
	
	private Scanner in = new Scanner(System.in);
	
	public void changeAddress(){
		System.out.println("Enter Street: ");
		cust.changeStreet(in.nextLine());
		System.out.println("Enter City: ");
		cust.changeCity(in.nextLine());
		System.out.println("Enter State: ");
		cust.changeState(in.nextLine());
		System.out.println("Enter Zip: ");
		cust.changeZip(in.nextLine());
	}
}
