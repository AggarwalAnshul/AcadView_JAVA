//Program to search for an element in array in minimum comparisons
package assingment2;
import java.util.Scanner;

public class ArraySearch {
	public static int binarySearch(int number, int array[], int left, int right)
		{
			while(left<=right) {
			int mid=(left+right)/2;
			if(array[mid]==number)
				return mid;
			if(array[mid]>number)
				right=mid-1;
			if(array[mid]<number)
				left = mid+1;
			}return 0;
		}

	public static void main(String args[])
		{
			int[] array= new int[]{1, 4, 6, 7, 8, 9, 10};
			System.out.println("Enter the number to search for");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			int length = array.length;
			int index = binarySearch(number, array, 0, length-1);
			if(index!=0)
				System.out.println(number+"  present at: "+(index+1) +" position");
			else
				System.out.println("Element not present");
			sc.close();
		}

}
