//A program to find the occurancec of one string into another...

package assignment7;
import java.util.Scanner;

public class StringOccurance {
	public static void main(String[] args)
	{
		System.out.println("A program to find the occurance of one string in another...");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String one = sc.nextLine();
		
		System.out.println("Enter the second string...");
		String two = sc.nextLine();
		
		if(one.contains(two))
				System.out.println("String " + one + " contains " + two);
		else if(two.contains(one))
				System.out.println("String" + two + " contains " + one);
		else
			System.out.println("Neither string has the occurance of other string in itself !");
		sc.close();
	}
}
