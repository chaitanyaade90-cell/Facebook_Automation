package Interface_package_27_12_2025;

interface vehicle{
	
	public void start();
	
}

class car implements vehicle{
	
	public void start() {
		System.out.println("Car start with key");
	}
	
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle v1 = new car();
		v1.start();
		


	}

}
