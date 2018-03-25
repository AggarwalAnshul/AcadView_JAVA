//Program to create a class and find the area of rectangle using member function
package assignment3;
import java.util.Scanner;

public class RectangleArea {
	int length;
	int breadth;
	
	void getData()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Length of the rectangle (metres)");
			length = sc.nextInt();
			System.out.println("Enter the breadth of the rectangle (metres)");
			breadth = sc.nextInt();
			sc.close();
		}
	void CalculateArea()
		{	
			System.out.println("The area of the rectangle is: "+ (length*breadth) +" Sq. metres" );
		}
	
	public static void main(String[] args)
		{
			System.out.println("A program to find the area of the rectangle ..." + "\n");
			RectangleArea ra = new RectangleArea();
			ra.getData();
			ra.CalculateArea();
		}
}
