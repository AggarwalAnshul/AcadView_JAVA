//Program to demonstarte the concept of Abstract classes...
package assignment6;
public abstract class Animal {
	String color;
	String breed;
	String name;
	
    abstract void eat();
	void speak()
		{System.out.println("The Animal is speaking...");}

	public static void main(String[] args)
		{
			System.out.println("Program to deomnstrate the concept of Abstract classes");
			System.out.println();
			
			
		}
	}
