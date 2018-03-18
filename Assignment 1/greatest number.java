import java.io.*;
import java.util.Scanner;
//program to find the greatest of three numbers
public class Assignment1 
  {	
	static int greatest(int a, int b, int c)
		{
			if(a>b && a>c)
				return a;
			if(b>a && b>c)
				return b;
			if(c>a && c>b)
				return c;
			if(a>=b && a>=c) //when two/all numbers are same
				return a;
			if(b>=c && b>=a)
				return b;
			if(c>=a && c>=b)
				return c;
			
			return 1;
		}
	
	public static void main(String[] args)
	 {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Greatest number is --> "+greatest(a, b,c ));
		sc.close();
	 }
  }
