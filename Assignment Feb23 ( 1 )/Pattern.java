//Program to print a pyramid of asterics

package assignment1;

public class Pattern {
	public static void main(String args[]) {

		System.out.println("A Program to print a pattern..." + "\n");
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
