//Program to the find the second greatest element of the array
package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySecondLargest {
	public static void main(String[] args) {
		
		System.out.println("Program to find the second largest element of the array");
		int length = 10;
		int array[] = new int[length];
		Scanner sc = new Scanner(System.in);
		
		//Feeding the array
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the " + (i + 1) + " element of the array");
			array[i] = sc.nextInt();
		}

		//Finding the element
		int tempArray[] = array; //preserve original array
		Arrays.sort(tempArray);
		int index = length-2 ;
		while (index >=0 && tempArray[index] == tempArray[length-1])
			 { index -= 1; }
		if(index!=-1)
			System.out.println("The Second greatest element of the array is: " + tempArray[index]);
		else
			System.out.println("All elements are identical in the array !");
		sc.close();

	}
}
