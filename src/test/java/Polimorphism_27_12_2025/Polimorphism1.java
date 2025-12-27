package Polimorphism_27_12_2025;

class Company{
	
	public void Product() {
		
		System.out.println("Manafacture company");
	}
}

class Service extends Company{
	
	public void Automatic() {
		
		System.out.println("Automation product");
	}
}

public class Polimorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Service s1 = new Service();
		s1.Product();
		s1.Automatic();
		
		
		

	}

}
