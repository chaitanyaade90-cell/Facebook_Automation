package Inheritance_27_12_2025;

class person{
	
	public void walk() {
		
		System.out.println("Person Walking");
	}
}

class Employee extends person{
	
	public void work() {
		
		System.out.println("Employee working");
	}
}

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.work();
		e1.walk();
		

	}

}
