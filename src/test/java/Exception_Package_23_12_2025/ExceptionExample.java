package Exception_Package_23_12_2025;

import java.rmi.AccessException;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=0;
		
		try {
			
			int c = a/b;
			
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}

	}

}
