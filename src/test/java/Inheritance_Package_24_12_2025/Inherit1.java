package Inheritance_Package_24_12_2025;

class Animal
{
	
	public void eat() {
		
		System.out.println("Eating");
		
	}
}

class Dog extends Animal{
	void bark() {
		
		System.out.println("Barking");
	}
	
	
}

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		

	}

}
