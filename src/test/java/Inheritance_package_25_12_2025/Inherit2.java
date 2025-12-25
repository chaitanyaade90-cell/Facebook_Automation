package Inheritance_package_25_12_2025;

class ADO{
	
	public void Project() {
		System.out.println("My project is SQM");
	}
}

class ATR extends ADO{
	
	public void Planning() {
		
		System.out.println("I am Quality Engineer");
	}
	
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ADO a1 = new ATR();
		a1.Project();

	}

}
