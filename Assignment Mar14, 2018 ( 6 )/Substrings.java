//Program to print all the substrings of a given String
package assignment7;
import java.util.Scanner;

public class Substrings {

	public static void SubString(String string)
		{
			int length = string.length();
			int counter = 1;
			for(int i=0; i<length; i++)
				{
					for(int j=0; j<=length-i-1; j++)
					{
						System.out.println("Substring:"+counter+" Length:" + (i+1) + " "+string.substring(j, j+i+1));
						counter+=1;
					}
					System.out.println();
				}
		}
	
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string...");
			String string = sc.next();
			SubString(string);
			sc.close();
			
		}
}
