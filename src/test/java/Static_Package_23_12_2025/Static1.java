package Static_Package_23_12_2025;

public class Static1 {
	
	static int id;
	static String name;
	static int salary;
	
	static void Axel() {
		System.out.println("My id is " + id);
	}
	
	static public void Access() {
		System.out.println("My name is " + name);
	}
	
	static public void ADO() {
		System.out.println("My salary is " + salary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1.id=88;
		Static1.name="Wipro";
		Static1.salary=90000;
		
		Static1.Access();
		Static1.ADO();
		Static1.Axel();

	}

}
