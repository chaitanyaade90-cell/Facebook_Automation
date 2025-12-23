package AccessModifiers_23_12_2025;

public class PublicModifiers1 {
	
	String Bank;
	
	private int Balance = 10000;
	
	private void ShowBalance() {
		System.out.println(Balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicModifiers1 p1 = new PublicModifiers1();
		
		p1.Balance=10000;
		
		
		System.out.println("Balance");

	}

}
