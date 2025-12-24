package Inheritance_Package_24_12_2025;

class Animal{
	
	void eat() {
		
		System.out.println("Eating");
	}
}

class Dog extends Animal
{
	
	void Bark() {
		
		System.out.println("Barking");
	}
}

public class Multilevel_Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1=new Animal();
		a1.eat();
		a1.eat();

	}

}
