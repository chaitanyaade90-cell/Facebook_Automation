package MethodOveeriding_packages_24_12_2025;

class Bank{
	
	public void GetRateofIntrest() {
		
		System.out.println("General bank rate of intrest");
	}

	public void RateofIntrest() {
		// TODO Auto-generated method stub
		
	}
}

class SBI extends Bank{
	
	@Override
	public void RateofIntrest() {
		
		System.out.println("Rate of intrest is 7%");
	}
}




public class Override2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
