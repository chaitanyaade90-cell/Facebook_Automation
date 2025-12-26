package Inheritance_Package_26_12_2025;

class vehicle{
	
	public void car() {
		System.out.println("vehicle is Automatic");
	}
}

class key extends vehicle{
	
	public void drive() {
		
		System.out.println("car is electronic");
	}
	
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle v1 = new key();
		v1.car();
		
	

	}

}
