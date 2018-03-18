package assignment1;

import java.util.Scanner;

/*Program to find a n number is palindrome or not*/
public class Number_Palindrome {
	public static void reverse(int number)
		{
			int rev = 0;
			int temp = number;
			while(number>=1)
				{
					rev=rev*10+ (number%10);
					number/=10;
				}
			System.out.print("Numbe is Palindrome: ");
			if(temp==rev)
				{ System.out.print("YES");	}
			else
				{ System.out.print("NO");}
		}
	
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number to check for palindrome");
			int number = sc.nextInt();
			reverse(number);
		}
	}
