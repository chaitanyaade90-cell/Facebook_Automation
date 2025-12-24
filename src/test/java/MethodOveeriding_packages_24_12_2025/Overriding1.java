package MethodOveeriding_packages_24_12_2025;

class Bank{
	
	void GetRateofIntrest() {
		
		System.out.println("General Bank intrest rate");
	}

	void getrateofintrest() {
		// TODO Auto-generated method stub
		
	}
}

class SBI extends Bank{
	
	@Override
	void getrateofintrest() {
		
		System.out.println("SBI intrest rate is 7%");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = new SBI();
		b.getrateofintrest();

	}

}
