//Program to count all the even numbers until the number N

package assingment2;
import java.util.Scanner;

public class EvenTillNumber {
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to count all even numbers upto N");
			int a = sc.nextInt();
			int flag=0;
			for(int i=0; i<=a; i++)
				{	
					if(i%2==0)
						{flag+=1;
						 System.out.println(flag + ": " + i);
						}
				}
			System.out.println("\n" + "Total Even Nubmers: "+flag);
			sc.close();
		}
}
