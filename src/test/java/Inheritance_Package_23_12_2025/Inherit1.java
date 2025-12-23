package Inheritance_Package_23_12_2025;

public class Inherit1 {
	
	class Animal
	{
		 
		public void eat () {
			
		}
	}
	
	class Dog extends Animal {
		void Bark() {
			
			System.out.println("Dog barks");
		}
	}
	{
		
	}
	
	public class test {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Dog d = new Dog();
		d.eat();
		d.Bark();
	}

}
