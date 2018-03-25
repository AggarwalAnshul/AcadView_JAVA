//Program to count all the prime numbers upto the number N
package assingment2;
import java.util.Scanner;

public class PrimeTillNumber {
	public static int prime(int number)
		{
			int flag=0;
			for(int i=2; i<number-1; i++)
				{
					if(number%i==0)
						flag+=1;
				}
			if(flag==0)
				return 1;
			return 0;
		}
	public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number to find all prime numbes upto N");
				int a = sc.nextInt();
				int counter=0;
				for(int i=1; i<a; i++)
					{	
						if( prime(i)==1 )
							{counter+=1;
							 System.out.println(counter + ": " + i);
							}
					}
				System.out.println("\n" + "Total Prime nubmers are: "+ counter);
				sc.close();
			}
	
	}

