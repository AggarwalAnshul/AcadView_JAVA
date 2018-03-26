
//Program to count the total words in  a string

package assignment7;
import java.util.Scanner;

public class CountWords {
	public static void main(String[] args)
	{
		System.out.println("Enter a string to count the total words in it...");
		Scanner sc = new Scanner(System.in);
		String string  = sc.nextLine();
		int count = 0;
		int length = string.length();
		for(int i=0; i<length; i++)
			{
				if( (int)string.charAt(i) == 32)
					count += 1;
			}
		System.out.println("Total words int the string are: "+ (count+1) );
		sc.close();
		
	}
}
