//Program to find the reverse of a user input string

package assignment7;
import java.util.Scanner;

public class  StringReverse {
	public static String reverse(String string)
		{
			
			String reverse="";
			int length = string.length();
			for(int i=length-1; i>=0; i--)
				{
					reverse+=string.charAt(i);
				}
			return reverse;
		}
	public static void main(String args[])
		{
			System.out.println("A Program to find the reverse of a string..." + "\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string to print its reverse");
			String string = sc.nextLine();
			System.out.println("\n" + "Entered String: "+string);
			System.out.println( "Reversed String: " + reverse(string) );
			sc.close();
		}
}
