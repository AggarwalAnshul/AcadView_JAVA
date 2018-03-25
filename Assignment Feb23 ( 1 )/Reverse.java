//Program to find the reverse of a number
package assignment1;
import java.util.Scanner;

public class Reverse {
	public static void reverse(int number)
		{	
			int rev = 0;
			int temp = number;
			while(number>=1)
				{rev=rev*10+(number%10);
				 number/=10;
				 }
			System.out.println("The reverse of "+temp+" is: "+rev);
		}
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to find it's reverse !");
			int num = sc.nextInt();
			reverse(num);
			sc.close();
		}
}
