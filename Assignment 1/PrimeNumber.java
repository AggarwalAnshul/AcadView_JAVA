package assignment1;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to check for Prime..");
			int number = sc.nextInt();
			int flag = 0;
			for(int i=2; i<number-1; i++)
				{
					if(number%i==0)
						flag+=1;
				}
			if(flag>=1)
				{System.out.println(number+" is not Prime");}
			else
				{System.out.println(number+" is a prime number");}
		}
}
