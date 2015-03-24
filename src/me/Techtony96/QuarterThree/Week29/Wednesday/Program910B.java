package me.Techtony96.QuarterThree.Week29.Wednesday;

import java.util.Scanner;

public class Program910B {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number base 10 to convert: ");
		int n = in.nextInt();
		System.out.print("Enter the new base: ");
		int toBase = in.nextInt();
		System.out.println("The number " + n + " [base 10] = " + convert(n, toBase) + "[base " + toBase + "]");
		main(null);
	}

	private static String convert(int n, int toBase) {
		if (n == 0)
			return "0";
		return convert((n / toBase), toBase) + n%toBase;
	}

}

/* Sample Output:

Enter the number base 10 to convert: 83
Enter the new base: 8
The number 83 [base 10] = 0123[base 8]
Enter the number base 10 to convert: 255
Enter the new base: 16
The number 255 [base 10] = 01515[base 16]
Enter the number base 10 to convert: 256
Enter the new base: 16
The number 256 [base 10] = 0100[base 16]
Enter the number base 10 to convert: 34
Enter the new base: 8
The number 34 [base 10] = 042[base 8]
Enter the number base 10 to convert: 100
Enter the new base: 3
The number 100 [base 10] = 010201[base 3]
Enter the number base 10 to convert

*/
