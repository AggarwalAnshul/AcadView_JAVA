package assignment7;

public class Pattern {
	public static void main(String[] args)
	{
		
		System.out.println("Program to print a pyramid of characters " + "\n");
		for(int i=1; i<=3; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print((char)(96+j));
				}
				System.out.println();
			}
	}
}
