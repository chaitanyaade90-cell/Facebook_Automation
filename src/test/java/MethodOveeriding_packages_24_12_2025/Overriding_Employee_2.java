package MethodOveeriding_packages_24_12_2025;

class Employee{
	
	void calculatesalary() {
		
		System.out.println("Basic salary calculation");
	}
}

class Manager extends Employee {
	
	@Override
	
	public void calculatesalary() {
		
		System.out.println("Salary with Bonus");
	}
	
}

public class Overriding_Employee_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Manager();
		e1.calculatesalary();
		

	}

}
