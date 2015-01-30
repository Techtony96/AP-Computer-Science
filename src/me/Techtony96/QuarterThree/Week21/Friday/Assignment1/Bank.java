package me.Techtony96.QuarterThree.Week21.Friday.Assignment1;

import java.util.Scanner;
import java.text.NumberFormat;

public class Bank {
	public static void main(String[] args) {
		Account munozAccount = new Account (250, "Maria", "Munoz", "110 Glades Road", "My town", "FL", "33445");
		Scanner input = new Scanner(System.in);
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println(munozAccount) ;
		System.out.print("Would you like to update your address? (true/false): ");
		if (input.nextBoolean()){
			munozAccount.changeAddress();
			System.out.println("Your updated info:");
			System.out.println(munozAccount);
		}
		System.out.print("Enter deposit amount: ");
		data = input.nextDouble() ;
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
	}
}

/* Sample Output for assignment 1
Maria Munoz
110 Glades Road
My town, FL 33445
Current balance is $250.00
Would you like to update your address? (true/false): true
Enter Street: 
5555 Hollywood
Enter City: 
Hollywood
Enter State: 
CA
Enter Zip: 
55555
Your updated info:
Maria Munoz
5555 Hollywood
Hollywood, CA 55555
Current balance is $250.00
Enter deposit amount: 50
Balance is: $300.00
Enter withdrawal amount: 400
Not enough money in account.
Balance is: $300.00

*/