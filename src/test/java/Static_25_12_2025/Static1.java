package Static_25_12_2025;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	static public void Testing() {
		System.out.println("My id is " + id);
	}
	
	static public void NonTesting() {
		System.out.println("My name is " + name);
	}
	
	static public void Software() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.id=66;
		Static1.name="Coforge";
		Static1.salary=90000;
		
		Static1.Testing();
		Static1.NonTesting();
		Static1.Software();

	}

}
