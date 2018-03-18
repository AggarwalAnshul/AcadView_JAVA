//Program to sort the array in minimum operations
package assingment2;
import java.util.Arrays;

public class ArraySort {
	public static void main(String args[])
		{
			int array[] = new int[] {1, 1, 1, 1, 0, 0, 1, 0};
			System.out.println("The Original Unsorted array is: ");
			for(int i: array)
				{System.out.print(i+"  ");}
			System.out.println("\n\nThe sorted array is: ");
			Arrays.sort(array);
			for(int i: array)
				System.out.print(i+"  ");
		}
	
}
