package Overriding_package_26_12_2025;

class Bank{
	
	public void Deposit() {
		System.out.println("My bank rate of intrest is 7%");
	}

	public void Intrest() {
		// TODO Auto-generated method stub
		
	}
}

class Balance extends Bank{
	
	
	@Override
	
	public void Intrest() {
		
		System.out.println("My bank balance");
		
	}
	
}

public class Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new Balance();
		b1.Deposit();
		

	}

}
