package Inheritance_28_12_2025;

class vehicle
{
	
	public void start() {
		System.out.println("My car is mercedez");
	}
}

class car extends vehicle{
	
	public void company() {
		
		System.out.println("My car is automatic");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c1 = new car();
		c1.start();
		c1.company();

	}

}
