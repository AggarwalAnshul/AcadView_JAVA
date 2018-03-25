//Program to add two numbers
package assignment1;

import java.util.Scanner;

public class AddTwoNumbers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integral numbers to find their sum...");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("\n" + "The sum of " + a + " and " + b + " is: " + (a+b) );
		sc.close();
	}

}
