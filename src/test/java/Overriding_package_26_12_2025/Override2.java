package Overriding_package_26_12_2025;

class Account{
	
	public void Collection() {
		
		System.out.println("New Account");
	}

	public void Deposit() {
		// TODO Auto-generated method stub
		
	}
}

class SavingAccount extends Account{
	
	@Override
	
	public void Deposit() {
		System.out.println("Divident Fund");
	}
}

public class Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new SavingAccount();
		a1.Collection();
		a1.Deposit();

	}

}
