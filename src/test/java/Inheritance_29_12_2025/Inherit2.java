package Inheritance_29_12_2025;

class deposit
{
	
	public void Fund() {
		System.out.println("Rate of intrest is 12%");
	}
}

class intrest extends deposit{
	
	public void Saving() {
		System.out.println("My bank name is SBI");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intrest i1 = new intrest();
		i1.Fund();
		i1.Saving();

	}

}
