//Program to display a complex number
package assignment3;
import java.util.Scanner;

public class ComplexNumbers {
	int realPart;
	int imaginaryPart;

	void Display() {
		if(imaginaryPart >= 0)
			System.out.println("\n" + "The complex number is: " + realPart + " + " + imaginaryPart + "i");
		else if(imaginaryPart < 0)
			System.out.println("\n" + "The complex number is: " + realPart + " - " + (imaginaryPart * -1) + "i");
	}

	void setNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real part of the complex Number");
		realPart = sc.nextInt();
		System.out.println("Enter the imaginarty Part of the complex Number");
		imaginaryPart = sc.nextInt();
		sc.close();
	}

	public static void main(String[] args) {
		ComplexNumbers cn = new ComplexNumbers();
		System.out.println("Program to display a complex number..." + "\n");
		cn.setNumber();
		cn.Display();
	}
}
