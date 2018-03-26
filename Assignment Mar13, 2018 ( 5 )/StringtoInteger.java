package assignment6;

import java.util.Scanner;
public class StringtoInteger {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to find the max of integer converted value of two strings");
		System.out.println("\n"+"\n"+"Enter a number");
		String one = sc.next();
		System.out.println("\n"+"Enter the second number");
		String two = sc.next();
		System.out.println("Entered numbers are...");
		System.out.println("One: "+one);
		System.out.println("Two: "+two);
		
		System.out.println("the maximum number is: " + Math.max(Integer.parseInt(one), Integer.parseInt(two) ) );
		sc.close();
	}

}
