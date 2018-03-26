//Program to illustrate the concept of Interfaces ... 
package assignment6;
class Cat implements Animals {
	public void speak() {
		System.out.println("\t" + "The Cat is Meowing...");
	}

	public void eat() {
		System.out.println("\t" + "The Cat is eating Cat food...");
	}

}

class Dog implements Animals {
	public void speak() {
		System.out.println("\t" + "The Dog is Barking...");
	}

	public void eat() {
		System.out.println("\t" + "The DOg is eating Dog Food");
	}
}

public class Interface {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		System.out.println("Program to demonstrate the concept of Interfaces");
		System.out.println();
		System.out.println("Invoking cat.speak()...");
		cat.speak();
		System.out.println("Invoking cat.eat()...");
		cat.eat();
		System.out.println();
		System.out.println("Invoking Dog.speak()...");
		dog.speak();
		System.out.println("Invoking Dog.eat()...");
		dog.eat();
	}

}
