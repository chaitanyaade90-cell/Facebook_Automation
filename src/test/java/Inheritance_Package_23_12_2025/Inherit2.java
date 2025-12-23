package Inheritance_Package_23_12_2025;

class Animal
{
	
	public void eat() {
		
		System.out.println("Animal eats");
	}
}

class Dog extends Animal {
	
	void Bark () {
		System.out.println("Dog barks");
	}
}

public class Inherit2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d= new Dog();
		d.eat();
		d.Bark();

	}

}
