package Overloading_packages_28_12_2025;

class Calculator{
	
	int add(int a, int b) {
		return a+b;
		
	}


int add(int a, int b, int c) {
	
	return a+b+c;
}

}

public class MethodOverloading1 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
		System.out.println(c.add(5, 10,15));
		
		c.add(12, 10);
		c.add(12,30,23);
						
	}
}


