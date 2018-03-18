//Program to find if a number is armstrong number or not
package assingment2;
import java.util.Scanner;

public class ArmstrongNumber {
	//calculates the length of the digit
	public static int length(int number)
		{
			int len=0;
			while(number>=1)
				{
					len+=1;
					number/=10;
				}
			return len;
		
		}
	
	//checks for armstrong number
	public static void armstrong(int number)
		{
			int arm=0;
			int copy = number;
			int len = length(number);
			while(number>=1)
				{
					int temp = number%10;
					arm+=(int)Math.pow(temp,len);
					number/=10;
				}
			if(arm==copy)
				System.out.println(copy+" is an Armstrong number");
			else
				System.out.println(copy + " is not an Armstrong number");
		}
	//the main function
	public static void main(String args[])
		{
			System.out.println("Enter a number to check for Armstrong number");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			armstrong(number);
			sc.close();
		}
}
