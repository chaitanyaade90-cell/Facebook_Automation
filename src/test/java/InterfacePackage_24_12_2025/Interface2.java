package InterfacePackage_24_12_2025;

interface Animal{
	
	public void sound();
		
	}

 abstract interface Dog extends Animal{
	 
	 public default void sound() {
		 
		 System.out.println("Dog Barks");
	 }
	
	
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Animal a= new Animal();
		a.sound();
		
	}

}
