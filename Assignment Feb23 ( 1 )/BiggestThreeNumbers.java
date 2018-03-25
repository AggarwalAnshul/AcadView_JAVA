//Program to find the greatest of three integer numbers
package assignment1;
import java.util.Scanner;

public class BiggestThreeNumbers {
	public static void main(String[] args) {
		System.out.println("A program to find the biggest of three integer numbers");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" is the greatest of the three numbers");
		else if(b>a && b>c)
			System.out.println(b+" is the greatest of the three numbers");
		else if(c>a && c>b)
			System.out.println(c+" is the greatest of the three numbers");
		else 
			System.out.println("NUBMERS ARE NOT DISTINCT !");
		sc.close();
	}
}