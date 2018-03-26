//Program to remove all vowels from the given string

package assignment7;
import java.util.Scanner;

public class RemoveAllVowels {
	public static void remove(String string)
		{
			string = string.replaceAll("a", "");
			string = string.replaceAll("A", "");
			string = string.replaceAll("e", "");
			string = string.replaceAll("E", "");
			string = string.replaceAll("i", "");
			string = string.replaceAll("I", "");
			string = string.replaceAll("o", "");
			string = string.replaceAll("O", "");
			string = string.replaceAll("u", "");
			string = string.replaceAll("U", "");
			System.out.println("Processed string is: "+string);
		}
	public static void main(String args[])
	{	
		System.out.println("A program to remove all the vowels from a user input string " + "\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to remove all the Vowels");
		String string = sc.nextLine();
		System.out.println("\n" + "Original String is: " + string);
		remove(string);
		sc.close();
	}
}
