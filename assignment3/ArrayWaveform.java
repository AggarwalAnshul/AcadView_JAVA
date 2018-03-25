//Arrange the elements of an array in a waveform pattern

package assignment3;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayWaveform {
	public static void main(String args[])
	{
		int length = 10;
		int array[] = new int[length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to print the array into a waveform");
		
		//Feeding the array
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the " + (i + 1) + " element of the array");
			array[i] = sc.nextInt();
		}
		
		int left = 0;
		int right = length -1;
		Arrays.sort(array);
		while(left<=right)
			{System.out.print(array[right] +" "+ array[left]+" ");
			right-=1;
			left+=1;
			}
		sc.close();
	}
	

}
