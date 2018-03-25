//Program to find whether a year is a leap year or not ?

package assignment1;
import java.util.Scanner;

public class LeapYear {

	public static boolean checkLeapYear(int year)
	{   if (year % 400 == 0)
	        return true;
	    if (year % 100 == 0)
	        return false;
	    if (year % 4 == 0)
	        return true;
	    return false;
	}
	public static void main(String args[])
	{
		System.out.println("A Program to find whether a given year is a Leap year or not ..." + "\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to find it's a leap year or not !");
		int year = sc.nextInt();
		if( checkLeapYear(year) )
			System.out.println(year + " is a Leap year ! ");
		else
			System.out.println(year + " is not a Leap Year !");
		sc.close();
	}
}
