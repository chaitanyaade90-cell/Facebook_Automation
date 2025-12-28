package Inheritance_28_12_2025;

class employee
{
	
	public void learn() {
		
		System.out.println("Divident profit");
	}
}

class staff extends employee{
	
	public void teach() {
		
		System.out.println("Rate of intrest");
	}
}


public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staff s1 = new staff ();
		s1.learn();
		s1.teach();

	}

}
