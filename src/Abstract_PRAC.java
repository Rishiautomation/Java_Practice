import java.util.Arrays;
import java.util.Scanner;




abstract class Animal{
	
	abstract void makeSound();
	
	void eat() {
		System.out.println("Animal Eats");
	}
	
}

class Dog extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
}

public class Abstract_PRAC {

	public static void main(String[] args) {
		
		Animal dog=new Dog();
		dog.makeSound();
		
		
	}
	
	
	
}
